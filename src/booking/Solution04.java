package booking;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Daniil Tyshchenko
 * @version 0.0.1
 * @since 0.0.1
 */
public class Solution04 {

  public static void main(String[] args) {

    System.out.println(sort_hotels("one two three", Arrays.asList(1, 2, 3), Arrays.asList("blah one", "blah one two", " blah one two three")));
  }

  static List<Integer> sort_hotels(String keywords, List<Integer> hotel_ids, List<String> reviews) {

    String[] words = keywords.split(" ");

    Map<Integer, String> hotelToReview = new HashMap<>();

    for (int i = 0; i < hotel_ids.size(); i++) {
      hotelToReview.put(hotel_ids.get(i), reviews.get(i));
    }

    Map<String, Integer> reviewToOccurances = new HashMap<>();

    for (String review : reviews) {
      for (String word : words) {
        if (review.contains(word)) {
          reviewToOccurances.compute(review, (key, value) -> value != null ? ++value : 1);
        }
      }
    }

    return hotel_ids;

  }

}
