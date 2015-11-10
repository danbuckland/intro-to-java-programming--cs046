//
// RectangleList class manages a list of Rectangles from the graphics package
// you have used this semester

// RectangleList has a no-argument constructor that simply initializes the
// instance variable
// It has a method to add Rectangles to the list
//These are provided for you
//
// It has a method to return the Rectangle with the largest perimeter
// (or null if the list is empty)
//You are to complete the largestPerimeter method.
//
// perimeter = 2 * (width + height)
//
// This class uses the Rectangle class from the graphics package. It has
// getWidth() and getHeight() methods
//
// There is a tester included to help you test your code.
//
//
import java.util.ArrayList;

public class RectangleList
{
    // private instance variables
    ArrayList<Rectangle> list;

    /**
     * Constructs a Rectangle list to manage a list of Rectangles
     */
    public RectangleList()
    {
        list = new ArrayList<Rectangle>();;
    }

    /**
     *
     * Adds a Rectangle to the list
     * @param r the rectangle to add
     */
    public void add(Rectangle r)
    {
        list.add(r);
    }

    /**
     * Gets the Rectangle with the largest perimeter
     * @return the rectangle with the largest perimeter or null if
     * there are no rectangles
     *
     */
    public Rectangle largestPerimeter()
    {
        if (list.size() == 0) return null;
        Rectangle maxRectangle = list.get(0);
        double maxPerimeter = 2.0 * (maxRectangle.getWidth() + maxRectangle.getHeight());
        for (int i = 1; i < list.size(); ++i) {
            Rectangle rectangleNow = list.get(i);
            double perimeterNow = 2.0 * (rectangleNow.getWidth() + rectangleNow.getHeight());
            if (perimeterNow > maxPerimeter) {
                maxRectangle = rectangleNow;
                maxPerimeter = perimeterNow;
            }
        }
        return maxRectangle;
    }
}
// RectangleList class manages a list of Rectangles
// It has a constructor that takes an array list of Rectangles as a parameter.
// It has a method to return the Rectangle with the smallest area
// (or null if the list is empty)
//
// The class is started for you. You are to complete the class.
//
// This class uses the Rectangle class from the graphics package.
// It has the getWidth() and getHeight() methods
//
// There is a tester included to help you test your code.

import java.util.ArrayList;

public class RectangleList
{
    // private instance variables
    ArrayList<Rectangle> list = new ArrayList<Rectangle>();

   /**
    * Constructs a Rectangle list to manage this list of Rectangles
    * @param theList the lest of Rectangles to manage
    */
    public RectangleList(ArrayList<Rectangle> theList)
    {
        list = theList;
    }

   /**
    * Gets the Rectangle with the smallest area
    * @return the rectangle with the smallest area or null if
    * there are no rectangles
    *
    */
    public Rectangle smallestArea()
    {
        //TODO: implement this method
        if (list.size() == 0) return null;
        Rectangle smallest = list.get(0);
        double smallestAreaUntilNow = list.get(0).getWidth() * list.get(0).getHeight();
        for (int i = 1; i < list.size(); ++i) {
            Rectangle now = list.get(i);
            double areaNow = now.getWidth() * now.getHeight();
            if (areaNow < smallestAreaUntilNow) {
                smallestAreaUntilNow = areaNow;
                smallest = now;
            }
        }
        return smallest;
    }

}

