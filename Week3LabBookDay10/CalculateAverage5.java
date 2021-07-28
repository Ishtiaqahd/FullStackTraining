package Week3LabBookDay10;
 /**
  * 5. Write a program to calculate average of the n number using a
       separate function other than main.
       The average is the outcome from the sum of the numbers 
       divided by the count of the numbers being averaged.
	     For example: 1,2,3,4,5
     Number of all elements = 5
     Sum of all elements = 1+2+3+4+5 =15     
     Average = Sum of all elements / number of all elements = 15/5 =3
     Average =3  
          
  Author:KGN 21106 - Ishtiaq Ahmed
 **/
import java.util.Scanner;
public class CalculateAverage5 {
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  System.out.println("How many numbers you want to enter?");
  Scanner scanner = new Scanner(System.in);
  int n = scanner.nextInt();
  /* Declaring array of n elements, the value of n is provided by the user
  */
  double[] arr = new double[n];
  double total = 0;
  for(int i=0; i<arr.length; i++){
   System.out.print("Enter Element No."+(i+1)+": ");
   arr[i] = scanner.nextDouble();
  }
  scanner.close();
  for(int i=0; i<arr.length; i++){
   total = total + arr[i];
  }
  System.out.format("The total is: %.3f", total);
  double average = total / arr.length;
  System.out.format("\nThe average is: %.3f", average);
 }
} 