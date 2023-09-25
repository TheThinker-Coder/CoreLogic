package core;

import javax.sound.midi.Soundbank;

public class PalindromeWithStringbuilder {
    public static void main(String[] args) {
        String original = "911";
        StringBuilder revers = new StringBuilder(original);
        String reverse = revers.reverse().toString();
       if(original.equals(reverse)){
           System.out.println("Is Palindrome");
       }else {
           System.out.println("Is Not Palindrome");
       }


    }
}
