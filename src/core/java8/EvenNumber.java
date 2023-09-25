package core.java8;

import javax.swing.event.ListDataEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number = Arrays.asList(1,2,3,4,5,6,7,8,9,0,12,34,26,29,39);
      List even =  number.stream().filter(n-> n%2==0).collect(Collectors.toList());
        System.out.println(even);


    }
}
