// Complete the given class to shift the first picture (the one at index 0)
// to the end of the array list and  display the pictures object in the modified list
// horizontally as was done in the lesson.  Put 10 pixels between pictures.  The first
// picture should be 10 pixels from the left edge of the screen as well.
// You can find the pictures required in in the bluej project

import java.util.ArrayList;

public class ShiftFirstToEnd
{
    public static void main(String[] args)
    {
        ArrayList<Picture> gallery = new ArrayList<Picture>();
        gallery.add(new Picture("degas1.jpg"));
        gallery.add(new Picture("gaugin1.jpg"));
        gallery.add(new Picture("monet1.jpg"));
        gallery.add(new Picture("monet2.jpg"));
        gallery.add(new Picture("renoir1.jpg"));

        // TODO Write code to shift the first picture (the one at index 0)
        // to the end of the array list and  display the pictures object in the modified
        // list horizontally.  Put 10 pixels between pictures.  The first picture should
        // be 10 pixels from the left edge of the screen as well.
        gallery.add(gallery.remove(0));

        int offset = 0;
        for (Picture pic : gallery)
        {        
            pic.translate(offset + 10, 0);
            offset = pic.getMaxX();
            pic.draw();
        }
    }
}

