// Bluej project: lesson3/friends4
public class Person
{
    private String name;
    private String friends;
    private int x;
    private int y;
    // TODO Part 1: Create two additional instance int variables called x and y 
    // to store the values of xCoord and yCoord variables that are passed
    // into the Person constructor below
    //
    // For example:
    // private int x;

    public Person(String aName, String pictureName, int xCoord, int yCoord)
    {
        name = aName;
        friends = "";
        Picture picture = new Picture(pictureName);
        x = xCoord;
        y = yCoord;
        picture.translate(xCoord, yCoord);
        picture.draw();
        // TODO Part 2:
        // assign xCoord and yCoord to the x and y instance variables that you
        // created above
        //
        // For example (here's a freebie for you!):
        // x = xCoord;
    }
    
    public void addFriend(Person friend) 
    {
        friends = friends + friend.name + " ";
        
        // TOOD Part 3:
        // Here's the challenging part! Update the addFriend
        // method to:
        // 1) Draw a SmallCircle at x and y (where x and y are the instance variables of this object)
        // 2) Draw a line from the small circle to the x and y positions of the friend object
        //
        // Don't worry. I am here to walk you through this step
        //
        // To draw a small circle, first create a SmallCircle object. For example:
        SmallCircle circle = new SmallCircle(x, y);
        //
        // and the draw the circle by calling the fill() function. For example:
        circle.fill();
        //
        // Second, draw a line from the small circle above to 
        // the friend object that is passed into the addFriend function.
        //
        // For example:
        Line line = new Line(x, y, friend.x, friend.y);
        line.draw();
        //
        // HINTS:
        // a) startXPosition and startYPosition are the x and y position of this person object
        // b) endingXPosition and endingYPosition are the x and y position of the friend object
        // that is passed as a parameter to the addFriend method
        // c) You can retrieve the x and y position of the friend object like below:
        // friend.x;
        // friend.y;
    }
    
    public void unfriend(Person nonFriend)
    {
        friends = friends.replace(nonFriend.name + " ", "");
    }
    
    public String getFriends() 
    {
        return friends;
    }
}
