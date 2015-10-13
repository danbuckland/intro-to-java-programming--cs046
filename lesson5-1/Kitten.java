// Bluej project: lesson5/cuteness

public class Kitten
{
    private int months; // Age.
    
    public Kitten(int ageInMonths)
    {
        months = ageInMonths;
    }

    /**
     * Returns how cute a kitten is based on age.
     * Kittens can be "cute", "super cute", or "not so cute".
     * @return kittens below 2 months are not so cute. kittens
     *         above 6 months are cute. kittens between 2 and
     *         6 months (inclusive) are super cute.
     */
    public String getCuteness()
    {
        if (months < 2) return "not so cute";
        if (months > 6) return "cute";
        return "super cute";
    }
}

