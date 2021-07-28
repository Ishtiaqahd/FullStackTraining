package Week3LabBookDay10;

/**
6. Write a program to resize an array. (Since you cannot resize an array,
   use System.arrayCopy method and demonstrate the same).  
Author:KGN 21106 - Ishtiaq Ahmed
**/
/**
Java.lang.System.arraycopy() Method
Description
The java.lang.System.arraycopy() method copies an array from the specified 
source array, beginning at the specified position, to the specified position 
of the destination array. A subsequence of array components are copied from 
the source array referenced by src to the destination array referenced by 
dest.The number of components copied is equal to the length argument.

The components at positions srcPos through srcPos + length - 1 in the 
source array are copied into positions destPos through destPos + length - 1, 
respectively, of the destination array.

Declaration
Following is the declaration for java.lang.System.arraycopy() method 

public static void arraycopy(Object src, int srcPos, Object dest, 
                                               int destPos, int length)
                                               
Parameters
src - This is the source array.
srcPos - This is the starting position in the source array.
dest - This is the destination array.
destPos - This is the starting position in the destination data.
length - This is the number of array elements to be copied.
Return Value

This method does not return any value.

Exception
IndexOutOfBoundsException - if copying would cause access of data outside 
 array bounds.

ArrayStoreException - if an element in the src array could not be stored 
into the dest array because of a type mismatch.

NullPointerException - if either src or dest is null.

Example
The following example shows the usage of java.lang.System.arraycopy() method.

**/

import java.lang.*;
public class ReSizeArray6SAC{
 public static void main(String[] args){
  // TODO Auto-generated method stub
  int arr1[] = { 0, 1, 2, 3, 4, 5 };
  int arr2[] = { 5, 10, 20, 30, 40, 50 };
  // copies an array from the specified source array
  //public static void arraycopy(Object src, int srcPos, Object dest, 
  //        int destPos, int length)

  System.arraycopy(arr1, 0, arr2, 0, 4);
  System.out.print("array2 = ");
  System.out.print(arr2[0] + " ");
  System.out.print(arr2[1] + " ");
  System.out.print(arr2[2] + " ");
  System.out.print(arr2[3] + " ");
  System.out.print(arr2[4] + " ");
  System.out.print(arr2[5] + " ");
 }
}
		 
/**
 * Let us compile and run the above program, this will produce the following 
 result - array2 = 0 10 20 30 40
**/
