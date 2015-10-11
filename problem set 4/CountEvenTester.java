/**
 * Complete the class. Using a Scanner, ask the user to enter a series of integers with 
 * the following string "Enter an integer" and count the number of even numbers
 * Use a loop. Do not let bad input (a non-integer) terminate your program with an error.
 * When the user enters any non-integer, print the number of even integers entered and quit.
 * Hint: remember hasNextInt()
 * Hint: use the % operator to determine if a number is even
 */
import java.util.Scanner;
public class CountEvenTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int input;
        int evenNumbers = 0;
        while (true) {
            System.out.print("Enter an integer: ");
            if (!in.hasNextInt()) break;
            input = in.nextInt();
            if (input % 2 == 0) evenNumbers++;
        }
        System.out.println(evenNumbers);
        //your code goes here
    }
}
