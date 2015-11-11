import java.util.Random;

public class MyAgent extends Agent
{
    Random r;

    /**
     * Constructs a new agent, giving it the game and telling it whether it is Red or Yellow.
     * 
     * @param game The game the agent will be playing.
     * @param iAmRed True if the agent is Red, False if the agent is Yellow.
     */
    public MyAgent(Connect4Game game, boolean iAmRed)
    {
        super(game, iAmRed);
        r = new Random();
    }

    /**
     * The move method is run every time it is this agent's turn in the game. You may assume that
     * when move() is called, the game has at least one open slot for a token, and the game has not
     * already been won.
     * 
     * By the end of the move method, the agent should have placed one token into the game at some
     * point.
     * 
     * After the move() method is called, the game engine will check to make sure the move was
     * valid. A move might be invalid if:
     * - No token was place into the game.
     * - More than one token was placed into the game.
     * - A previous token was removed from the game.
     * - The color of a previous token was changed.
     * - There are empty spaces below where the token was placed.
     * 
     * If an invalid move is made, the game engine will announce it and the game will be ended.
     * 
     */
    public void move()
    {
        int columnNumber;

        // check if i can win
        columnNumber = iCanWin();
        if (columnNumber == -1) {
            // i can not win, check if opponent is close to winning
            columnNumber = theyCanWin();
            if (columnNumber == -1) {
                // TODO stay close to the opponent
                // TODO find a position with the most Slots filled with tokens from your opponent
                // they can not win either, let do some random move
                columnNumber = randomMove();
            }
        }
        moveOnColumn(columnNumber);
    }

    /**
     * Drops a token into a particular column so that it will fall to the bottom of the column.
     * If the column is already full, nothing will change.
     * 
     * @param columnNumber The column into which to drop the token.
     */
    public void moveOnColumn(int columnNumber)
    {
        int lowestEmptySlotIndex = getLowestEmptyIndex(myGame.getColumn(columnNumber));   // Find the top empty slot in the column
                                                                                                  // If the column is full, lowestEmptySlot will be -1
        if (lowestEmptySlotIndex > -1)  // if the column is not full
        {
            Connect4Slot lowestEmptySlot = myGame.getColumn(columnNumber).getSlot(lowestEmptySlotIndex);  // get the slot in this column at this index
            if (iAmRed) // If the current agent is the Red player...
            {
                lowestEmptySlot.addRed(); // Place a red token into the empty slot
            }
            else // If the current agent is the Yellow player (not the Red player)...
            {
                lowestEmptySlot.addYellow(); // Place a yellow token into the empty slot
            }
        }
    }

    /**
     * Returns the index of the top empty slot in a particular column.
     * 
     * @param column The column to check.
     * @return the index of the top empty slot in a particular column; -1 if the column is already full.
     */
    public int getLowestEmptyIndex(Connect4Column column) {
        int lowestEmptySlot = -1;
        for  (int i = 0; i < column.getRowCount(); i++)
        {
            if (!column.getSlot(i).getIsFilled())
            {
                lowestEmptySlot = i;
            }
        }
        return lowestEmptySlot;
    }

    /**
     * Returns a random valid move. If your agent doesn't know what to do, making a random move
     * can allow the game to go on anyway.
     * 
     * @return a random valid move.
     */
    public int randomMove()
    {
        int i = r.nextInt(myGame.getColumnCount());
        while (getLowestEmptyIndex(myGame.getColumn(i)) == -1)
        {
            i = r.nextInt(myGame.getColumnCount());
        }
        return i;
    }

    /**
     * Returns the column that would allow a player to win.
     * 
     * @return the column that would allow a player to win.
     */
    public int check4Slots(char[][] board, int row, int column, int rowInc, int columnInc, boolean side) {
        char myColor = side ? 'R' : 'Y';
        char theirColor = side ? 'Y' : 'R';

        int emptyRow = -1;
        int emptyColumn = -1;
        for (int i = 0; i < 4; ++i) {
            int rowNow = row + i * rowInc;
            int columnNow = column + i * columnInc;
            char colorNow = board[rowNow][columnNow];
            if (colorNow == theirColor) {
                // opponent color in this row? can't win
                return -1;
            } else if (colorNow == 'B') {
                // 2 blanks or more? no change of winning
                if (emptyRow != -1) return -1;
                emptyRow = rowNow;
                emptyColumn = columnNow;
            }
        }
        if (emptyRow == -1) return -1;
        if (getLowestEmptyIndex(myGame.getColumn(emptyColumn)) == emptyRow) {
            return emptyColumn;
        }
        return -1; 
    }
    
    /**
     * Returns the column that would allow a player to win.
     * 
     * @return the column that would allow a player to win.
     */
    public int columnToWin(boolean side)
    {
        char[][] board = myGame.getBoardMatrix();
        int result = -1;
        
        for (int column = 0; column < myGame.getColumnCount(); column++) {
            for (int row = 0; row < myGame.getRowCount(); row++) {
                // top to bottom (column = constant)
                if (row + 3 < myGame.getRowCount()) {
                    result = check4Slots(board, row, column, 1, 0, side);
                }
                // left to right (row = constant)
                if (column + 3 < myGame.getColumnCount()) {
                    result = check4Slots(board, row, column, 0, 1, side);
                }
                // upperleft to lowerright
                if (column + 3 < myGame.getColumnCount() && row + 3 < myGame.getRowCount()) {
                    result = check4Slots(board, row, column, 1, 1, side);
                }
                // upperright to lowerleft
                if (column > 2 && row + 3 < myGame.getRowCount()) {
                    result = check4Slots(board, row, column, 1, -1, side);
                }
                if (result != -1) return result;
            }
        }

        return -1;
    }
    
    /**
     * Returns the column that would allow the agent to win.
     * 
     * You might want your agent to check to see if it has a winning move available to it so that
     * it can go ahead and make that move. Implement this method to return what column would
     * allow the agent to win.
     *
     * @return the column that would allow the agent to win.
     */
    public int iCanWin()
    {
        return columnToWin(iAmRed);
    }

    /**
     * Returns the column that would allow the opponent to win.
     * 
     * You might want your agent to check to see if the opponent would have any winning moves
     * available so your agent can block them. Implement this method to return what column should
     * be blocked to prevent the opponent from winning.
     *
     * @return the column that would allow the opponent to win.
     */
    public int theyCanWin()
    {
        return columnToWin(!iAmRed);
    }

    /**
     * Returns the name of this agent.
     *
     * @return the agent's name
     */
    public String getName()
    {
        return "My Agent";
    }
}
