// BlueJ Project: lesson4/book7
// Video: Working with the Book Text
    
import java.util.Scanner;
import java.io.File;
public class LookUpAnyWord
{
    public static int occurrencesOfWord(String bookText, String word)
    {
        int length = bookText.length();
        int lengthWithoutWord = bookText.replace(word, "").length();
        return (length - lengthWithoutWord) / word.length();
    }

    public static void main(String[] args)
    {
        System.out.print("Type a word and I'll tell you how many times it appears: ");
        // TODO: Create an scanner object to read the user input
        // Read a word from the scanner and assign it to a String variable named word
        Scanner in = new Scanner(System.in);
        String word = in.next();
        
        // TODO: Create a book object that reads from aliceInWonderland.txt
        String bookText = "";
        try
        {
            Scanner file = new Scanner(new File("aliceInWonderland.txt"));
            while (file.hasNextLine())
            {
                String line = file.nextLine();
                bookText += line + "\n";
            }
            file.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        // TODO: Find the number of occurences of that word and assign it to a variable named occurences
        int occurrences = occurrencesOfWord(bookText, word);
        System.out.println(word + " occurs " + occurrences + " times!");
    }
}

