package Week3LabBookDay10;
import java.util.Scanner;

public class PrimeNumber {
 /**
  4. Write a program to find weather a number is Prime or not
  Author:KGN 21106 - Ishtiaq Ahmed
 **/
 public static void main(String[] args) {
	// TODO Auto-generated method stub
  System.out.println("Enter a number ");
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  primeCal(n);
 }
 static void primeCal(int num){
 int count=0;
 for(int i=1;i<=num;i++){
  if(num%i==0){
   count++;	        
  }
 }
 if(count==2)
  System.out.println("prime number ");
 else
  System.out.println("Not a prime number ");        
 } 
}