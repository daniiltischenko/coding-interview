package hackerrank.arrays.minimum_swaps_2;

/**
 * TODO
 * @author Daniil Tyshchenko
 * @version 0.0.1
 * @since 0.0.1
 */
public class Solution {

  public static void main(String[] args) {
    System.out.println(minimumSwaps(new int[]{4, 3, 1, 2}) == 3);
    System.out.println(minimumSwaps(new int[]{7, 1, 3, 2, 4, 5, 6}) == 5);
    System.out.println(minimumSwaps(new int[]{2, 3, 4, 1, 5}) == 3);
    System.out.println(minimumSwaps(new int[]{1, 3, 5, 2, 4, 6, 7}) == 3);
  }


  static int minimumSwaps(int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == i+1) {
        continue;
      }

      int temp = arr[arr[i] - 1];
      arr[arr[i] - 1] = arr[i];
      arr[i] = temp;

      count++;
      i--;

    }
    return count;
  }
}
