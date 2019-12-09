package hackerrank.arrays;

public class ArrayManipulation {

  public static void main(String[] args) {
    System.out.println(arrayManipulation(10, new int[][]{{2, 6, 8}, {3, 5, 7}, {1, 8, 1}, {5, 9, 15}}));

    System.out.println(arrayManipulation(5, new int[][]{{1, 2, 100}, {2, 5, 100}, {3, 4, 100}}));
  }

  static long arrayManipulation(int n, int[][] queries) {
    long[] arr = new long[n];

    for (int i = 0; i < queries.length; i++) {
      int[] query = queries[i];
      for (int j = query[0]-1; j < query[1]; j++) {
        arr[j] = arr[j] + query[2];
      }
    }

    long max = arr[0];
    for (long num : arr) {
      if (num > max) {
        max = num;
      }
    }
    return max;
  }

}
