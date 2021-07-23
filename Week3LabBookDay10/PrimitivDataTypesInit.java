package Week3LabBookDay10;

public class PrimitivDataTypesInit {
 /**
  3. Write a program to declare all primitive data types
     with all possible types of initialization and also 
     check implicit and explicit type casting
     by assigning them to each other.
  Author:KGN 21106 - Ishtiaq Ahmed
 **/
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  /**
   Boolean Data Type true and false.    default value is false
         Boolean one = false
  **/
	  boolean boo = true; // True
	  boolean _boo = false; // False
  
  /**
   Char Data Type single 16-bit Unicode character. '\u0000' (or 0) to '\uffff'
    (or 65,535 inclusive).The char data type is used to store characters.
       char letterA = 'A' 
   Why char uses 2 byte in java and what is \u0000 ?
   It is because java uses Unicode system not ASCII code system. 
   The \u0000 is the lowest range of Unicode system. To get detail explanation
    about Unicode visit next page.
  **/
	   char c='A';     //	'\u0000'
	   char _c='a';     //	'\u0000'
   
  /**
   Byte Data Type It is an 8-bit signed two's complement integer.  -128 to 127
      default value is 0, byte a = 10, byte b = -20
  **/
	   byte b = 127;    //	0
	   byte _b = -128;    //	0
  
  /**
   Short Data Type 16-bit signed two's complement integer. -32,768 to 32,767 
      default value is 0, short s = 10000, short r = -5000 
  **/
	   short s=7;    //	0
	   short _s=7;    //	0
  
  /**
   Int Data Type 32-bit signed two's complement integer. - 2,147,483,648 (-2^31) 
      to 2,147,483,647 (2^31 -1)  default value is 0.      
      int a = 100000, int b = -200000 
  **/
  int i = 2147483647 ;    //	0
  int _i = -2147483648;    //	0
  
  /**
   Long Data Type 64-bit two's complement integer. 
      -9,223,372,036,854,775,808(-2^63) to 
      9,223,372,036,854,775,807(2^63 -1) Its default value is 0.
           long a = 100000L, long b = -200000L 
  **/
  long l = 9223372036854775807L;   // 0L
  long _l = -9223372036854775808L;   // 0L
 
  /**
   Float Data Type   single-precision 32-bit IEEE 754 floating point.
      Its value range is unlimited. It is recommended to use a float 
      (instead of double) if you need to save memory in large arrays of 
      floating point numbers. The float data type should never be used for 
      precise values, such as currency. Its default value is 0.0F.
         float f1 = 234.5f 
  **/
 float f = 92233720368547f;   // 0.0f
 float _f = -92233720368547f;   // 0.0f
  
  /**
   Double Data Type double-precision 64-bit IEEE 754 floating point.
     Its value range is unlimited. The double data type is generally used for
      decimal values just like float. The double data type also should never 
       be used for precise values, such as currency. Its default value is 0.0d.
        double d1 = 12.3
  **/
  double d = 92233720368547d;   // 0.0d
  double _d = -92233720368547d;   // 0.0d
  
	// TO DO print on Console. 
  System.out.print("Values of boolean boo is:"+ boo);
  System.out.println(" Values of boolean _boo is :"+_boo);
  
  System.out.print("Values of char C is :"+c);
  System.out.println(" Values of char _C is :"+_c);

  System.out.print("Values of byte b is :"+b);    //	0
  System.out.println(" Values of byte _b is :"+_b);    //	0

  System.out.print("Values of short s is :"+s);    //	0
  System.out.println(" Values of short _s is :"+_s);    //	0

  System.out.print("Values of int i is :"+i);    //	0
  System.out.println(" Values of int _i is :"+_i);    //	0

  System.out.print("Values of long l is :"+l);   // 0L
  System.out.println(" Values of long _l is :"+_l);   // 0L

  System.out.print("Values of float f is :"+f);   // 0.0f
  System.out.println(" Values of float _f is :"+_f);   // 0.0f

  System.out.print("Values of double d is :"+d);   // 0.0d
  System.out.println(" Values of double _d is :"+_d);   // 0.0d

  /**  Can some one explain me the difference between implicit constructor and 
       explicit constructor in Java?
       Explicit means done by the programmer. Implicit means done by the JVM 
       or the tool , not the Programmer.
       Java will provide us default constructor implicitly.Even if the 
       programmer didn't write code for constructor, he can call default 
       constructor.

       Explicit is opposite to this , ie. programmer has to write .

       Default constructor is the constructor with no arguments requested.
        It is called implicitly when creating an instance.

       The no-args constructor is called implicitly if you don't call one
        yourself, which is invalid if that constructor doesn't exist. 
        The reason it is required to call a super constructor is that the 
        superclass usually has some state it expects to be in after being 
        constructed, which may include private variables that can't be set 
        in a sub-class. If you don't call the constructor, it would leave the
        object in a probably invalid state, which can cause all kinds of
        problems
   **/
   /** 
    CastingDemo
   **/
  		l=257;//re initialize the long variable
  		System.out.println("\n \n/re initialize the long variable long value..:"+l);
  		
  		i=(int)l;//converting the 64 bit to 32
  		System.out.println("converting the 64 bit to 32 int value..:"+i);
  		
  		s=(short)i;
  		System.out.println("converting the int to short value..:"+s);
  		
  		b=(byte)s;
  		System.out.println("converting the short to byte value..:"+b);	
  		
  		//auto promotion
  		byte mybite1=120;
  		byte mybite2=2;
  		
  		byte result=(byte)(mybite1*mybite2);
   //when two bytes are multiplied then the result will be int (auto promotion)
  		System.out.println("when two bytes are multiplied 120*2 then "+
          "the result will be int (auto promotion)byte will be"+result);
  		
  		int myint=mybite1*mybite2;
  		System.out.println("when two bytes are multiplied  120*2 then "+
  				"the result will be int (auto promotion)"+myint);
  		
  		double d1=23.45;//64 bit
  		float myf = (float)d1;//32 bit
  		System.out.println(myf);
  		
  		char ch='a';//number type
  		byte myfloat=(byte)ch;
  		System.out.println(myfloat);
  		
  		short myshortch=64;
  		char ccc=(char)myshortch;
  		System.out.println(ccc);

  		byte x=10;
      	byte y=5;
  		
  		//byte z=x*y;//the result of a arithmetic operation will be always int
  		
  		int z=x*y;//automatic type promotion of byte to int
  		
  		int a=z;//byte is a smaller data type compared to int, so byte can 
                  // be stored in int but the other way is not possible
  		
  		//byte by=a;//smaller data type cannot store higher datatype
  		
  		//but if u want to achieve that , u can do type casting
  		
  		byte by=(byte)a;// typecasting
  		System.out.println(by);
  		
  		int myint1=257;
  		
  		byte mybyte=(byte)myint1;//java will divide the number by 256 and 
                // reminder will be assigned to the left hand side variable
  		
  		System.out.println(mybyte);
  		
  		float myfloat1=100.234f;
  		
  		myint=(int)myfloat1;// this casting will also make the myfloat value 
                        // loose its precision, by dropping the decimals...
  		
  		System.out.println(myint);
  		
  		char c1 = 'a';
  		myint=(int)c1;
  		System.out.println(myint);
  		
  		myint=169;
  		System.out.println((char)myint); 
 }
}
