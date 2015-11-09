//In Spanish, nouns that end with "a" are feminine while words that end in "o" are masculine.
//(We will ignore exceptions in this exercise). Feminine nouns are preceded by the article
//"la" while maculine words are preceded by the article "el"
//You are to complete the method fixNoun in the SpanishWord class so
//that it returns the noun preceded by:
//  "la " if the noun ends in "a",
//  "el " if it ends in "o"
//  "? " if it ends in some other letter.

//Examples:
//fixNoun(cara) returns: la cara
//fixNoun(ojo) returns: el ojo
//fixNoun(nariz) returns: ? nariz

//(Notice the space between the la and cara, el and ojo, and ? and nariz)

//Hint: Think about how to get the last character of a String and then think about how
// to compare strings

//If you are a Spanish speaker, please ignore any error in this simplified explanation.
//and just follow the directions to return the required string.

public class SpanishNouns
{
    /**
     * Gets the noun with the proper article
     * @param noun the word to fix
     * @return the string with the proper article if the name ends in "a" or "o"
     * otherwise preceded by "? "
     */
    public String fixNoun(String noun)
    {
        //your code here
        char lastChar = noun.charAt(noun.length() - 1);
        if (lastChar == 'a') return "la " + noun;
        else if (lastChar == 'o') return "el " + noun;
        return "? " + noun;
    }
}

