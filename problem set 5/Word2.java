//Create a class Word. Word has a constructor that takes a string argument
//and one method getSubstrings which returns a String containing
//all substring of word, sorted by length.

//For example, if the user provides the input "rum", the method returns a
//string that will print like this
//r
//u
//m
//ru
//um
//rum


//You can concatenate the substrings in a String, separating them with a newline
//("\n"). Then return the string

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 5 - Question 3" for some tips on 
// how to begin.

public class Word
{
    private String word;
    //TODO write the constructor and define the instance variable
    public Word(String word) {
        this.word = word;
    }
    /**
     * Gets all the substrings of this Word.
     * @return all substrings of this Word separated by newline
     */
    public String getSubstrings()
    {
        String result = "";
        for (int len = 1; len <= word.length(); ++len) {
            for (int i = 0; i + len - 1 < word.length(); ++i) {
                result += word.substring(i, i + len) + "\n";
            }
        }    
        return result;
        //TODO implement this method
    }
}


