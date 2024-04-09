package p09;

import java.util.Hashtable;
import java.util.Objects;

class Employee {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department + ", Designation: " + designation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create HashTable to store Employee details
        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();

        // Predefined information of 4 Employee details
        employeeTable.put(1, new Employee(1, "John Doe", "IT", "Software Engineer"));
        employeeTable.put(2, new Employee(2, "Jane Smith", "HR", "Manager"));
        employeeTable.put(3, new Employee(3, "Alice Johnson", "Finance", "Accountant"));
        employeeTable.put(4, new Employee(4, "Bob Brown", "Operations", "Supervisor"));

        // Check if the HashTable is empty or not
        boolean isEmpty = employeeTable.isEmpty();
        System.out.println("Is HashTable empty? " + isEmpty);
    }
}