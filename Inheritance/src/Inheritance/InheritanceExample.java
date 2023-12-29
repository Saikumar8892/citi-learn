package Inheritance;
//Step 1: Define the superclass
class Vehicle {
 // Step 2: Define a method in the superclass
 void start() {
     System.out.println("Vehicle is starting");
 }
}

//Step 3: Create a subclass that extends the superclass
class Car extends Vehicle {
 // Step 4: Define a method in the subclass
 void drive() {
     System.out.println("Car is driving");
 }
}

//Step 5: Main class to test the inheritance
public class InheritanceExample {
 public static void main(String[] args) {
     // Step 6: Create an object of the subclass
     Car myCar = new Car();

     // Step 7: Call methods from both superclass and subclass
     myCar.start();  // Inherited from Vehicle
     myCar.drive();  // Specific to Car
 }
}
