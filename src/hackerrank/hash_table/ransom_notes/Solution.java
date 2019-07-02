package hackerrank.hash_table.ransom_notes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Daniil Tyshchenko
 * @version 0.0.1
 * @since 0.0.1
 */
public class Solution {

  public static void main(String[] args) {
    checkMagazine(new String[]{"give", "me", "one", "grand", "today", "night"}, new String[]{"give", "one", "grand", "today"});
    checkMagazine(new String[]{"two", "times", "three", "is", "not", "four"}, new String[]{"two", "times", "two", "is", "three"});

  }

  static void checkMagazine(String[] magazine, String[] note) {
    Map<String, Integer> map = new HashMap<>();
    for (String s : magazine) {
      map.compute(s, (key, value) -> value != null ? ++value : 1);
    }

    for (String s : note) {
      Integer integer = map.get(s);
      if (integer == null || integer == 0) {
        System.out.println("No");
        return;
      } else {
        map.compute(s, (key, value) -> --value);
      }
    }

    System.out.println("Yes");
  }

}
