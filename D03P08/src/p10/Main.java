package p10;

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
        return id + " " + name + " " + designation + " " + department;
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
        // Create Hashtable to store Employee details
        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();

        // Predefined information of 4 Employee details
        employeeTable.put(1001, new Employee(1001, "John", "HR", "Manager"));
        employeeTable.put(1002, new Employee(1002, "Alice", "Finance", "Accountant"));
        employeeTable.put(1003, new Employee(1003, "Robert", "Development", "Product Manager"));
        employeeTable.put(1004, new Employee(1004, "Emma", "Marketing", "Marketing Specialist"));

        // Search for a specific Employee
        int searchId = 1003;
        Employee employee = employeeTable.get(searchId);

        // Output the result
        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee with ID " + searchId + " not found.");
        }
    }
}
