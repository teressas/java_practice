package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		/*
		* only need to determine what type of list you want it to be when you instantiate new instance of the list
		* can be List<Integer> arrayList or ArrayList<Integer> arrayList
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();
		*/

		/*
		 * ArrayLists manage arrays internally. [0][1][2][3][4][5] ....
		 */
		// ADD OR REMOVE ITEMS AT THE END OF LIST
		List<Integer> arrayList = new ArrayList<>();
		
		/*
		 * LinkedLists consists of elements where each element has a reference to the
		 * previous and next element [0]->[1]->[2] .... <- <-
		 */

		// ADD OR REMOVE ITEMS ANYWHERE (E.G BEGINNING OR MIDDLE) IN THE LIST
		
		List<Integer> linkedList = new LinkedList<>();

		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);

	}

	private static void doTimings(String type, List<Integer> list) {

		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		

		long start = System.currentTimeMillis();
		
		/* 
		* FASTER IN AN ARRAYLIST
        * Add items at end of list
        */
        for(int i=0; i<10; i++) {
            list.add(i);
        }
        
     // Add items elsewhere in list - add items to the beginning
        for(int i=0; i<10; i++) {
            list.add(0, i);
        }
        System.out.println(type + list);
        
        for(int i=0; i<10; i++) {
            list.remove(i);
        }
        System.out.println(type + list);
        
        

		long end = System.currentTimeMillis();

		System.out.println("Time taken: " + (end - start) + " ms for " + type);
		System.out.println(type + list);
	}

}
