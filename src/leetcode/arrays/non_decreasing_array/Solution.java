package leetcode.arrays.non_decreasing_array;

/**
 * Intuition
 *
 * Consider all indices pp for which \text{A[p]} > \text{A[p+1]}A[p]>A[p+1]. If there are zero, the answer is True. If there are 2 or more, the answer is False, as more than one element of the array must be changed for \text{A}A to be monotone increasing.
 *
 * At the problem index pp, we only care about the surrounding elements. Thus, immediately the problem is reduced to a very small size that can be analyzed by casework.
 *
 * Algorithm
 *
 * As before, let pp be the unique problem index for which \text{A[p]} > \text{A[p+1]}A[p]>A[p+1]. If this is not unique or doesn't exist, the answer is False or True respectively. We analyze the following cases:
 *
 * If \text{p = 0}p = 0, then we could make the array good by setting \text{A[p] = A[p+1]}A[p] = A[p+1].
 * If \text{p = len(A) - 2}p = len(A) - 2, then we could make the array good by setting \text{A[p+1] = A[p]}A[p+1] = A[p].
 * Otherwise, \text{A[p-1], A[p], A[p+1], A[p+2]}A[p-1], A[p], A[p+1], A[p+2] all exist, and:
 * We could change \text{A[p]}A[p] to be between \text{A[p-1]}A[p-1] and \text{A[p+1]}A[p+1] if possible, or;
 * We could change \text{A[p+1]}A[p+1] to be between \text{A[p]}A[p] and \text{A[p+2]}A[p+2] if possible.
 *
 * @author Daniil Tyshchenko
 * @version 0.0.1
 * @since 0.0.1
 */
public class Solution {

  public static void main(String[] args) {
    System.out.println(checkPossibility(new int[]{4,3,2}));
    System.out.println(checkPossibility(new int[]{4,2,3}));
    System.out.println(checkPossibility(new int[]{4,2,2}));
    System.out.println(checkPossibility(new int[]{3,4,2,3}));
    System.out.println(checkPossibility(new int[]{1,4,2,3}));
  }

  static boolean checkPossibility(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length-1; i++) {
      if (nums[i] > nums[i+1]) {
        if (i == 0 || i == nums.length-1) {
          count++;
          continue;
        }

        if (nums[i-1] <= nums[i+1]) {
          nums[i] = nums[i-1];
        } else {
          nums[i+1] = nums[i];
        }

        count++;

        if (count > 1) {
          return false;
        }


      }
    }

    return true;
  }

}
