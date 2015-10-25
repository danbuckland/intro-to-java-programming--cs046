// Complete the method in this class to print the length of each string
// all on one line separated by spaces.

import java.util.ArrayList;

public class ArrayListUtil
{
    /**
     * prints length of each string in the arraylist all on one line
     * @param text the array list to process
     */
     public void getLengths(ArrayList<String> text)
     {
         // TODO: Use a loop to print the length of each string all on one line
         // separated by spaces
         for (int i = 0; i < text.size(); ++i) {
             int len = text.get(i).length();
             if (i == 0) {
                 System.out.print(len);
             } else {
                 System.out.print(" " + len);
             }
         }
     }
}

