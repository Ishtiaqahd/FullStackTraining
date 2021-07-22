package Week3LabBookDay10;

public class PremitiveTypesDefVals {
 /**
  2. Write a program to print default values of all primitive types.
  Author:KGN 21106 - Ishtiaq Ahmed
 **/
 boolean boo; // False 
 char c;     //	'\u0000'
 byte b;    //	0
 short s;    //	0
 int i;    //	0
 long l;   // 0L
 float f;   // 0.0f
 double	d;   // 0.0d
 public static void main(String[] args) {
	// TODO Auto-generated method stub
  PremitiveTypesDefVals ptdp=new PremitiveTypesDefVals();
	// TO DO print on Console. 
  System.out.println("Default values of boolean boo:  "+ptdp.boo);
  System.out.println("Default values of char C:  "+ptdp.i);
  System.out.println("Default values of byte b:  "+ptdp.b);    //	0
  System.out.println("Default values of short s:  "+ptdp.s);    //	0
  System.out.println("Default values of int i:  "+ptdp.i);    //	0
  System.out.println("Default values of long l:  "+ptdp.l);   // 0L
  System.out.println("Default values of float f:  "+ptdp.f);   // 0.0f
  System.out.println("Default values of double d:  "+ptdp.d);   // 0.0d
 }
}
