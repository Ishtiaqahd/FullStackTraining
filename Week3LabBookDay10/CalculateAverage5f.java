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

    Java Float sum() Method    import static java.lang.Float.sum;
    ava sum() method is a part of the Float class of the java.lang package. 
    This method returns the numerical sum of the float values passed as 
    arguments (i.e simply adds the two numbers passed as argument in 
    accordance with the + operator).
     
    Syntax:    public static float sum(float a, float b)  
    Returns:   Returns the sum of the two float values passed as parameters.
          
 Author:KGN 21106 - Ishtiaq Ahmed
**/
import static java.lang.Float.sum;  
import java.util.Scanner;
 
public class CalculateAverage5f{  
 public static void main(String[] args){  
  int n, count = 1;   
  float  xF, averageF, sumF = 0;   
  Scanner sc = new Scanner(System.in);     
  System.out.println("How many numbers you want to enter n?");  
  n = sc.nextInt();  
  while (count <= n){   
   System.out.println("Enter the "+count+" number?");  
   // xF = sc.nextInt();  
   xF = sc.nextFloat();  
   sumF += xF;   
   ++count;   
  }   
  averageF = sumF/n;   
  System.out.println("The Total is:"+sumF);  
  System.out.println("The Average is:"+averageF);  
 }    
}  	 