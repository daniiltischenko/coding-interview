package leetcode.arrays.sort_array_by_parity;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Daniil Tyshchenko
 * @version 0.0.1
 * @since 0.0.1
 */
public class Solution {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(sortArrayByParity(new int[]{1, 4, 3, 2})));
    System.out.println(Arrays.toString(sortArrayByParity01(new int[]{1, 4, 3, 2})));
  }


  static int[] sortArrayByParity(int[] A) {
    int[] result = new int[A.length];

    int firstFree = 0;
    int lastFree = A.length - 1;

    for (int i = 0; i < A.length; i++) {
      if (A[i] % 2 == 0) {
        result[firstFree++] = A[i];
      } else {
        result[lastFree--] = A[i];
      }
    }

    return result;
  }

  static int[] sortArrayByParity01(int[] A) {
    return Arrays.stream(A)
        .boxed()
        .sorted(Comparator.comparingInt(a -> a % 2))
        .mapToInt(i -> i)
        .toArray();
  }

}
