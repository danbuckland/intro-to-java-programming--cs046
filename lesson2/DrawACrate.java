// BlueJ project: lesson2/crate

// Draw a crate by combining a rectangle with five lines.
//
// The front face is a rectangle with top left corner (20, 30), 
// width 100, and height 40. 
//
// A diagonal line goes from the face's top left corner  to (50, 10). 
// Another diagonal line goes from the face's bottom right corner 
// to (150, 50).
// A third diagonal starts at the face's top right corner and is
// parallel to the others.
// The fourth and fifth line join the end points of the diagonals.
//
// Before programming, get out a pen and draw the crate on a
// sheet of paper! Label each of the points with their coordinates.
//
// Also, don't forget to call draw() on your rectangle and line objects.

public class DrawACrate
{
    public static void main(String[] args)
    {
        // dimensions
        int width = 100;
        int height = 40;

        // left front top
        int lftx = 20;
        int lfty = 30;
        
        // left back top 
        int lbtx = 50;
        int lbty = 10;
        
        // right back bottom
        int rbbx = 150;
        int rbby = 50;
        
        // right back top
        int rbtx = rbbx;
        int rbty = lbty;
        
        // right front bottom
        int rfbx = lftx + width; 
        int rfby = lfty + height;
        
        // right front top
        int rftx = rfbx;
        int rfty = lfty;
            
        Rectangle face = new Rectangle(20, 30, 100, 40);
        face.draw();
        Line line1 = new Line(lftx, lfty, lbtx, lbty);
        line1.draw();
        Line line2 = new Line(rfbx, rfby, rbbx, rbby);
        line2.draw();
        Line line3 = new Line(rftx, rfty, rbtx, rbty);
        line3.draw();
        Line line4 = new Line(lbtx, lbty, rbtx, rbty);
        line4.draw();
        Line line5 = new Line(rbtx, rbty, rbbx, rbby);
        line5.draw();
    }
}
