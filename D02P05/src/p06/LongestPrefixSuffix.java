package p06;

public class LongestPrefixSuffix {
    public static void main(String[] args) {
        String input1 = "aabcdaabc";
        String input2 = "abcab";
        
        System.out.println("Length of longest prefix-suffix for input1: " + longestPrefixSuffix(input1));
        System.out.println("Length of longest prefix-suffix for input2: " + longestPrefixSuffix(input2));
    }

    public static int longestPrefixSuffix(String s) {
        int n = s.length();
        
        // Iterate from middle to start
        for (int i = n / 2; i > 0; i--) {
            String prefix = s.substring(0, i);
            String suffix = s.substring(n - i);
            
            if (prefix.equals(suffix)) {
                return i;
            }
        }
        
        return 0;
    }
}
