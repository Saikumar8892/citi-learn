package polymorphism;

//Polymorphism Example with Method Overloading and Overriding

//Step 1: Define a base class
class Shape {
 // Step 2: Declare a method to be overloaded
 void draw() {
     System.out.println("Drawing a generic shape");
 }

 // Step 3: Overload the method with a different signature
 void draw(String color) {
     System.out.println("Drawing a shape with color: " + color);
 }
}

//Step 4: Create a subclass that overrides the method
class Circle extends Shape {
 // Step 5: Override the draw method from the base class
 @Override
 void draw() {
     System.out.println("Drawing a circle");
 }
}

//Step 6: Create another subclass that overrides the method
class Square extends Shape {
 // Step 7: Override the draw method from the base class
 @Override
 void draw() {
     System.out.println("Drawing a square");
 }
}

//Step 8: Main class to test polymorphism
public class PolymorphismExample {
 public static void main(String[] args) {
     // Step 9: Create objects of different shapes
     Shape shape = new Shape();
     Circle circle = new Circle();
     Square square = new Square();

     // Step 10: Call the overloaded and overridden draw methods
     shape.draw();           // Calls the overloaded method in the base class
     shape.draw("red");      // Calls the overloaded method with a different signature
     circle.draw();          // Calls the overridden draw method in the Circle class
     square.draw();          // Calls the overridden draw method in the Square class
 }
}

