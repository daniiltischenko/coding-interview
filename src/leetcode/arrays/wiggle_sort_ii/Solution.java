package leetcode.arrays.wiggle_sort_ii;

import java.util.Arrays;

/**
 * 324. Wiggle Sort II
 *
 * Given an unsorted array nums, reorder it such that nums[0] < nums[1] > nums[2] < nums[3]....
 *
 * @author Daniil Tyshchenko
 * @version 0.0.1
 * @since 0.0.1
 */
public class Solution {

  public static void main(String[] args) {
    wiggleSort(new int[]{1, 5, 1, 1, 6, 4});
    System.out.println();
    wiggleSort(new int[]{1, 3, 2, 2, 3, 1});
    System.out.println();

    wiggleSort(new int[]{1,2,2,1,2,1,1,1,1,2,2,2});
    System.out.println();
    wiggleSort(new int[]{4,5,5,6});
  }

  private static void wiggleSort(int[] nums) {

  }

  private static void swap(int arr[], int a, int b) {

  }
}
