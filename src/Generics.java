import java.util.ArrayList;
import java.util.HashMap;

class Device {

	@Override
	public String toString() {
		return "I am a Device";
	}
	
	public void start() {
		System.out.println("Device starting...");
	}
	
}

class Laptop extends Device {

	@Override
	public String toString() {
		return "I am a laptop";
	}
	
	public void snap() {
		System.out.println("Taking photo..."); 
	}
}

public class Generics {
	
	// GENERICS - ARRAYLIST USING HASHMAP
	
	public static void main(String[] args) {
		
//		ArrayList<String> newList = new ArrayList<>();
//	    newList.add("cat");
//	    newList.add("dog");
//	    newList.add("alligator");
//	    
//	    String animal = newList.get(1);
//	    System.out.println(animal);
//	    
//	    // more than one type argument
//	    HashMap<Integer, String> map = new HashMap<Integer, String>();
	    
	    // WILDCARDS
	    
		// Device
	    ArrayList<Device> list1 = new ArrayList<>();
	    
	    list1.add(new Device());
	    list1.add(new Device());
	    
	    // show device
	    showList(list1);
	    
	    // Laptop
	    ArrayList<Laptop> list2 = new ArrayList<>();
	    
	    list2.add(new Laptop());
	    list2.add(new Laptop());
	    
	    // show laptop
	    showList(list2);
//	    showList2(list1);
	    
	}
	
//	public static void showList(ArrayList<Device> list) {
//		for(Device value: list) {
//			System.out.println(value);
//		}
//	}
    
	// ? = wildcard; list of unknown type; able to pass arraylist of any type parameter
	// items in the list are now treated as Objects; Objects are the ultimate parent of all classes
//	public static void showList(ArrayList<?> list) {
//	for(Object value: list) {
//		System.out.println(value);
//	}
	
	// UPPERBOUND CASTING, POLYMORPHISM
	public static void showList(ArrayList<? extends Device> list) {
		for(Device value: list) {
			System.out.println(value);
			value.start();
		}
	}
	
	// LOWERBOUND
	public static void showList2(ArrayList<? super Camera> list) {
		for(Object value: list) {
			System.out.println(value);
		}
	}
	
	
	
}
