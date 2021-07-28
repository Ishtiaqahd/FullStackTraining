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

	/**
	import java.lang.*;
	public class ReSizeArray6SAC{
	 public static void main(String[] args){
	  // TODO Auto-generated method stub
	  int arr1[] = { 0, 1, 2, 3, 4, 5 };
	  int arr2[] = { 5, 10, 20, 30, 40, 50 };
	  // copies an array from the specified source array
	  System.arraycopy(arr1, 0, arr2, 0, 1);
	  System.out.print("array2 = ");
	  System.out.print(arr2[0] + " ");
	  System.out.print(arr2[1] + " ");
	  System.out.print(arr2[2] + " ");
	  System.out.print(arr2[3] + " ");
	  System.out.print(arr2[4] + " ");
	 }
	}		 
	**/

	/**
	 * Let us compile and run the above program, this will produce the following 
	 result - array2 = 0 10 20 30 40
	**/


	/**
	System.arraycopy() in Java
	java.lang.System class provides useful methods for standard input and output, 
	for loading files and libraries or to access externally defined properties. 
	The java.lang.System.arraycopy() method copies a source array from a specific 
	beginning position to the destination array from the mentioned position. No. 
	of arguments to be copied are decided by len argument.
	The components at source_Position to source_Position + length – 1 are copied 
	to destination array from destination_Position to destination_Position + 
	length – 1

	Class Declaration

	public final class System
	   extends Object
	arraycopy
	Syntax :public static void arraycopy(Object source_arr, int sourcePos,
	                            Object dest_arr, int destPos, int len)
	Parameters : 
	source_arr : array to be copied from
	sourcePos : starting position in source array from where to copy
	dest_arr : array to be copied in
	destPos : starting position in destination array, where to copy in
	len : total no. of components to be copied.
	Implementation

	// Java program explaining System class method - arraycopy()
	**/

	import java.lang.*;
	public class ReSizeArray6SAC2{
	 public static void main(String[] args){
	        int s[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
	        int d[] = { 15, 25, 35, 45, 55, 65, 75, 85, 95, 105};
	  
	        int source_arr[], sourcePos, dest_arr[], destPos, len;
	        source_arr = s;
	        sourcePos = 3;
	        dest_arr = d;
	        destPos = 5;
	        len = 4;
	  
	        // Print elements of source
	        System.out.print("source_array : ");
	        for (int i = 0; i < s.length; i++)
	            System.out.print(s[i] + " ");
	        System.out.println("");
	  
	        System.out.println("sourcePos : " + sourcePos);
	         
	        // Print elements of source
	        System.out.print("dest_array : ");
	        for (int i = 0; i < d.length; i++)
	            System.out.print(d[i] + " ");
	        System.out.println("");
	         
	        System.out.println("destPos : " + destPos);
	         
	        System.out.println("len : " + len);
	         
	        // Use of arraycopy() method
	        System.arraycopy(source_arr, sourcePos, dest_arr, 
	                                            destPos, len);
	         
	        // Print elements of destination after
	        System.out.print("final dest_array : ");
	        for (int i = 0; i < d.length; i++)
	            System.out.print(d[i] + " ");
	    }
	} 

	/**
	Output:

	source_array : 10 20 30 40 50 60 70 80 90 100 
	sourcePos : 3
	dest_array : 15 25 35 45 55 65 75 85 95 105 
	destPos : 5
	len : 4
	final dest_array : 15 25 35 45 55 40 50 60 70 105
	**/
