
package Interface;
// Step 1: Define an interface
interface Vehicle {
    // Step 2: Declare method signatures (abstract methods) in the interface
    void start();

    void stop();
}

// Step 3: Implement the interface in a class
class Car implements Vehicle {
    // Step 4: Implement the methods declared in the interface
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }
}

// Step 5: Main class to test the interface
public class InterfaceExample {
    public static void main(String[] args) {
        // Step 6: Create an object of the class implementing the interface
        Car myCar = new Car();

        // Step 7: Call methods from the interface
        myCar.start();
        myCar.stop();
    }
}

