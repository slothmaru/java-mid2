package collection.set.javaset;

import java.util.*;

public class JavaSetMain {

  public static void main(String[] args) {
    Set<String> linkedHashSet = new LinkedHashSet<>();
    Set<String> treeSet = new TreeSet<>();
    run(new HashSet<>()); // O(1)
    run(new LinkedHashSet<>()); // O(1)
    run(new TreeSet<>()); // O(log N)

  }

  private static void run(Set<String> set) {
    System.out.println("set = " + set.getClass());
    set.add("C");
    set.add("B");
    set.add("A");
    set.add("1");
    set.add("2");

    Iterator<String> iterator = set.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + " ");
    }
    System.out.println();
  }
}
