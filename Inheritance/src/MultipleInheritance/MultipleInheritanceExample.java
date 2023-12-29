package MultipleInheritance;
// Multiple Inheritance Example (Through Interfaces)

// Step 1: Define the first interface
interface Walkable {
    void walk();
}

// Step 2: Define the second interface
interface Swimmable {
    void swim();
}

// Step 3: Create a class that implements both interfaces
class Amphibian implements Walkable, Swimmable {
    @Override
    public void walk() {
        System.out.println("Amphibian is walking");
    }

    @Override
    public void swim() {
        System.out.println("Amphibian is swimming");
    }
}

// Step 4: Main class to test the multiple inheritance
public class MultipleInheritanceExample {
    public static void main(String[] args) {
        // Step 5: Create an object of the class implementing both interfaces
        Amphibian myAmphibian = new Amphibian();

        // Step 6: Call methods from both interfaces
        myAmphibian.walk();
        myAmphibian.swim();
    }
}
