// Write the code to draw a tower of blocks that looks like the one in the link below:
// http://i.imgur.com/PvIGJkL.png
    
// Name the class BlockTower. Each block has a width of 40 and a height of 30. 
// There are three rows. The upper left-hand corner of the bottom row is at (20, 70)

// Create a custom color for the topmost color where red = 125, green=125, blue = 255. 
// For all the other colors, use predefined colors. 
// The colors from top to bottom are: custom, RED, PINK, BLUE, MAGENTA, CYAN


// HINT:
// The bottom left rectangle should have the attributes:
// x: 20
// y: 70
// width: 40
// height: 30
//
// You should set the color of the rectangle to blue by using the method:
// setColor(Color.somecolor); on the rectangle object that you created
//
// Don't forget to draw the rectangle by calling the fill() function




public class BlockTower
{
    public static void main(String[] args)
    {
        //TODO finish the draft to display the six blocks
        int x = 20;
        int y = 70;
        int w = 40;
        int h = 30;
        
        Rectangle r11 = new Rectangle(x, y, w, h);
        r11.setColor(Color.BLUE);
        r11.fill();
        Rectangle r12 = new Rectangle(x+w, y, w, h);
        r12.setColor(Color.MAGENTA);
        r12.fill();
        Rectangle r13 = new Rectangle(x+w+w, y, w, h);
        r13.setColor(Color.CYAN);
        r13.fill();

        Rectangle r21 = new Rectangle(x+w/2, y-h, w, h);
        r21.setColor(Color.RED);
        r21.fill();
        Rectangle r22 = new Rectangle(x+w/2+w, y-h, w, h);
        r22.setColor(Color.PINK);
        r22.fill();

        Rectangle r3 = new Rectangle(x+w, y-h-h, w, h);
        r3.setColor(new Color(125, 125, 255));
        r3.fill();
    }
}
