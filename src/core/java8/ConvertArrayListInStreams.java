package core.java8;

import java.util.ArrayList;

public class ConvertArrayListInStreams {
    public static void main(String[] args) {
        ArrayList<String> sl = new ArrayList<String>();
        sl.add("Demo");
        sl.add("hii");
        sl.add("ank");
        sl.add("sam");
        sl.add("az");
//        sl.stream().filter((s)->s.startsWith("a")).forEach(System.out::println);
//        sl.stream().filter((s)->s.startsWith("a")).sorted().forEach(System.out::println);
//        sl.stream().filter((s)->s.startsWith("a")).sorted((b,a)-> b.compareTo(a)).forEach(System.out::println);
//        sl.stream().filter((s)-> s.startsWith("a")).map(String::toUpperCase).sorted().forEach(System.out::println);
//        sl.stream().filter((s)-> s.startsWith("a")).map(String::toLowerCase).sorted().forEach(System.out::println);
        sl.stream().forEach(System.out::println);
    }
}
