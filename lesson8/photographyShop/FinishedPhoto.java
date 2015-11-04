// Optional
// Does your design use FinishedPhoto objects?
// If so, fill in this class with your code.

public class FinishedPhoto
{
    private String description;
    private Picture picture;
    private String photographerName;
    
    public FinishedPhoto(String description, String picture, String photographerName) {
        this.description = description;
        this.picture = new Picture(picture);
        this.photographerName = photographerName;
    }
    
    public String getDescription() {
        return description;
    }

    public Picture getPicture() {
        return picture;
    }
    
    public String getPhotographerName() {
        return photographerName;
    }
}
