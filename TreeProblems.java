/*
 * Calvin Kallio SEC 002
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 */

import java.util.*;

public class TreeProblems {

  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {
    Set<Integer> onlyInA = new TreeSet<>(setA);
    Set<Integer> onlyInB = new TreeSet<>(setB);
    onlyInA.removeAll(setB);
    onlyInB.removeAll(setA);
    onlyInA.addAll(onlyInB);
    return onlyInA;
  }

  public static void removeEven(Map<Integer, String> treeMap) {
    Iterator<Integer> it = treeMap.keySet().iterator();
    while (it.hasNext()) {
      Integer key = it.next();
      if (key % 2 == 0) {
        it.remove();
      }
    }
  }

  public boolean treesEqual(Map<Integer, String> tree1, Map<Integer, String> tree2) {
    return tree1.equals(tree2);
  }

}
