package SingleInheritance;
//Single Inheritance Example

//Step 1: Define the superclass
class Animal {
 void eat() {
     System.out.println("Animal is eating");
 }
}

//Step 2: Create a subclass that inherits from Animal
class Dog extends Animal {
 void bark() {
     System.out.println("Dog is barking");
 }
}

//Step 3: Main class to test the inheritance
public class SingleInheritanceExample {
 public static void main(String[] args) {
     // Step 4: Create an object of the subclass
     Dog myDog = new Dog();

     // Step 5: Call methods from both superclass and subclass
     myDog.eat();
     myDog.bark();
 }
}
