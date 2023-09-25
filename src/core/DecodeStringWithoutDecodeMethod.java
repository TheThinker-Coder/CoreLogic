package core;

public class DecodeStringWithoutDecodeMethod {
    public static char getDecodedChar(String encodedString, int index) {
        StringBuilder decodedString = new StringBuilder();

        int count = 0;
        for (char c : encodedString.toCharArray()) {
            if (Character.isDigit(c)) {
                count = count * 10 + (c - '0'); // Calculate the count
            } else {
                if (count == 0) {
                    count = 1; // If count is not specified, set it to 1
                }
                while (count > 0) {
                    decodedString.append(c); // Append the character to the decoded string
                    count--; // Decrease the count
                }
            }
        }

        if (index < decodedString.length()) {
            return decodedString.charAt(index); // Return the character at the specified index
        }

        return '*'; // Return asterisk if the index is out of range
    }

    public static void main(String[] args) {
        String encodedString = "a4b2c1d1e1f3";
        int index = 5;
        char decodedChar = getDecodedChar(encodedString, index);
        System.out.println(decodedChar); // Output: b
    }
}
