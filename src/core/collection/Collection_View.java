package core.collection;

import java.util.HashMap;

public class Collection_View {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap();
        hashMap.put("1","monday");
        hashMap.put("2","tuesday");
        hashMap.put("3","wednesday");
        hashMap.put("4","thursday");
        hashMap.put("5","friday");
        hashMap.put("6","saturday");
        hashMap.put("7","sunday");
        System.out.println(hashMap.values());
    }
}
