package Week2LabBookDay6;

import java.util.Scanner;
public class FindAreaOfSquare {
	/**
	 18. Area of a Square
	**/
	public static void main(String[] args) {
	 System.out.println("Enter Side of Square:");
		//Capture the user's input
	Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		//Storing the captured value in a variable
	double side = scanner.nextDouble();
		//Area of Square = side*side
	double area = side*side;
	System.out.println("Area of Square is: "+area);
	}
}
