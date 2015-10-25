// Complete the given class to display the picture object vertically
// (rather than horizontally).
// You can find the pictures required in the bluej project
// Place the first picture so that the top of the picture is 10 pixels below 
// the top of the canvas and put 10 pixels between the pictures

import java.util.ArrayList;

public class ListOfVerticalPictures
{
    public static void main(String[] args)
    {
        ArrayList<Picture> gallery = new ArrayList<Picture>();
        gallery.add(new Picture("degas1.jpg"));
        gallery.add(new Picture("gaugin1.jpg"));
        gallery.add(new Picture("monet1.jpg"));
        gallery.add(new Picture("monet2.jpg"));
        gallery.add(new Picture("renoir1.jpg"));

        // TODO Write the code to display the pictures vertically
        int offset = 0;
        for (Picture pic : gallery)
        {        
            pic.translate(0, offset + 10);
            offset = pic.getMaxY();
            pic.draw();
        }
    }
}

