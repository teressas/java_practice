import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadLine {

	public static void main(String[] args) throws FileNotFoundException{
		
		// USING SCANNER
		//String fileName = "C:/Users/John/Desktop/example.txt";
        String fileName = "example.txt";
        
        File textFile = new File(fileName);
        
        // use this to create throws FileNotFoundException
        Scanner in = new Scanner(textFile);
        
        // reads integer in the file
        int value = in.nextInt();
        System.out.println("Read value: " + value);
        
        // reads next line with a character return
        in.nextLine();
        
        // count starts at 2nd line
        int count = 2;
        
        // while there's a next line to read
        while(in.hasNextLine()) {
            String line = in.nextLine();
            
            System.out.println(count + ": " + line);
            count++;
        }
        
        // closes file after reading
        in.close();

	}

}
