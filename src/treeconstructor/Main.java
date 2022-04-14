package treeconstructor;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

	/*
	 * 1. Parent have at most 2 children; {parent : [child1, child2} 
	 * 2. A child has 1 parent; {child : parent} 
	 * 3. Iterate across strArr and check all conditions remain true
	 */

	public static String TreeConstructor(String[] strArr) {
		// create hashset to allow only one parent per child
		// create hashmap to create key value pairs for parent to children relationship
		// iterate through array:
			// remove all "" and () and split by comma
			// add value to child hashset
			// add the values to parent;
				// if it doesn't contain the value count equals null and count < 2; return false
				// otherwise put the value in parents and increment the count
		
		// Build a Set containing the child nodes, which will remove duplicates, and a Map of the parent nodes that
		// keeps track of the count of each parent.
		Set<String> children = new HashSet<>();
		Map<String, Integer> parents = new HashMap<>();
        
        for(String node : strArr) {
        	String[] values = node.replaceAll("[^0-9,]","").split(",");
        	children.add(values[0]);
        	Integer count = parents.get(values[1]);
        	if(count != null && count + 1 > 2) {
        		return "false"; 
        	} else {
        		parents.put(values[1], (count == null ? 1: ++count));        		
        	}
        }

        // If the size of the children Set, is less than the length of the input array, it means that the same child has
        // more than one parent, which makes the tree non-binary.
        return "" + (children.size() == strArr.length); // need ""; cannot convert boolean to string
	}

	public static void main(String[] args) {
		// keep this function call here
//		Scanner s = new Scanner(System.in);
		System.out.print(TreeConstructor(new String[] {"(1,2)", "(3,2)", "(2,12)", "(5,2)"}));
	}
}
