package iterators;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class App {

	public static void main(String[] args) {

		LinkedList<String> animals = new LinkedList<>();

		animals.add("fox");
		animals.add("cat");
		animals.add("dog");
		animals.add("rabbit");

		Iterator<String> it = animals.iterator();

		while (it.hasNext()) {
			String value = it.next();
			System.out.println(value);

			if (value.contains("cat")) {
				it.remove();
			}
		}
		for (String animal : animals) {
			System.out.println(animal);
		}

		/*
		 * use ListIterator
		 * 
		 */
		ListIterator<String> lt = animals.listIterator();

		while (lt.hasNext()) {
			String value = lt.next();
			System.out.println(value);

			if (value.contains("cat")) {
				lt.remove();
			}
		}
		for (String animal : animals) {
			System.out.println(animal);
		}
		
		
		/* Implementing Iterable */
		UrlLibrary urlLibrary = new UrlLibrary();
		
		
		for(String html: urlLibrary) {
			System.out.println(html.length());
			System.out.println(html);
		}
	}

}
