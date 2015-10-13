// BlueJ project: lesson4/sunsetInput
// Video: Color Your Own Sunset Effect

// TODO: Add import statement
import java.util.Scanner;

public class Sunset
{
    public static void main(String[] args)
    {
        Picture pic = new Picture();
        pic.load("queen-mary.png");

        System.out.print("Added redness: ");
        Scanner in = new Scanner(System.in);
        int addedRed = in.nextInt();

        pic.draw();
        for (int i = 0; i < pic.pixels(); i++)
        {
            Color c = pic.getColorAt(i);
            c.redden(addedRed);
            pic.setColorAt(i, c);
        }
    }
}

