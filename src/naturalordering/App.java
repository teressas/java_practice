package naturalordering;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

class Person implements Comparable<Person>{ // Comparable define natural order
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}

	// add items to set using hashcode and equal to
	@Override
	public int hashCode() {
		return Objects.hash(name);
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
		return Objects.equals(name, other.name);
	}
	
	@Override
	public int compareTo(Person person) {
		int len1 = name.length();
		int len2 = person.name.length();
		
		if(len1 > len2) {
			return 1;
		}
		else if(len1 < len2) {
			return -1;
		} else {
			/*
			* return 0; missing Sue because Joe and Sue are same length
			* tree only contains unique elements; if the lengths are equal the are the same element
			* so only keep one in the tree set
			* needs to agree with EqualsTo method
			*/
			return name.compareTo(person.name); // return 0 if they have equal lengths and put in alpha order
		}
	}

}

public class App {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		
		
		// Set<String> set = unsorted set
		SortedSet<Person> set = new TreeSet<>(); // tree maps also sort in natural order
			
		addElements(list);
		Collections.sort(list);
		
		addElements(set);
		

		showElements(list);
		System.out.println("/n");
		showElements(set);
	}
	
	// Collections is super interface of list and set
	// method used to add elements into list
	private static void addElements(Collection<Person> col) {
		col.add(new Person("Joe"));
		col.add(new Person("Mike"));
		col.add(new Person("Sue"));
		col.add(new Person("Clare"));
		col.add(new Person("Juliet"));
	}

	private static void showElements(Collection<Person> col) {
		for(Person element: col) {
			System.out.println(element);
		}
	}
}
