package leetcode.arrays.rotate_array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Daniil Tyshchenko
 * @version 0.0.1
 * @since 0.0.1
 */
public class Solution {

  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5, 6, 7};
    rotate(nums, 30);
    System.out.println(Arrays.toString(nums));

    int[] nums1 = {-1, -100, 3, 99};
    rotate(nums1, 2);
    System.out.println(Arrays.toString(nums1));
  }

  static void rotate(int[] nums, int k) {
    int[] replaced = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      replaced[(i + k) % nums.length] = nums[i];
    }

    System.arraycopy(replaced, 0, nums, 0, replaced.length);
  }

//  static void rotate(int[] nums, int k) {
//    k = k % nums.length;
//    reverse(nums, 0, nums.length - 1);
//    reverse(nums, 0, k - 1);
//    reverse(nums, k, nums.length - 1);
//  }
//
//  static void reverse(int[] nums, int low, int high) {
//    while (low < high) {
//      int temp = nums[low];
//      nums[low] = nums[high];
//      nums[high] = temp;
//      low++;
//      high--;
//    }
//  }

}
