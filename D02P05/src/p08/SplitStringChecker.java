package p08;

import java.util.HashSet;

public class SplitStringChecker {
    public static void main(String[] args) {
        System.out.println(canSplitIntoFourDistinctStrings("Helloworld"));
        System.out.println(canSplitIntoFourDistinctStrings("aaabb"));
    }

    public static boolean canSplitIntoFourDistinctStrings(String input) {
        // Check if the length of the string is divisible by 4
        if (input.length() % 4 != 0) {
            return false;
        }

        HashSet<String> set = new HashSet<>();

        // Iterate through all possible splits
        for (int i = 1; i <= input.length() - 3; i++) {
            for (int j = i + 1; j <= input.length() - 2; j++) {
                for (int k = j + 1; k <= input.length() - 1; k++) {
                    // Split the string into four substrings
                    String s1 = input.substring(0, i);
                    String s2 = input.substring(i, j);
                    String s3 = input.substring(j, k);
                    String s4 = input.substring(k);

                    // Add the substrings to the set
                    set.clear();
                    set.add(s1);
                    set.add(s2);
                    set.add(s3);
                    set.add(s4);

                    // Check if all substrings are distinct
                    if (set.size() == 4) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
