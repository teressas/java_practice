package multipleexceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {

		Test test = new Test();

		// Multiple catch blocks
//		try {
//			test.run();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ParseException e) {
//			System.out.println("Couldn't parse command file.");
//		}

		// Try multi-catch (Java 7+ only)
//        try {
//            test.run();
//        } catch (IOException | ParseException e) {
//            e.printStackTrace();
//        }

		// Using polymorphism to catch the parent of all exceptions; Exception allows
		// you to catch all exceptions; IOException and ParseException
//		try {
//			test.run();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		// Important to catch exceptions in the right order!
		// IOException cannot come first, because it's the parent
		// of FileNotFoundException, so would catch both exceptions
		// in this case.
		try {
			test.input();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// RUNTIME EXCEPTIONS
		// Null pointer exception ....
        String text = null;
        
        System.out.println(text.length());
        
        // Arithmetic exception ... (divide by zero)
        int value = 7/0;

        // You can actually handle RuntimeExceptions if you want to;
        // for example, here we handle an ArrayIndexOutOfBoundsException
        String[] texts = { "one", "two", "three" };

        try {
            System.out.println(texts[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }

	}

}
