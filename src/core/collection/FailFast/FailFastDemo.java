package core.collection.FailFast;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastDemo {
    public static void main(String[] args) {
        Map<String, String> empName = new HashMap<>();
        empName.put("sam", "usa");
        empName.put("jennifer", "goa");
        empName.put("angela", "ek");
        Iterator iterator = empName.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(empName.get(iterator.next()));
            empName.put("turkey", "ik");
        }
    }
}
