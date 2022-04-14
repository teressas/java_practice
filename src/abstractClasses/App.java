package abstractClasses;

public class App {

	public static void main(String[] args) {
		Camera cam1 = new Camera();
        cam1.setId(5);
        
        cam1.run();

        Car car1 = new Car();
        car1.setId(4);
        
        car1.run();
        
        // can instantiate instance of abstract class
        //Machine machine1 = new Machine();
	}

}
