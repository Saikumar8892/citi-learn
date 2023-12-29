package encapsulation;

//Encapsulation Example

//Step 1: Define a class with private fields and public methods
class Student {
 // Step 2: Declare private fields to encapsulate data
 private String name;
 private int age;

 // Step 3: Provide public methods (getters and setters) to access and modify the private fields
 public String getName() {
     return name;
 }

 public void setName(String name) {
     // Optional: Add validation or additional logic here
     this.name = name;
 }

 public int getAge() {
     return age;
 }

 public void setAge(int age) {
     // Optional: Add validation or additional logic here
     if (age > 0) {
         this.age = age;
     }
 }
}

//Step 4: Main class to test encapsulation
public class EncapsulationExample {
 public static void main(String[] args) {
     // Step 5: Create an object of the class
     Student student = new Student();

     // Step 6: Use public methods to set and get values, encapsulating access to private fields
     student.setName("saikumar");
     student.setAge(23);

     System.out.println("Name: " + student.getName());
     System.out.println("Age: " + student.getAge());
 }
}

