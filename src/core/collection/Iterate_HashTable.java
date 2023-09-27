package core.collection;

import java.util.Enumeration;
import java.util.Hashtable;

public class Iterate_HashTable {
    public static void main(String[] args) {
        Hashtable hash_table = new Hashtable();
        hash_table.put("1","monday");
        hash_table.put("2","tuesday");
        hash_table.put("3","wednesday");
        hash_table.put("4","thursday");
        hash_table.put("5","friday");
        hash_table.put("6","saturday");
        hash_table.put("7","sunday");
        Enumeration enumeration = hash_table.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

    }

}
