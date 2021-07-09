package Week2LabBook;
import java.util.Scanner;
public class PrintANumber {
	/**
    2. Java Program to Print an Integer (Entered by the User)
       In this program, you'll learn to print a number entered 
       by the user in Java. The integer is stored in a variable
       using System.in, and is displayed on the screen using
       System.out.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Creates a reader instance which takes
	    // input from standard input - keyboard
	 Scanner reader = new Scanner(System.in);
	 System.out.print("Enter a number: ");
	   // nextInt() reads the next integer from the keyboard
     int number = reader.nextInt();
	   // println() prints the following line to the output screen
	 System.out.println("You entered: " + number);
   }

}