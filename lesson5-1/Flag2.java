// Bluej project: lesson5/frenchFlag

public class Flag
{
    private Picture pic;
    private int width;
    private int height;

    // This constructor creates and draws a flag object.
    // You don't need to change this.
    public Flag(int width, int height)
    {
        this.width = width;
        this.height = height;
        pic = new Picture(width, height);
        pic.draw();
        for (int x = 0; x < width; x++)
        {
            for (int y = 0; y < height; y++)
            {
                Color c = getColorAt(x, y);
                pic.setColorAt(x, y, c);
            }
        }
    }

    public Color getColorAt(int x, int y)
    {
        // TODO: add correct conditions between the parentheses to determine
        // which color needs to be used at any (x, y) coordinate.  Remember, if
        // the condition of the first if statement is true, the "else if" condition
        // is never tested.
        // TODO: set the variable c to that color
        Color c;
        if (x < width / 3)
        {
            c = Color.BLUE;
        }
        else if (x < 2 * width / 3)
        {
            c = Color.WHITE;
        }
        else
        {
            c = Color.RED;
        }
        return c;
    }
}

