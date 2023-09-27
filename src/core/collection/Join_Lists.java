package core.collection;

import java.util.ArrayList;

public class Join_Lists {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("monday");
        list.add("tuesday");
        list.add("wednesday");
        list.add("thursady");

        ArrayList<String> list2  = new ArrayList<>();
        list2.add("friday");
        list2.add("saturday");
        list2.add("sunday");
        ArrayList<String> joinedList = new ArrayList<>();
        joinedList.addAll(list);
        joinedList.addAll(list2);
        System.out.println(joinedList);
    }
}
