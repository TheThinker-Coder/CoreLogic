package core;

public class PalindromeSoluion {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reverse = 0;
        int original = x;
        while (x != 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x /= 10;
        }
        return original == reverse;

    }

    public static void main(String[] args) {
        int number1 = 123;
        System.out.println(isPalindrome(number1));


    }
}

