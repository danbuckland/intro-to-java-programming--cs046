//Write a class called MinMaxPrinter. Using a Scanner, ask the user to enter
//a series of integers and find the maximum and the minimum value.
//Use a loop.

//Do not let bad input (a non-integer) terminate your program with an error.
//When the user enters any non-integer, print the maximum and minimun values
//on separate line and quit.

//If the numbers entered are 5 10 3 8 1, 2 9, the output will be

//10
//1

//HINT: remember hasNextInt()
//HINT: initialize max to Integer.MIN_INTEGER rather than to 0 and min to 
// Integer.MAX_INTEGER before the loop.

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 4 - Question 3" for some tips on 
// how to begin.

import java.util.Scanner;

public class MaxMinPrinter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Enter an integer: ");
            if (in.hasNextInt()) {
                int input = in.nextInt();
                if (input > max) max = input;
                if (input < min) min = input;                
            } else {
                break;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}

