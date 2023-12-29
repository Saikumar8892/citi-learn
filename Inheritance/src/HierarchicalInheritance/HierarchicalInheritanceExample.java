package HierarchicalInheritance;
// Hierarchical Inheritance Example

// Step 1: Define the superclass
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Step 2: Create two subclasses that inherit from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

// Step 3: Main class to test the hierarchical inheritance
public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        // Step 4: Create objects of both subclasses
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        // Step 5: Call methods from the superclass and respective subclasses
        myDog.eat();
        myDog.bark();

        myCat.eat();
        myCat.meow();
    }
}
