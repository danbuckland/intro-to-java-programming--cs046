//Write a class Month.

//A Month has a constructor that takes the month number as a parameter (1 for January,
//2 for February and so forth):
//   public Month(int monthNumber)
//If monthNumber is not 1 to 12, set it to 1.  (This final case you can think of as
//a kind of safeguard against someone using your Month class incorrectly: even if
//someone passes a bad number to your constructor, it will still make a valid month.
//You will make a separate safeguard in your MonthPrinter class to reject bad user
//inputs, but making your code as resiliant as possible to incorrect usage is good
//practice as a programmer!)

//The Month class has 2 methods:
//   public String getMonthName() Use if / else if /else if ...
//   public int getNumberOfDays() Do NOT use a separate if / else branch for each month. 
//Use Boolean operators (&&, ||, !). You will have an if then else if then else
//For February return 28

//These are implemented for you as stubs

//Now write a class MonthPrinter which will instantiate a Month object, ask the user
//for a month number and print the name of the month and the number or days.

//If the month is 6, the output should look exactly like this:
//June 30

//If the user enters an invalid month number print this error message: 
//"Number must be 1 through 12"
//(We include this even though our Month constructor will gracefully handle improper
//inputs.  Using multiple safeguards against incorrect usage is a good idea!)

//If the user enters a non-integer, give this error message: 
//"Not an integer. Terminating"

//To be considered correct, you must enter the message exactly as specified, so be
//careful with the strings you print.

/**
 * Exercises the methods in the Month class
 */
import java.util.Scanner;
public class Month2Printer
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);

       System.out.print("Enter a month number (1 through 12) " );
       
       if (! in.hasNextInt()) {
           System.out.println("Not an integer. Terminating");
           return;
       }
       
       int monthNr = in.nextInt();
       if (monthNr < 1 || monthNr > 12) {
           System.out.println("Number must be 1 through 12");
           return;
       }

       Month2 month = new Month2(monthNr);
       System.out.println(month.getMonthName() + " " + month.getNumberOfDays());
       
       //your code here


   }
}
