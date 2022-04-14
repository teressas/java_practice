package customobjectsinsetsandasmapkeys;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

class Person {
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
        return "{ID is: " + id + "; name is: " + name + "}";
    }

	// sets and maps won't go into objects and examine contents
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
}

public class App {
	
	public static void main(String[] args) {
		
		Person p1 = new Person(0, "Bob");
		Person p2 = new Person(1, "Sue");
		Person p3 = new Person(2, "Mike");
		Person p4 = new Person(1, "Sue");
		
		
//		Map<String, Integer> map = new HashMap<String, Integer>(); // works the same way as LinkedHashSet, just not ordered
		Map<Person, Integer> map = new LinkedHashMap<Person, Integer>();
		
		map.put(p1, 1);
		map.put(p2, 2);
		map.put(p3, 3);
		map.put(p4, 1); // one doesn't get repeat; keys are unique
		
		for(Person key: map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
		
		Set<Person> set = new LinkedHashSet<>();
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4); // cat doesn't get repeated; keys are unique
		
		System.out.println(set);
		
		/*
		* Output before implemeting hashmap and equals methods
		{ID is: 0; name is: Bob}: 1
		{ID is: 1; name is: Sue}: 2
		{ID is: 2; name is: Mike}: 3
		{ID is: 1; name is: Sue}: 1
		[{ID is: 0; name is: Bob}, {ID is: 1; name is: Sue}, {ID is: 2; name is: Mike}, {ID is: 1; name is: Sue}]
		*/
	}

}
