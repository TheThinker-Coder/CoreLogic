package core;

public class ReverseStringStringBuilder {
    public static void main(String[] args) {
        String originalString="Hello";
        StringBuilder stringBuilder = new StringBuilder(originalString);
        System.out.println(stringBuilder.reverse());
    }
}
