package lintcode.wiggle_sort;

import java.util.Arrays;

/**
 * Given an unsorted array nums, reorder it in-place such that
 *
 * nums[0] <= nums[1] >= nums[2] <= nums[3]....
 *
 * @author Daniil Tyshchenko
 * @version 0.0.1
 * @since 0.0.1
 */
public class Solution {

  public static void main(String[] args) {
    wiggleSort_01(new int[]{3, 5, 2, 1, 6, 4});
    wiggleSort_01(new int[]{2, 1});

    wiggleSort_02(new int[]{3, 5, 2, 1, 6, 4});
    wiggleSort_02(new int[]{2, 1});
  }

  /*
   * @param nums: A list of integers
   * @return: nothing
   */
  private static void wiggleSort_01(int[] nums) {
    // write your code here

    Arrays.sort(nums);

    for (int i = 1; i < nums.length-1; i = i + 2) {
      swap(nums, i, i + 1);
    }

    Arrays.stream(nums).forEach(System.out::print);
    System.out.println();
  }

  private static void wiggleSort_02(int[] nums) {
    for (int i = 0; i < nums.length; i+=2) {

      if (i > 1 && nums[i] > nums[i-1]) {
        swap(nums, i, i-1);
      }

      if (i < nums.length-1 && nums[i] > nums[i+1]) {
        swap(nums, i, i + 1);
      }
    }

    Arrays.stream(nums).forEach(System.out::print);
    System.out.println();
  }

  private static void swap(int arr[], int a, int b) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }

}
