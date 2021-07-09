package Week2LabBook;

public class CastingExercise {
	/**
	 4. TypeCasting
	**/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Dont run this program - Just type and understanding
	 byte b=10;
	 int i=b; // will accept - automatic type promotion
	 byte c=i;// will not accept - because lower
	 byte d=(byte)i;// Type casting makes it possible
	 byte x=10;
	 byte y=20;
	 byte sum=x*y; // Error is thrown because when arthmetic operation
	               // the result will be integer.
	}
}
