package sortinglists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return id + ": " + name;
	}
}

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		int len1 = s1.length();
		int len2 = s2.length();

		if (len1 > len2) {
			return 1; // string is sorted earlier
		} else if (len1 < len2) {
			return -1; // string is sorted later
		}
		return 0;
	}

}

class ReverseAlphabeticalOrder implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// return s1.compareTo(s2); // compareTo method used for sorting
		return -s1.compareTo(s2); // reverse sort
	}

}

public class App {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<>();

		animals.add("tiger");
		animals.add("lion");
		animals.add("snake");
		animals.add("cat");
		animals.add("mongoose");
		animals.add("elephant");

		// sort is a static method of Collections class
//		Collections.sort(animals); // sorts by alpha order
//		Collections.sort(animals, new StringLengthComparator()); // implement StringLengthComparator to sort by length
		Collections.sort(animals, new ReverseAlphabeticalOrder()); // sorts in reverse alpha order

		for (String animal : animals) {
			System.out.println(animal);
		}

		List<Integer> numbers = new ArrayList<>();

		numbers.add(3);
		numbers.add(1);
		numbers.add(36);
		numbers.add(73);
		numbers.add(40);

		// Collections.sort(numbers);
		Collections.sort(numbers, new Comparator<Integer>() {

			@Override
			public int compare(Integer num1, Integer num2) {
				return -num1.compareTo(num2); // sort numbers in reverse order
			}

		});

		for (Integer number : numbers) {
			System.out.println(number);
		}

		//////// Sorting Arbitrary Objects //////////
		List<Person> people = new ArrayList<Person>();

		people.add(new Person(1, "Joe"));
		people.add(new Person(3, "Sue"));
		people.add(new Person(4, "Mary"));
		people.add(new Person(2, "Bob"));

		/*
		 * Collections.sort(people); wont work because person object doesn't have
		 * natural order or doesn't implement Comparator interface
		 */

		// Sort in order of ID
		Collections.sort(people, new Comparator<Person>() {

			// @Override - removed
			public int compare(Person p1, Person p2) {
				// if p1 id > p2 id then
				if (p1.getId() > p2.getId()) {
					return 1;
				} else if (p1.getId() < p2.getId()) {
					return -1;
				}
				return 0;
			}

		});

		for (Person person : people) {
			System.out.println(person);
		}
		

		System.out.println("\n");
		// Sort in order of name
		Collections.sort(people, new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());
			}
		});
		
		for(Person person: people) {
			System.out.println(person);
		}

	}

}
