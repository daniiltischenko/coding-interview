package leetcode.arrays.squares_of_sorted_array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Daniil Tyshchenko
 * @version 0.0.1
 * @since 0.0.1
 */
public class Solution {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10})));
    System.out.println(Arrays.toString(sortedSquares01(new int[]{-4, -1, 0, 3, 10})));
  }

  static int[] sortedSquares(int[] A) {
    Integer[] integers = Arrays.stream(A)
        .boxed()
        .toArray(Integer[]::new);

    Arrays.sort(integers, Comparator.comparingInt(Math::abs));

    for (int i = 0; i < integers.length; i++) {
      integers[i] = integers[i] * integers[i];
    }

    return Arrays.stream(integers).mapToInt(i -> i).toArray();
  }

  static int[] sortedSquares01(int[] A) {
    for (int i = 0; i < A.length; i++) {
      A[i] = A[i] * A[i];
    }

    Arrays.sort(A);

    return A;
  }


  //TODO solve with two pointers approach
//  static int[] sortedSquares02(int[] A) {
//
//  }

}
