package booking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Daniil Tyshchenko
 * @version 0.0.1
 * @since 0.0.1
 */
public class Solution02 {

  public static void main(String[] args) {
    System.out.println(delta_encode(Arrays.asList(25626, 25757, 24367, 24267, 16, 100, 2, 7277)));
  }

  public static List<Integer> delta_encode(List<Integer> numbers) {
    // Write your code here
    List<Integer> list = new ArrayList<>();
    list.add(numbers.get(0));

    for (int i = 1; i < numbers.size(); i++) {
      Integer current = numbers.get(i);
      Integer previous = numbers.get(i - 1);

      int result = current - previous;

      if (result < -127 || result > 128) {
        list.add(-128);
      }

      list.add(result);
    }

    return list;
  }

}
