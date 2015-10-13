// Bluej project: twitter
//  TODO: Write code for the shorten(String longPost) method.
public class Twitterizer
{
    /**
     * Shortens and returns long posts by removing vowels
     * @param longPost the post whos vowels need to be removed
     * @return a version of the post without vowels
     */
    public String shorten(String longPost)
    {
        return longPost.replaceAll("[aeiouAEIOU]", "");
    }
}

