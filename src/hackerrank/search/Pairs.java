package hackerrank.search;

import java.util.Arrays;

/**
 * @author Daniil Tyshchenko
 * @version 0.0.1
 * @since 0.0.1
 */
public class Pairs {

  public static void main(String[] args) {
    System.out.println(pairs(1, new int[]{1, 2, 3, 4}) == 3);
    System.out.println(pairs(2, new int[]{1, 5, 3, 4, 2}) == 3);
  }

  static int pairs(int k, int[] arr) {
    Arrays.sort(arr);

    int sum = 0;

    for (int i = 0; i+1 < arr.length; i++) {

      for (int j = i+1; j < arr.length && arr[j] - arr[i] <= k; j++) {
        if (arr[j] - arr[i] == k) {
          sum++;
          break;
        }
      }
    }

    return sum;

  }

}
