package Week2LabBookDay6;

public class DisplayPrimeNumbers {
	/**
	 22. Display Prime Numbers
     The number which is only divisible by itself and 1 is known as prime number.
     For example 2, 3, 5, 7…are prime numbers.
	**/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int i =0;
	 int num =0;
		//Empty String
	 String primeNumbers = "";
	 for (i = 1; i <= 100; i++){
	  int counter=0;
	  for(num =i; num>=1; num--) {
	   if(i%num==0){
	    counter = counter + 1;
	   }
	  }
	  if (counter ==2){
		//Appended the Prime number to the String
	   primeNumbers = primeNumbers + i + " ";
	  }
	 }
	 System.out.println("Prime numbers from 1 to 100 are :");
	 System.out.println(primeNumbers);
	}
}
