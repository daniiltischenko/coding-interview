package leetcode.arrays.flipping_an_image;

import java.util.Arrays;

/**
 * @author Daniil Tyshchenko
 * @version 0.0.1
 * @since 0.0.1
 */
public class Solution {

  public static void main(String[] args) {
    System.out.println(Arrays.deepToString(
        flipAndInvertImage(
            new int[][]{new int[]{1, 1, 0}, new int[]{1, 0, 1}, new int[]{0, 0, 0}})));
  }

  static int[][] flipAndInvertImage(int[][] A) {
    for (int[] aA : A) {
      flip(aA);
      invert(aA);
    }

    return A;
  }

  static void flip(int[] arr) {
    for (int i = 0; i < arr.length/2; i++) {
      int temp = arr[i];
      arr[i] = arr[arr.length - 1 - i];
      arr[arr.length-1-i] = temp;
    }
  }

  static void invert(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Math.abs(arr[i] - 1);
    }
  }

}
