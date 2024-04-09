package p03;

import java.util.Scanner;

public class LinearSearch {
    public static boolean linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of arrays: ");
        int numArrays = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < numArrays; i++) {
            System.out.print("Enter the size of array " + (i + 1) + ": ");
            int size = scanner.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the elements of array " + (i + 1) + ":");
            for (int j = 0; j < size; j++) {
                arr[j] = scanner.nextInt();
            }
            System.out.print("Enter the element to search: ");
            int target = scanner.nextInt();

            if (linearSearch(arr, target)) {
                System.out.println("Element is Present");
                found = true;
            } else {
                System.out.println("Element is not Present");
            }
        }

        if (!found) {
            System.out.println("No arrays contain the element.");
        }
    }
}
