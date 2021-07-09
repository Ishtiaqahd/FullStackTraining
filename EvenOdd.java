package Week2LabBook;
import java.util.Scanner;
public class EvenOdd {
	/**
     10. Check whether a given number is ODD or EVEN ?
	**/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner reader = new Scanner(System.in);
	 System.out.print("Enter a number: ");
	 int num = reader.nextInt();
	 if(num % 2 == 0)
	  System.out.println(num + " is even");
	 else
	  System.out.println(num + " is odd");
	}
}
