package core;

public class Palindrome {
    public static void main(String[] args) {
        String original = "99", reverse="";
        int lenght=original.length();
        for(int i = lenght-1;i>=0;i--){
            reverse=reverse+original.charAt(i);
        }
        if (original.equals(reverse)){
            System.out.println("is Palindrome ");
        }else {
            System.out.println("not Palindrome" );
        }
    }
}
