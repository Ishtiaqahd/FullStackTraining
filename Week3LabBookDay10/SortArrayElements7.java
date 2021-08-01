package Week3LabBookDay10;
/**
7. Write a program to sort an array element in ascending or
   descending order
Author:KGN 21106 - Ishtiaq Ahmed
**/

  /* TODO Auto-generated method stub
   Given an array of integers, sort the array in ascending 
   order and in descending order.
   Examples:Input :
   arr[] = {5, 2, 4, 7, 9, 3, 1, 6, 8}
   Output : arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9}

   Input : arr[] = {1, 2, 3, 4, 5, 6}
   Output : arr[] = {1, 2, 3, 4, 5, 6}
   Recommended: Please solve it on “PRACTICE ” first, before moving on to 
   the solution. 
 
   Algorithm : 
   1. Sort the given array. 
   2. Run a loop up to the length of the array and print the elements of 
      the sorted array. 
   3. Run a loop from the length-1 of the array to Start of the array 
      and print the elements in reverse order.
*/

/*
 Java program to print in ascending order and the in descending order
*/ 

import java.util.Arrays;
import java.util.Scanner;
//public class SortArrayElements7 {
class SortArrayElements7 {
 // function to print the array in ascending order and the in descending order
 static void printOrder(int[] arr, int n, String o){
  // sorting the array
  Arrays.sort(arr);
  if(o.contains( "A")|| o.contains( "a")){   // printing in ascending order
   for (int i = 0; i < n ; i++)
   System.out.print(arr[i]+" ");
   // printing in descending order
   System.out.println("The Array Sorted Ascending order.");
  }
  else {
   for (int j = n - 1; j >= 0 ; j--)
   System.out.print(arr[j]+" ");
   System.out.println("The Array Sorted Descending order.");
  }
 }
 
 // Driver code
 public static void main(String[] args){
  int[] arr = { 5, 4, 6, 2, 1, 3, 8, 9, 7 };
  int n = arr.length;
  for (int i = 0; i < n ; i++)
   System.out.print(arr[i]+" ");
   System.out.println("Original Array is and Length of Array is:"+n);
   System.out.println("Sort the given array in \'A\'(a)scending/Descending order enter(A/Default)?");
   Scanner scanner = new Scanner(System.in);
   String o = scanner.nextLine();
   System.out.println("Selected "+o+"    "+(o.contains( "A")|| o.contains( "a")));
   printOrder(arr, n, o);
 }
}

/*
Input: 
 5 4 6 2 1 3 8 9 7 Original Array is and Length of Array is:9
Output:
5 4 6 2 1 3 8 9 7 Original Array is and Length of Array is:9
Sort the given array in 'A'(a)scending/Descending order enter(A/Default)?
a
Selected a    true
1 2 3 4 5 6 7 8 9 The Array Sorted Ascending order.
                    or
5 4 6 2 1 3 8 9 7 Original Array is and Length of Array is:9
Sort the given array in 'A'(a)scending/Descending order enter(A/Default)?
f
Selected f    false
9 8 7 6 5 4 3 2 1 The Array Sorted Descending order.
*/
