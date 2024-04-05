package p09;

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

    public String getName() {
        return name;
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
        persons.add(new Person(1, "Jerry", 30, 999.0));
        persons.add(new Person(2, "Smith", 35, 2999.0));
        persons.add(new Person(3, "Popeye", 40, 5999.0));
        persons.add(new Person(4, "Jones", 22, 6999.0));
        persons.add(new Person(5, "John", 32, 1999.0));
        persons.add(new Person(6, "Tom", 42, 3999.0));

        // Find and print the details of the first person whose name starts with 'J'
        for (Person person : persons) {
            if (person.getName().startsWith("J")) {
                System.out.println(person);
                break;
            }
        }
    }
}