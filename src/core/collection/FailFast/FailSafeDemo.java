package core.collection.FailFast;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>(new Integer[]{1,7,8,9,0});
      Iterator iterator = list.iterator();
      while (iterator.hasNext()){
          Integer i = (Integer) iterator.next();
          System.out.println(i);
if (i==7)
    list.add(15);
      }
    }
}
