package classobjectexample;

//Class and Object Example

//Step 1: Define a class
class Dog {
 // Step 2: Declare attributes (fields)
 String name;
 int age;

 // Step 3: Declare methods
 void bark() {
     System.out.println("Woof! Woof!");
 }

 void displayInfo() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}

//Step 4: Main class to test the class and create objects
public class ClassAndObjectExample {
 public static void main(String[] args) {
     // Step 5: Create an object of the class
     Dog myDog = new Dog();

     // Step 6: Set values for the object's attributes
     myDog.name = "sana";
     myDog.age = 22;

     // Step 7: Call methods on the object
     myDog.bark();
     myDog.displayInfo();
 }
}
