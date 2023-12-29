package Constructor;
//Constructor Example

//Step 1: Define a class
class Car {
 // Step 2: Declare fields (attributes)
 String brand;
 int year;

 // Step 3: Define a constructor
 public Car(String brand, int year) {
     // Step 4: Initialize the object's state using constructor parameters
     this.brand = brand;
     this.year = year;

     // Optionally, perform additional initialization or validation here
 }

 // Step 5: Define a method to display information about the car
 void displayInfo() {
     System.out.println("Brand: " + brand);
     System.out.println("Year: " + year);
 }
}

//Step 6: Main class to test the constructor
public class ConstructorExample {
 public static void main(String[] args) {
     // Step 7: Create an object of the class using the constructor
     Car myCar = new Car("Tata", 2024);

     // Step 8: Call a method to display information about the car
     myCar.displayInfo();
 }
}
