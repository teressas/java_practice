package hashsets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {

		// HashSet does not retain order
//		Set<String> set1 = new HashSet<String>();

		/*
		 * LinkedHashSet remembers the order you added the items Uses a doubly linked
		 * list running through the items to keep them in order
		 */
//		Set<String> set1 = new LinkedHashSet<String>();

		// TreeSet sorts in natural order
		Set<String> set1 = new TreeSet<String>();

		if (set1.isEmpty()) {
			System.out.println("Set is empty at start.");
		}

		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");

		// adding duplicate items does nothing; set can only contain unique items
		set1.add("mouse"); // not effect on set

		System.out.println(set1);

		/// Iteration ////
		for (String element : set1) {
			System.out.println(element);
		}

		// does set contain a given item? //
		if (set1.contains("deer")) {
			System.out.println("Contains deer");
		}

		if (set1.contains("cat")) {
			System.out.println("Contains cat");
		}

		// INTERSECTION //
		Set<String> set2 = new TreeSet<String>();

		set2.add("dog");
		set2.add("cat");
		set2.add("giraffe");
		set2.add("monkey");
		set2.add("ant");

		// create copy of set
		Set<String> intersection = new HashSet<String>(set1);
		
		System.out.println(intersection);
		
		// retain all elements that are in both sets
		intersection.retainAll(set2);
		
		System.out.println(intersection);
		
		//// Difference between sets /////
		Set<String> difference = new HashSet<String>(set1);
		
		difference.removeAll(set2);
		
		System.out.println(difference);
	}

}
