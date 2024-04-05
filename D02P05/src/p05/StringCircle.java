package p05;

import java.util.*;

public class StringCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.next();
        }

        if (canFormCircle(strings)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }

    public static boolean canFormCircle(String[] strings) {
        // Create a map to store the edges
        Map<Character, List<String>> graph = new HashMap<>();

        // Build the graph
        for (String str : strings) {
            char startChar = str.charAt(0);
            char endChar = str.charAt(str.length() - 1);
            if (!graph.containsKey(startChar)) {
                graph.put(startChar, new ArrayList<>());
            }
            graph.get(startChar).add(str);
        }

        // Perform DFS to find if there is a Hamiltonian path
        Set<String> visited = new HashSet<>();
        for (String str : strings) {
            if (dfs(str, endChar(str), graph, visited, strings.length)) {
                return true;
            }
        }

        return false;
    }

    private static char endChar(String str) {
        return str.charAt(str.length() - 1);
    }

    private static boolean dfs(String current, char target, Map<Character, List<String>> graph, Set<String> visited, int n) {
        if (visited.size() == n) {
            return true;
        }

        if (!graph.containsKey(target)) {
            return false;
        }

        List<String> candidates = graph.get(target);
        for (String candidate : candidates) {
            if (!visited.contains(candidate)) {
                visited.add(candidate);
                if (dfs(candidate, endChar(candidate), graph, visited, n)) {
                    return true;
                }
                visited.remove(candidate);
            }
        }

        return false;
    }
}
