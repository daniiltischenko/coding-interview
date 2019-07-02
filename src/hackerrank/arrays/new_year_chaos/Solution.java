package hackerrank.arrays.new_year_chaos;

/**
 * @author Daniil Tyshchenko
 * @version 0.0.1
 * @since 0.0.1
 */
public class Solution {

  public static void main(String[] args) {
//    minimumBribes(new int[]{2, 1, 5, 3, 4});
    minimumBribes(new int[]{2, 5, 1, 3, 4});
    minimumBribes(new int[]{1, 2, 5, 3, 7, 8, 6, 4});
//    minimumBribes(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
  }

  static void minimumBribes(int[] q) {
    int num = 0;
    for (int i = q.length - 1; i >= 0; i--) {
       if (q[i] - (i + 1) > 2) {
         System.out.println("Too chaotic");
         return;
       }

      for (int j = Math.max(0, q[i]-2); j < i ; j++) {
        if (q[j] > q[i]) {
          num++;
        }
      }
    }

    System.out.println(num);
  }

}
