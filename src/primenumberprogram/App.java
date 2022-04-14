package primenumberprogram;

public class App {

	public static void main(String[] args) {

		int remainder;
		boolean isPrime = true;

		int numberToCheck = 8; // Enter the numberToCheckber you want to check for prime
		
		//Loop to check whether the numberToCheckber is divisible any numberToCheckber other than 1 and itself
		for(int i=2; i<=numberToCheck/2; i++) {
			//numberToCheckber is divided by itself
			remainder = numberToCheck % i;
			System.out.println(numberToCheck+" Divided by "+ i + " gives a remainder " + remainder);
			
			//if remainder is 0 than numberToCheckber is not prime and break loop. Else continue the loop
			if(remainder == 0) {
				isPrime = false; 
				break;
			}
		}
		// Check value true or false, if isprime is true then numberToCheckber is prime otherwise not prime
		if(isPrime) {
			System.out.println(numberToCheck + " is prime.");
		} else {
			System.out.println(numberToCheck + " is not prime.");
		}
	}
		

}
