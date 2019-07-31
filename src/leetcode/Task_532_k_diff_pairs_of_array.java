package leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Daniil Tyshchenko
 * @version 0.0.1
 * @since 0.0.1
 */
public class Task_532_k_diff_pairs_of_array {

  public static void main(String[] args) {
    System.out.println(findPairs(new int[]{3, 1, 4, 1, 5}, 2));
    System.out.println(findPairs(new int[]{1, 2, 3, 4, 5}, 1));
    System.out.println(findPairs(new int[]{1, 3, 1, 5, 4}, 0));
    System.out.println(findPairs(new int[]{1, 1, 1, 1, 1}, 0));
  }

  //TODO not finished!
  static int findPairs(int[] nums, int k) {
    int[] abs = Arrays.stream(nums)
        .boxed()
        .mapToInt(Math::abs)
        .sorted()
        .toArray();

    int count = 0;

    for (int i = abs.length-1; i > 0; i--) {
      int j = i - 1;
      while (j >= 0 && abs[i] - k <= abs[j]) {
        if (abs[i] - k == abs[j]) {
          count++;
          break;
        }

        j--;
      }
    }

    return count;
  }

}
