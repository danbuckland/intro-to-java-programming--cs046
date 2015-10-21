//Complete the method to return the number of non-vowels in the parameter
//Assume the vowels are  a,e,i,o,u or A, E, I, O, U

public class Word
{
    /**
     * Gets the number of non-vowels in the parameter
     * @param word the string to count the non-vowels in
     * @return the number of non-vowels in the word
     */
    public int nonVowelCount(String word)
    {
        word = word.toLowerCase();
        int nonVowels = 0;
        for (int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') continue;
            ++nonVowels;
        }        
        return nonVowels;
        //TODO Write the code to return the number of non-vowels
    }
}

