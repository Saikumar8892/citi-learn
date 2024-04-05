package p05;

import java.util.TreeSet;

class Person implements Comparable<Person> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person other = (Person) obj;
        return id == other.id;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.id, other.id);
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        // Create a TreeSet to store Person objects
        TreeSet<Person> persons = new TreeSet<>();

        // Add predefined person details
        persons.add(new Person(1, "Alice", 22, 1500.0));
        persons.add(new Person(2, "Bob", 15, 2500.0));
        persons.add(new Person(3, "Charlie", 23, 1800.0));
        persons.add(new Person(4, "David", 19, 1200.0));
        persons.add(new Person(5, "John", 32, 1999.0));
        persons.add(new Person(6, "Tom", 42, 3999.0));

        // Print details of persons whose age is greater than 25
        printPersonsAboveAge(persons, 25);
    }

    public static void printPersonsAboveAge(TreeSet<Person> persons, int age) {
        for (Person person : persons) {
            if (person.getAge() > age) {
                System.out.println(person);
            }
        }
    }
}
