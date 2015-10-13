// Bluej project: lesson6/average
// Write a program that helps a user compute their average time
// for sprinting 100 meters.

import java.util.Scanner;

public class AverageDemo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int count = 0;
        double sum = 0;

        double value = 0.0;
        do {
            System.out.print("Enter a value, 0 to quit: ");
            if (in.hasNextDouble()) {
                value = in.nextDouble();
                if (value != 0) {
                    ++count;
                    sum += (double) value;
                }
            } else {
                in.next();
            }
        } while (value != 0.0);    
        // TODO: Collect values from the user until they enter a 0.
        // Track the sum of all the inputs so you can calculate the
        // average at the end

        double average = sum / count;
        System.out.printf("Average: %.2f\n", average);
    }
}

