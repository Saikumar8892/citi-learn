package HybridInheritance;
// Hybrid Inheritance Example

// Step 1: Define the first superclass
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Step 2: Define the first interface
interface Swimmable {
    void swim();
}

// Step 3: Define the second interface
interface Flyable {
    void fly();
}

// Step 4: Create a class that extends the Animal and implements Swimmable interface
class Fish extends Animal implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }
}

// Step 5: Create a class that implements Swimmable and Flyable interfaces
class Duck implements Swimmable, Flyable {
    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }
}

// Step 6: Main class to test the hybrid inheritance
public class HybridInheritanceExample {
    public static void main(String[] args) {
        // Step 7: Create objects of classes implementing different combinations of inheritance
        Fish myFish = new Fish();
        Duck myDuck = new Duck();

        // Step 8: Call methods from various classes and interfaces
        myFish.eat();   // Inherited from Animal
        myFish.swim();  // Implemented from Swimmable

        myDuck.swim();  // Implemented from Swimmable
        myDuck.fly();   // Implemented from Flyable
    }
}

