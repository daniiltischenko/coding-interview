package leetcode.arrays.height_checker;

import java.util.Arrays;

/**
 * @author Daniil Tyshchenko
 * @version 0.0.1
 * @since 0.0.1
 */
public class Solution {

  public static void main(String[] args) {
    System.out.println(heightChecker(new int[]{1,1,4,2,1,3}));
  }

  static int heightChecker(int[] heights) {
    int[] sorted = new int[heights.length];
    System.arraycopy(heights, 0, sorted, 0, heights.length);

    Arrays.sort(sorted);

    int count = 0;
    for (int i = 0; i < heights.length; i++) {
      if (sorted[i] != heights[i]) count++;
    }

    return count;
  }

}
