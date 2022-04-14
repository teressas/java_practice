package queue;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {

	public static void main(String[] args) {
		// https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html
		// (head) <- ooooooooooooooo <- (tail) FIFO (first in, first out)

		/* Linked list has infinite size */
		/* has fixed size */
		Queue<Integer> q1 = new ArrayBlockingQueue<>(3);

		// Throws NoSuchElement exception --- no items in queue yet
		// System.out.println("Head of queue is: " + q1.element());

		// Add; will throw exceptions if you do something that doesn't make sense
		q1.add(10);
		q1.add(20);
		q1.add(30);

		System.out.println("Head of queue is: " + q1.element());

		/*
		 * q1.add(40); Runtime exceptions aren't forced Runtime exception thrown:
		 * Exception in thread "main" java.lang.IllegalStateException: Queue full at
		 * java.util.AbstractQueue.add(AbstractQueue.java:98) at
		 * java.util.concurrent.ArrayBlockingQueue.add(ArrayBlockingQueue.java:312) at
		 * queue.App.main(App.java:20)
		 */

		try {
			q1.add(40);
		} catch (IllegalStateException e) {
			System.out.println("Tried to add too many items into queue.");
		}

		// iterate through queue
		for (Integer value : q1) {
			System.out.println(value);
		}

		System.out.println("Removed from queue: " + q1.remove());
		System.out.println("Removed from queue: " + q1.remove());
		System.out.println("Removed from queue: " + q1.remove());

		try {
			System.out.println("Removed from queue: " + q1.remove());

		} catch (NoSuchElementException e) {
			System.out.println("Tried to remove too many items from queue");
		}
		
		
		////////// Methods that don't throw exceptions ////////////
		Queue<Integer> q2 = new ArrayBlockingQueue<>(2);
		
		System.out.println("Queue 2 peek: " + q2.peek());
		
		q2.offer(10);
		q2.offer(20);
		
		System.out.println("Queue 2 peek: " + q2.peek());
		
		if(q2.offer(30) == false) {
			System.out.println("Offer failed to return item");
		}
		
		for(Integer value: q2) {
			System.out.println(value);
		}
		
		// remove items; return null if cant return item
		System.out.println("Queue2 Poll: " + q2.poll());
		System.out.println("Queue2 Poll: " + q2.poll());
		System.out.println("Queue2 Poll: " + q2.poll());

	}

}
