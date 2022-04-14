package sortedMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {

		Map<Integer, String> hashmap = new HashMap<Integer, String>();
		// doubly linked list
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		testMap(hashmap); // order is not guaranteed
		testMap(linkedHashMap); // order is based on map.put entry
		testMap(treeMap); // natural order
		
	}
	
	public static void testMap(Map<Integer, String> map) {
		map.put(9, "fox");
		map.put(4, "cat");
		map.put(3, "bear");
		map.put(12, "dog");
		map.put(1, "giraffe");
		map.put(15, "bear");
		
		for(Integer key: map.keySet()) {
			String value = map.get(key);
			System.out.println(key + ": " + value);
		}
		
	}

}
