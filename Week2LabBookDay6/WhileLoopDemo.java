package Week2LabBookDay6;

import java.util.Scanner;

public class WhileLoopDemo {
	/**
	 13. While Loop Demonstration
	**/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int number, sum = 0;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("n Please Enter any integer Value below 10: ");
	 number = sc.nextInt();
	 while (number <= 10) {
		 System.out.println(" Sum of the Numbers From the While Loop is: %d "+ sum);
	  sum = sum + number;
	  number++;
		//  sum += number++;
	 }
	  System.out.format(" Sum of the Numbers From the While Loop is: %d ", sum);
	 // System.out.println(" Sum of the Numbers From the While Loop is: %d "+ sum);
	}
}
