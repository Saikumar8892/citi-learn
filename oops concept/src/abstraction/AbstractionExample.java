package abstraction;

//Abstraction Example

//Step 1: Define an abstract class with abstract and concrete methods
abstract class Shape {
 // Step 2: Declare abstract method to represent an abstract concept
 abstract void draw();

 // Step 3: Provide a concrete method with a default implementation
 void displayArea() {
     System.out.println("Area calculation is not defined for this shape");
 }
}

//Step 4: Create a concrete subclass that extends the abstract class
class Circle extends Shape {
 // Step 5: Implement the abstract method in the subclass
 @Override
 void draw() {
     System.out.println("Drawing a circle");
 }

 // Step 6: Optionally override or provide additional methods
 @Override
 void displayArea() {
     System.out.println("Calculating and displaying area for the circle");
 }
}

//Step 7: Create another concrete subclass
class Square extends Shape {
 // Step 8: Implement the abstract method in the subclass
 @Override
 void draw() {
     System.out.println("Drawing a square");
 }
}

//Step 9: Main class to test abstraction
public class AbstractionExample {
 public static void main(String[] args) {
     // Step 10: Create objects of concrete classes
     Shape circle = new Circle();
     Shape square = new Square();

     // Step 11: Call methods on the abstract type, demonstrating abstraction
     circle.draw();          // Calls the draw method specific to the Circle class
     circle.displayArea();   // Calls the displayArea method with a default implementation

     square.draw();          // Calls the draw method specific to the Square class
     square.displayArea();   // Calls the displayArea method with a default implementation
 }
}
