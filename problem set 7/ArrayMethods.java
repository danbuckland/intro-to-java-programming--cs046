// Complete the methods below. These methods manipulate Arrays of Strings

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 7 - Question 1" for some tips on 
// how to begin.

import java.util.Arrays;

public class ArrayMethods
{
    String[] list; //instance variable
    int currentSize;
    
    /**
     * Constructor for objects of class ArrayMethods
     */
    public ArrayMethods(String[] list)
    {
        // initialise instance variables
        this.list = list;
        currentSize = list.length;
    }

    /**
     * Determines if the array is sorted (do not sort)
     * When Strings are sorted, they are in alphabetical order
     * Use the compareTo method to determine which string comes first
     * You can look at the String compareTo method in the Java API
     * @return true if the array  is sorted, else false.
     */
    public boolean isSorted()
    {
        int i = 1;
        boolean sorted = true;
        while (sorted && i < currentSize) {//supply condition
            if (list[i-1].compareTo(list[i]) > 0) {
                sorted = false;                   
            } else {
                ++i;
            }
        }
        // TODO: Write the code to loop through the array and determine that each
        // successive element is larger than the one before it
        return sorted;
    }

    /**
     * Replaces all but the first and last with the larger of its to neighbors
     * You can use the compareTo to determine which string is larger (later in alphabetical
     * order).
     */
    public void replaceWithLargerNeighbor()
    {
        for (int index = 1; index < currentSize - 1; ++index) {
            if (list[index-1].compareTo(list[index+1]) >= 0) list[index] = list[index-1];
            else list[index] = list[index+1];
        }
    }

    /**
     * Gets the number of duplicates in the array.
     * (Be careful to only count each duplicate once. Start at index 0. Does it match any of the other element?
     * Get the next word. It is at index i. Does it match any of the words with index > i?)
     * @return the number of duplicate words in the array.
     */
    public int countDuplicates()
    {
        int duplicates = 0;
        for (int index1 = 0; index1 < currentSize - 1; ++index1) {
            for (int index2 = index1 + 1; index2 < currentSize; ++index2) {
                if (list[index1] == list[index2]) ++duplicates;
            }
        }
        return duplicates;
    }

    private void add(int position, String value) {
        if (list.length == currentSize) list = Arrays.copyOf(list, 2 * currentSize);
        for (int i = currentSize; i > position; --i) {
            list[i] = list[i-1];
        }
        list[position] = value;
        ++currentSize;
    }
    
    private String remove(int position) {
        String removed = list[position];
        for (int i = position; i < currentSize - 1; ++i) {
            list[i] = list[i+1];
        }
        --currentSize;
        return removed;
    }
    /**
     * Moves any word that starts with x, y, or z to the front of the array, but
     * otherwise preserves the order
     */
    public void xyzToFront()
    {
        int insertAt = 0;
        for (int i = 0; i < currentSize; ++i) {
            char startsWith = list[i].charAt(0);
            if (startsWith == 'x' || startsWith == 'y' || startsWith == 'z' ) {
                String move = remove(i);
                add(insertAt, move);
                ++insertAt;
            }
        }
    }

    /**
     * gets the string representation of this array 
     * @return a string representation of the array. (do this with Arrays.toString(list))
     */
    public String toString()
    {
        return Arrays.toString(Arrays.copyOf(list, currentSize));
    }
}

