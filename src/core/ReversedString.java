package core;

public class ReversedString {
    public static void main(String[] args) {
        String orginalStr = "hello";
        String reversedStr = "";
        for (int i = 0; i < orginalStr.length(); i++) {
            reversedStr = orginalStr.charAt(i) + reversedStr;
        }
        System.out.println(reversedStr);
    }
}
