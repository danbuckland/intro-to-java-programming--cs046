// Bluej project: lesson5-2/vowels

public class Word
{
    private String letters;
    
    public Word(String letters) 
    {
        this.letters = letters.toLowerCase();
    }
    
    /** Checks whether the ith letter is a vowel.
     *  @return true if the ith letter is a vowel, false otherwise.
     */
    public boolean isVowel(int i)
    {
        // TODO your code here!
        // A little piece of code to get you started
        return letters.substring(i, i+1).equals("a")
        || letters.substring(i, i+1).equals("e")
        || letters.substring(i, i+1).equals("i")
        || letters.substring(i, i+1).equals("o")
        || letters.substring(i, i+1).equals("u");
    }
    
    /** Checks whether the ith letter is a consonant.
     *  @return true if the ith letter is a consonant, false otherwise.
     */
    public boolean isConsonant(int i)
    {
        return ! isVowel(i);
    }
}

