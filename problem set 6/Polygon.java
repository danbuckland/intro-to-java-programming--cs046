//Create a Polygon class. A polygon is a closed shape with lines joining the corner points.
//You will keep the points in an array list. Use object of java.awt.Point for the point.

//Polygon will have as an instance variable an ArrayList of Points to hold the points
//The constructor takes no parameters but initializes the instance variable.  The
//Polygon class also has the following methods:
//    add: adds a Point to the polygon
//    perimeter: returns the perimeter of the polygon
//    draw: draws the polygon by connecting consecutive points and then
//          connecting the last point to the first.
//
//No methods headers or javadoc is provided this time. You get to try your hand at writing
//a class almost from scratch

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 6 - Question 3" for some tips on 
// how to begin.

import java.util.ArrayList;
import java.awt.Point;

public class Polygon
{
    // TODO: provide the required constructor, instance variable, and methods
    private ArrayList<Point> points;

    public Polygon() {
        points = new ArrayList<Point>();
    }
    //    add: adds a Point to the polygon
    
    public void add(Point point) {
        points.add(point);
    }

    private double calcLength(Point a, Point b) {
        double width = (double) a.getX() - (double) b.getX();
        double length = (double) a.getY() - (double) b.getY();
        return Math.sqrt(width * width + length * length);
    }
    
    public double perimeter() {
        double total = 0.0;
        // every line from start to end
        for (int i = 1; i < points.size(); ++i) {
            Point prev = points.get(i - 1);
            Point current = points.get(i);
            total += calcLength(prev, current);
        }
        // add line from end to start
        Point end = points.get(points.size() - 1);
        Point start = points.get(0);
        total += calcLength(end, start);
        return total;
    }
    
    private void drawLine(Point a, Point b) {
        Line line = new Line(a.getX(), a.getY(), b.getX(), b.getY());
        line.draw();
    }
    
    public void draw() {
        // every line from start to end
        for (int i = 1; i < points.size(); ++i) {
            Point prev = points.get(i - 1);
            Point current = points.get(i);
            drawLine(prev, current);
        }
        
        // add line from end to start
        Point end = points.get(points.size() - 1);
        Point start = points.get(0);
        drawLine(end, start);
    }
}

