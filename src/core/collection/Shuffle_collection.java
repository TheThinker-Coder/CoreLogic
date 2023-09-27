package core.collection;

import java.util.ArrayList;
import java.util.Collections;


public class Shuffle_collection {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("monday");
        arrayList.add("tuesday");
        arrayList.add("wednesday");
        arrayList.add("thursady");
        arrayList.add("friday");
        arrayList.add("saturday");
        arrayList.add("sunday");
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
    }

}
