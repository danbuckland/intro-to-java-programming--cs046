/**
 * The main driver of the program. This file will create the game, create the two agents,
 * and create the window for the game. After that, Connect4Frame runs everything.
 *
 * You should only modify this class to change which agents are playing.
 */
public class Main {
    public static void main(String[] args) {
        Connect4Game game = new Connect4Game(7, 6); // create the game; these sizes can be altered for larger or smaller
                                                    // games

        // create the red player, any subclass of Agent
        // Agent redPlayer = new RandomAgent(game, true);
        Agent redPlayer = new MyAgent(game, true);
        // Agent yellowPlayer = new MyTestAgent(game, false);

        // create the yellow player, any subclass of Agent
        // Agent yellowPlayer = new RandomAgent(game, false);
        // Agent yellowPlayer = new BeginnerAgent(game, false);
        // Agent yellowPlayer = new IntermediateAgent(game, false);
        // Agent yellowPlayer = new AdvancedAgent(game, false);
        Agent yellowPlayer = new BrilliantAgent(game, false);

        Connect4Frame mainframe = new Connect4Frame(game, redPlayer, yellowPlayer); // create the game window
    }
}
