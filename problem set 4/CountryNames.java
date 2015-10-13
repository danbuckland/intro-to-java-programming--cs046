//Country names in French are feminine when they end with the letter e,
//masculine otherwise, except for the following which are masculine
//even though they end with e:

//le Belize
//le Cambodge
//le Mexique
//le Mozambique
//le Zaire
//le Zimbabwe


//Complete the method getCompleteName in the class CountryNames.
//getCompleteName takes the French name of a country as a parameter
//and adds the article: le for masculine or la for feminine,
//such as le Canada or la Belgique. However, if the country name starts
//with a vowel, use l'; for example, l'Afghanistan.
//

//For the following plural country names, use les:
//les Etats-Unis
//les Pays-Bas
//

//Here is a URL that gives English and French names for countries:
//http://www.btb.gc.ca/btb.php?lang=eng&cont=690

//Use helper methods to simplify your code and make it easier to read.

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 4 - Question 2" for some tips on 
// how to begin.

public class CountryNames
{
    
    private boolean is(String c, String v) {
        return c.equalsIgnoreCase(v);
    }

    private boolean isVowel(String c) {
        return is(c, "a") || is(c, "e") || is(c, "i") || is(c, "o") || is(c, "u");
    }

    /**
     * Gets the name with the proper article
     * @param name the country name
     * @return the name prepended with the proper article
     */
    public String getCompleteName(String name)
    {
        int length = name.length();
        String lastLetter = name.substring(length-1, length);
        boolean isFemine = is(lastLetter, "e");
        boolean isShortForm = isVowel(name.substring(0, 1));

        String article = "";

        if (isShortForm) {
            article = "l'";
        } else {
            if (isFemine) {
                article = "la ";
            } else {
                article = "le ";
            }
        }
                                      
        if (name == "Belize" || 
            name == "Cambodge" ||
            name == "Mexique" ||
            name == "Mozambique" ||
            name == "Zaire" ||
            name == "Zimbabwe") {
            article = "le ";
        }

        if (name == "Etats-Unis" ||
            name == "Pays-Bas") {
            article = "les ";
        }
        
        return article + name;
        
    }

}

