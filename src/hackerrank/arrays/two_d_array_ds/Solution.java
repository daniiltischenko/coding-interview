package hackerrank.arrays.two_d_array_ds;

/**
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 *
 * There are 16 hourglasses in arr, and an hourglass sum is the sum of an hourglass' values.
 * Calculate the hourglass sum for every hourglass in arr, then print the maximum hourglass sum.
 * @author Daniil Tyshchenko
 * @version 0.0.1
 * @since 0.0.1
 */
public class Solution {

  public static void main(String[] args) {
    int[][] arr = {
        {1, 1, 1, 0, 0, 0},
        {0, 1, 0, 0, 0, 0},
        {1, 1, 1, 0, 0, 0},
        {0, 0, 2, 4, 4, 0},
        {0, 0, 0, 2, 0, 0},
        {0, 0, 1, 2, 4, 0}};

    int[][] arr01 = {
        {-1, -1, 0, -9, -2, -2},
        {-2, -1, -6, -8, -2, -5},
        {-1, -1, -1, -2, -3, -4},
        {-1, -9, -2, -4, -4, -5},
        {-7, -3, -3, -2, -9, -9},
        {-1, -3, -1, -2, -4, -5}
    };

    System.out.println(hourglassSum(arr));
    System.out.println(hourglassSum(arr01));
  }

  static int hourglassSum(int[][] arr) {
    int sum;
    int maxSum = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length - 2; i++) {
      for (int j = 0; j < arr.length - 2; j++) {
        sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
        if (sum > maxSum) {
          maxSum = sum;
        }
      }
    }

    return maxSum;

  }

}
