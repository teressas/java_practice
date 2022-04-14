package arrayLists;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Super {
	private void foo() {
		System.out.println("Super");
	}
}

class Subclass extends Super {
	public void foo() {
		System.out.println("Subclass");
	}
}
public class App {

	public static void main(String[] args) {

		// can set size in here new ArrayList<>(55); if you don't set default is 10
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);

		System.out.println(numbers.get(1));

		System.out.println("\nFor Loop Iteration 1: ");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}

		// Removing items (careful!)
		numbers.remove(numbers.size() - 1);

		// This is VERY slow
		numbers.remove(0);

		System.out.println("\nFor Loop Iteration 2: ");
		for (Integer value : numbers) {
			System.out.println(value);
		}

		// List interface ...
		List<String> values = new ArrayList<String>();
		System.out.println();
		System.out.println(values);
		
		int myArray[] = {1, 3, 5};
		System.out.println(myArray);
		
		char c = 65;
		System.out.println("c = " + c);
		
		int x = 10*20-20; 
        System.out.println(x); 
        
//        Super s = new Subclass();
//		s.foo();
		
//		Subclass s1 = new Subclass();
//		s1.foo(); // line 6
//		Super s = new Subclass();
//		s.foo(); // line 8
		
		
		class Super {
			private void foo() {
				System.out.println("Super");
			}
		}

		class Subclass extends Super {
			public void foo() {
				System.out.println("Subclass");
			}
		}
		
//		try {
//			throw new Exception("Hello ");
//		} catch (Exception e) {
//			System.out.print(e.getMessage());
//		} catch (IOException e) {
//			System.out.print(e.getMessage());
//		} finally {
//			System.out.println("World");
//		}
	}
	
}
