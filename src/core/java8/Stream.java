package core.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
       numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
     //  numbers.stream().forEach(System.out::print);
       List even =numbers.stream().filter(n -> n % 2==0) .collect(Collectors.toList());
        System.out.println(even);

    }
}
