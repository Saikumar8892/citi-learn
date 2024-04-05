package p01;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSearch {
    public static void main(String[] args) {
        // Create an ArrayList to store student names
        ArrayList<String> studentNames = new ArrayList<>();

        // Add student names to the ArrayList
        addStudentNames(studentNames);

        // Search for a particular name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name to search: ");
        String nameToSearch = scanner.nextLine();

        // Check if the name exists in the ArrayList
        if (studentNames.contains(nameToSearch)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        scanner.close();
    }

    public static void addStudentNames(ArrayList<String> studentNames) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the list of student names separated by spaces:");
        String input = scanner.nextLine();
        String[] names = input.split(" ");

        for (String name : names) {
            studentNames.add(name);
        }

        scanner.close();
    }
}
