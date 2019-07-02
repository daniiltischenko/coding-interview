package booking;

/**
 *
 * @author Daniil Tyshchenko
 * @version 0.0.1
 * @since 0.0.1
 */
public class Solution01 {

  public static void main(String[] args) {
    System.out.println(triangle(3,5, 4));
    System.out.println(triangle(3,3, 3));
  }

  static int triangle(int a, int b, int c) {
    if ((a + b > c) && (a + c > b) && (b + c > a)) {
      if (a == b && b == c) {
        return 1;
      }

      return 2;
    }

    return 0;
  }

}
