package p04;

public class MinimumDeletionsForPalindrome {
    public static void main(String[] args) {
        String input = "aebcbda";
        System.out.println(minDeletionsForPalindrome(input));
    }

    public static int minDeletionsForPalindrome(String s) {
        // Find the length of the longest palindromic subsequence
        int lpsLength = longestPalindromicSubsequence(s);

        // Minimum deletions = length of string - length of longest palindromic subsequence
        return s.length() - lpsLength;
    }

    // Function to find the length of the longest palindromic subsequence
    public static int longestPalindromicSubsequence(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        // Base case: Single character is a palindrome of length 1
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        // Fill the dp table
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }

        // The value at dp[0][n-1] gives the length of the longest palindromic subsequence
        return dp[0][n - 1];
    }
}
