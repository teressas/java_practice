package trywResources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App2 {

	public static void main(String[] args) {
		File file = new File("test.txt");

		// Read text files
//		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//			String line;
//
//			while ((line = br.readLine()) != null) {
//				System.out.println(line);
//			}
//		} catch (FileNotFoundException e) {
//			System.out.println("Can't find file " + file.toString());
//		} catch (IOException e) {
//			System.out.println("Unable to read file " + file.toString());
//		}

		// Write text files
		try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
			br.write("This is line one");
			br.newLine();
			br.write("This is line two");
			br.newLine();
			br.write("Last line.");
		} catch (IOException e) {
			System.out.println("Unable to read file " + file.toString());
		}

	}

}
