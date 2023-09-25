package core;

public class DecodeString {
    public static char stringDecode(String stringEncoded, int index) {
        StringBuilder stringDecode = new StringBuilder();
        int i = 0;
        while (i < stringEncoded.length()) {
            char ch = stringEncoded.charAt(i); // Find character at the current position
            i++; //  next position
            int count = 0; //  store variable at count of repetitions
            while (i < stringEncoded.length() && Character.isDigit(stringEncoded.charAt(i))) {
                count = count * 10 + Character.getNumericValue(stringEncoded.charAt(i)); // Calculate the count
                i++; //  next position
            }
            for (int j = 0; j < count; j++) {
                stringDecode.append(ch); //  count number of times to the decoded string
            }
        }
        if (index >= 0 && index < stringDecode.length()) {
            return stringDecode.charAt(index); // Return the character at the specified index
        } else {
            return '*'; // return '*' if index is out of bound
        }
    }
    public static void main(String[] args) {
        String stringEncoded = "a4b2c2a2d1c3e1f3"; // input
        int index = 9; // Index of the character
        char character = stringDecode(stringEncoded, index); // Decode the string
        System.out.println("Character at index " + index + ": " + character); //  result
    }
}

