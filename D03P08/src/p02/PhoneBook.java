package p02;

import java.util.HashMap;

public class PhoneBook {
    public static void main(String[] args) {
        // Create a HashMap to store phone book details
        HashMap<String, String> phoneBook = new HashMap<>();

        // Predefined information of 5 phone book details
        phoneBook.put("Amal", "998787823");
        phoneBook.put("Manvitha", "937843978");
        phoneBook.put("Joseph", "7882221113");
        phoneBook.put("Smith", "8293893311");
        phoneBook.put("Kathe", "7234560011");

        // Search for phone number by name
        String nameToSearch = "Joseph";
        String phoneNumber = phoneBook.get(nameToSearch);

        // Output the search result
        if (phoneNumber != null) {
            System.out.println("Phone number for " + nameToSearch + ": " + phoneNumber);
        } else {
            System.out.println("Phone number not found for " + nameToSearch);
        }
    }
}