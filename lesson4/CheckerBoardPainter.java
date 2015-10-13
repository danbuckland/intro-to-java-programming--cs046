public class CheckerBoardPainter
{
    /**
     * Spaces are red if one of the coordinates is even and the other is odd
     * Spaces are blue if both coordinates are even
     * Spaces are blue if both coordinates are odd
     * 
     * @return 1 for red spaces and 0 for blue
     * @param row the row of the space to paint
     * @param col the column of the space to paint. 
     */
    private boolean odd(int x) 
    {
        return x % 2 == 1;
    }
    private boolean even(int x) 
    {
        return x % 2 == 0;
    }
    public int getColor(int row, int col)
    {
        if (odd(row)  && even(col)) return 1;
        if (even(row) && odd(col))  return 1;
        return 0;
    }
}

