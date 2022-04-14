package handlingexceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Application {

	public static void main(String[] args)// throws FileNotFoundException 
	{

		// HANDLING EXCEPTIONS1: Throws Declaration; adds FileNotFoundException
//		File file = new File("test.txt");
//		
//		FileReader fr = new FileReader(file);

		// HANDLING EXCEPTIONS2: Surround with Try Catch
//		File file = new File("test.txt");
//
//		try {
//			FileReader fr = new FileReader(file);
//			
//			// This will not execute if exception in thrown.
//			System.out.println("Continuing...");
//			
//		} catch (FileNotFoundException e) {
//			// throws an exception when the file is not found in the try
//			// e.printStackTrace(); // default when implementing TryCatch; prints the stack trace error msg
//			
//			System.out.println("File not found: " + file.toString()); // 
//		}

		// this will print regardless if exception is thrown to indicate TryCatch has finished.
//		System.out.println("Finished.");
	
		// HANDLING EXCEPTIONS 3: STACK OF METHODS
		try {
			openFile();
			
		} catch (FileNotFoundException e) {
			System.out.println("could not open file");
		}
	}
	
	public static void openFile() throws FileNotFoundException {
		File file = new File("test.txt");
		
		FileReader fr = new FileReader(file);
	}

}
