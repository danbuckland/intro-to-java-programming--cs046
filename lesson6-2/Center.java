// BlueJ project: lesson6/telescope

// Your task is to color all pixels black that are outside the
// telescope circle. The center and radius of the circle are
// given below.

// For each point, find out the distance to the center and
// check if it is larger than the radius.  The basic structure
// of the nested for loops is provided for you.

// Hint: The distance between two points (x1, y1) and (x2, y2) is
// Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2))

public class Center
{
    public static void main(String[] args)
    {
        Picture pic = new Picture();
        pic.load("queen-mary.png");
        pic.draw();

        double centerX = pic.getWidth() / 2;
        double centerY = pic.getHeight() / 2;
        double radius = pic.getHeight() / 4;

        for (int x = 0; x < pic.getWidth(); ++x)
        {
            double xLen = (double)(x - centerX);
            for (int y = 0; y < pic.getHeight(); ++y)
            {
                double yLen = (double)(y - centerY);
                double distance = Math.sqrt(xLen * xLen + yLen * yLen);
                if (distance > radius)
                {
                    pic.setColorAt(x, y, Color.BLACK);
                }
            }
        }
    }
}

