// TODO Write code to get a number in the range of 1 to 10
// HINT: You need to use a do while loop.
// HINT: You will need to create a Scanner object to read input from the user.

import java.util.Scanner;

public class InputWithDo
{
    /*
     * Gets a number betwwen 1 and 10 (inclusive) from the user
     * @return user input between 1 and 10 (inclusive)
     */
    public int getValidInput()
    {
        Scanner in = new Scanner(System.in);
        int input = 0;
        do {
            System.out.print("Enter an integer >=1 and <=10: ");
            if (in.hasNextInt()) {
                input = in.nextInt();
            }
        } while (input < 1 || input > 10);
        return input;

        //TODO Write code to get a number in the range of 1 to 10
        // System.out.print("Enter an integer >=1 and <=10: "); //use this for the prompt

    }
}

