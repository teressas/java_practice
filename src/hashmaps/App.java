package hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
	
	
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(4, "Four");
		map.put(5, "Five");
		map.put(6, "Six");
		map.put(7, "Seven");
		map.put(8, "Eight");
		map.put(9, "Nine");
//		multiValueMap.get("ford").add("GT");
//		multiValueMap.get("ford").add("Mustang Mach-E");
//		multiValueMap.get("ford").add("Pantera");
		
//		map.put(4, new ArrayList<String>());
		
		String text = map.get(4);
		
		System.out.println(text);
		
		// iterate through all key value pairs in map
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			
			// doesn't retain order
			System.out.println(key + ": " + value);
		}
	}
	
	
}
