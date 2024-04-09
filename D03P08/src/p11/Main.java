package p11;

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
        employeeTable.put(1001, new Employee(1001, "Daniel", "L&D", "Analyst"));
        employeeTable.put(1002, new Employee(1002, "Thomas", "Testing", "Tester"));
        employeeTable.put(1003, new Employee(1003, "Robert", "Development", "Product Manager"));
        employeeTable.put(1004, new Employee(1004, "Grace", "HR", "Tech Support"));

        // Add new employees if not exists
        addEmployeeIfNotExists(employeeTable, new Employee(1005, "Charles", "Testing", "QA Lead"));

        // Print all employees
        System.out.println("Updated Employee Details:");
        for (Employee employee : employeeTable.values()) {
            System.out.println(employee);
        }
    }

    private static void addEmployeeIfNotExists(Hashtable<Integer, Employee> table, Employee employee) {
        if (!table.containsKey(employee.hashCode())) {
            table.put(employee.hashCode(), employee);
        }
    }
}