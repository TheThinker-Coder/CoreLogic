package core.collection;

import java.util.TreeSet;

public class Clone_Tree_Set {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("monday");
        treeSet.add("tuesday");
        treeSet.add("wednesday");
        treeSet.add("thursady");
        treeSet.add("friday");
        treeSet.add("saturday");
        treeSet.add("sunday");
        TreeSet clonedTreeSet = (TreeSet<String>)treeSet.clone();
        System.out.println(clonedTreeSet);
    }
}
