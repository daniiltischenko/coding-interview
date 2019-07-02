package hackerrank.arrays.left_rotation;

import java.util.Arrays;

/**
 * @author Daniil Tyshchenko
 * @version 0.0.1
 * @since 0.0.1
 */
public class Solution {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(rotLeft(new int[]{1, 2, 3, 4, 5}, 4)));
  }

  static int[] rotLeft(int[] a, int d) {
    int length = a.length;
    int[] result = new int[length];

    for (int i = 0; i < length; i++) {
      int shift = i - d;
      if (shift < 0) {
        result[length + shift] = a[i];
      } else {
        result[shift] = a[i];
      }
    }

    return result;
  }

}
