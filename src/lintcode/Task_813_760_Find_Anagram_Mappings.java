package lintcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task_813_760_Find_Anagram_Mappings {

  public static void main(String[] args) {
    System.out.println(Arrays
        .equals(anagramMappings(new int[]{12, 28, 46, 32, 50}, new int[]{50, 12, 32, 46, 28}),
            new int[]{1, 4, 3, 2, 0}));
  }

  static int[] anagramMappings(int[] A, int[] B) {
    int[] result = new int[A.length];

    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < B.length; i++) {
      map.put(B[i], i);
    }

    for (int i = 0; i < A.length; i++) {
      result[i] = map.get(A[i]);
    }

    return result;
  }

}
