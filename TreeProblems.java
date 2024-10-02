/*
 * *** Mariana Hernandez / 272 002 F24 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
   public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

    // Create new TreeSet named union that starts with all elements from setA
    Set<Integer> union = new TreeSet<>(setA);
    // Add all elements from setB to the union set
    union.addAll(setB);

    // Create another TreeSet called intersection that starts with elements from SetA
    Set<Integer> intersection = new TreeSet<>(setA);
    // Only keep elements that are in both setA and setB
    intersection.retainAll(setB);

    // Remove all elements that are in the intersectionfrom the union set
    union.removeAll(intersection);

    // Return the union set that now only contains elements that are in one set but not both
    return union;
  }

  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {

    // Create an iterator to go through the entries of the TreeMap
    Iterator<Map.Entry<Integer, String>> iterator = treeMap.entrySet().iterator();

    // Loop through the TreeMap using the iterator
    while (iterator.hasNext()) {
      // Get next entry in the TreeMap
      Map.Entry<Integer, String> entry = iterator.next();

      // Check if keys even
      if (entry.getKey() % 2 == 0) {
        // If keys even, remove entry from the TreeMap
        iterator.remove();
      }
    }
  }



  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2) {
   
    // Use method equals() to check if tree1 and tree2 are the same
    // It checks both keys and values to see if they match
    return tree1.equals(tree2);
  }
}
