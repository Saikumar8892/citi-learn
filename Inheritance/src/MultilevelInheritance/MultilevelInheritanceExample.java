package MultilevelInheritance;

//Multilevel Inheritance Example

//Step 1: Define the base class
class Animal {
 void eat() {
     System.out.println("Animal is eating");
 }
}

//Step 2: Create a derived class that extends the base class
class Dog extends Animal {
 void bark() {
     System.out.println("Dog is barking");
 }
}

//Step 3: Create another derived class that extends the Dog class
class GermanShepherd extends Dog {
 void guard() {
     System.out.println("German Shepherd is guarding");
 }
}

//Step 4: Main class to test the multilevel inheritance
public class MultilevelInheritanceExample {
 public static void main(String[] args) {
     // Step 5: Create an object of the most derived class
     GermanShepherd myDog = new GermanShepherd();

     // Step 6: Call methods from all levels of inheritance
     myDog.eat();    // Inherited from Animal
     myDog.bark();   // Inherited from Dog
     myDog.guard();  // Specific to GermanShepherd
 }
}

