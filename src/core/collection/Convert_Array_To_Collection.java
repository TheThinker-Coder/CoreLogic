package core.collection;

import java.util.Arrays;
import java.util.List;

public class Convert_Array_To_Collection {
    public static void main(String[] args) {
        String sampleArray[] = {"monday", "tuesday", "wedenesday", "thursday", "friday", "saturday", "sunday"};
        int length = sampleArray.length;
        // to print array
        for (int i = 0; i < length; i++) {
            System.out.println(sampleArray[i]);

        }
        List converted = Arrays.asList(sampleArray);
        System.out.println(converted);
    }
}
