package recursion;

public class App {

	public static void main(String[] args) {

		// factorial (4) = 4! or 4*3*2*1
		System.out.println(factorial(5));

	}

//	private static int factorial(int value) {
////		System.out.println(value);
//		
//		if(value == 1 || value == 0) {
//			return 1;
//		}
//		System.out.println(value);
//		return factorial(value - 1) * value;
//		
//	}
	public static int factorial(int num) {
	    if(num == 1 || num == 0){
	      return num;
	    }  else {
	      return factorial(num-1) * num;
	    }

	   
	  }

}
