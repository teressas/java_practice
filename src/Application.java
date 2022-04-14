import java.util.ArrayList;
import java.util.HashMap;

// TOSTRING PRACTICE IN CLASS
class Frog {

	private int id;
	private String name;

	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {

		return String.format("%-4d: %s", id, name);

		/*
		 * StringBuilder sb = new StringBuilder();
		 * sb.append(id).append(": ").append(name);
		 * 
		 * return sb.toString();
		 */
	}
}

class Machine {
	public void start() {
		System.out.println("Machine started.");
	}
}

class Camera extends Machine {
	public void start() {
		System.out.println("Camera started.");
	}

	public void snap() {
		System.out.println("Photo taken.");
	}
}

interface Plant {
	public void grow();
}

public class Application {

	public static void main(String[] args) {
		
		// PRACTICE ARRAY OF STRINGS
		String[] fruits = { "apple", "banana", "kiwi" };

		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		String[] words = new String[3];
		words[0] = "hello";
		words[1] = "world";
		words[2] = "test";
		
		System.out.println(words[2]);
		
		// MULTI-DIMENSIONAL ARRAY
		int[][] grid = {
				{3, 5, 234},
				{2, 4},
				{1, 2, 3, 4}
		};
		
		System.out.println(grid[1][1]);
		System.out.println(grid[0][2]);
		
		String[][] texts = new String[2][3];
		texts[0][1] = "Hello There";
		
		System.out.println(texts[0][1]);
		
		for(int row=0; row<grid.length; row++) {
			for(int col=0; col < grid[row].length; col++) {
				System.out.println(grid[row][col]+ "\t");
			}
			System.out.println();
		}
		
		// STRING BUILDER 1
		StringBuilder sb = new StringBuilder("");
		
		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer.");
		
		System.out.println(sb.toString());
		
		// STRING BUILDER 2 - CHAINING
		StringBuilder s = new StringBuilder();
		s.append("My name is Roger.").append("").append("I am a skydiver.");
		System.out.println(s.toString());
		
		// STRING BUFFER - THREAD SAFE VERSION OF STRING BUILDER; OLDER VERSION
		
		// FORMATTING
		System.out.print("here is some text.\tThat was a tab.\nThat was a newline.");
		System.out.println(" More text.");

		// %d formats integers
		System.out.printf("Total cost %10d; quantity is %d\n", 5, 120);
		// %-d: left aligns
		System.out.printf("Total cost %-10d; quantity is %d\n", 5, 120);
		
		for(int i=0; i<20; i++) {
			// System.out.printf("%2d: some text here\n", i);
			// System.out.printf("%-2d: some text here\n", i);
			// string
			System.out.printf("%-2d: %s\n", i, "here is some text");
		}
		// output: 5.600000
		System.out.printf("Total value: %f\n", 5.6);
		
		// specify decimal place; output: 5.60
		System.out.printf("Total value: %.2f\n", 5.6);
		
		// specifies the width
		System.out.printf("Total value: %6.1f\n", 5.6222);
		System.out.printf("Total value: %-6.1f\n", 5.6222);
		
		Frog frog1 = new Frog(7, "Freddy");
        Frog frog2 = new Frog(5, "Roger");
        
        System.out.println(frog1);
        System.out.println(frog2);
		
        // 33.UPCASTING AND DOWNCASTING
        Machine machine1 = new Machine();
        Camera camera1 = new Camera();
        
        machine1.start();
        camera1.start();
        camera1.snap();
        
        // Upcasting 
        Machine machine2 = camera1;
        machine2.start();
        // error: machine2.snap();

        // Downcasting
        Machine machine3 = new Camera();
//        Camera camera2 = (Camera)machine3;
//        camera2.start();
//        camera2.snap();
        
        // Doesn't work --- runtime error.
//        Machine machine4 = new Machine();
        // Camera camera3 = (Camera)machine4;
        // camera3.start();
        // camera3.snap();
        
        // ANONYMOUS
     // This is equivalent to creating a class that "extends"
        // Machine and overrides the start method.
        Machine machine4 = new Machine() {
            @Override public void start() {
                System.out.println("Camera snapping ....");
            }
        };
        
        machine4.start();
        
        // This is equivalent to creating a class that "implements"
        // the Plant interface
        Plant plant1 = new Plant() {
            @Override
            public void grow() {
                System.out.println("Plant growing");
                
            }
        };
        
        plant1.grow();
	}

}
