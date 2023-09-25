package core;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringsIdentical {
    // Function to check if two strings are permutations or not
    private static boolean isPermutations(String sample1, String sample2) {
        if (sample1.length() != sample2.length()) {
            return false;
        }
        // Count the frequency of characters
        Map<Character, Long> charCount = sample2.chars()
                .mapToObj(c -> (char) c)
                .collect(HashMap::new, (map, c) -> map.merge(c, 1L, Long::sum), HashMap::putAll);
        // Check if s2 can be formed by s1 using rearrange
        for (int i = 0; i < sample2.length(); i++) {
            char c = sample2.charAt(i);
            if (!charCount.containsKey(c) || charCount.get(c) <= 0) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of test cases");
        int T = scanner.nextInt(); //  test cases to pass
        while (T-- > 0) {
            String sample1 = scanner.next();
            String sample2 = scanner.next();

            if (isPermutations(sample1, sample2)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

        scanner.close();
    }

}
