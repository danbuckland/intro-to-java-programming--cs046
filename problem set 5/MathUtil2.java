// Complete this method to read integer scores from the user and find the average
// Stop asking for input when the user enters a negative number.
// Keep a running total and keep track of the number of entries,
// then find and return the average

// Be sure not to divide by 0. Return 0 if no scores are entered

import java.util.Scanner;

public class MathUtil
{
    public double averageScore()
    {
        Scanner in = new Scanner(System.in);
        int total = 0;
        int number = 0;
        int input = 0;
        do {
            //TODO Find and return the average of the numbers entered.
            System.out.print("Enter a score. -1 to quit: "); //use this for the prompt
            if (in.hasNextInt()) {
                input = in.nextInt();
                if (input < 0) break;
                ++number;
                total += input;
            }
        } while (true);
        if (number == 0) return 0.0;
        double average = (double) total / (double) number;
        return average;
    }
}

