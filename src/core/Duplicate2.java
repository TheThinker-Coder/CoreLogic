package core;
public class Duplicate2 {
    public static void main(String argu[]) {
        String str = "bbbbbbbbbeautiful bbbbbbbbbbbbeach";
        char[] carray = str.toCharArray();
        boolean[] hasPrinted = new boolean[carray.length];
        for (int i = 0; i < str.length(); i++) {
            if (hasPrinted[i]) {
                continue;
            }
            boolean isDuplicate = false;
            for (int j = i + 1; j < str.length(); j++) {
                if (carray[i] == carray[j]) {
                    isDuplicate = true;
                    hasPrinted[j] = true;
                }
            }
            if (isDuplicate) {
                System.out.print(carray[i] + " ");
            }
        }
    }
}
