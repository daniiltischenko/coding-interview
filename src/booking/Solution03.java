package booking;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Daniil Tyshchenko
 * @version 0.0.1
 * @since 0.0.1
 */
public class Solution03 {

  public static void main(String[] args) {
    List<Integer> first = Arrays.asList(1481122000, 1481122020);
    List<Integer> second = Arrays.asList(1481122000, 1481122040);
    List<Integer> third = Arrays.asList(1481122030, 1481122035);
    List<Integer> fourth = Arrays.asList(1481122030, 1481122035);
    List<Integer> fifth = Arrays.asList(1481122030, 1481122035);
    System.out.println(howManyAgentsToAdd(1, Arrays.asList(first, second, third, fourth, fifth)));
  }

  static int howManyAgentsToAdd(int noOfCurrentAgents, List<List<Integer>> callsTimes) {
    int count = 0;

    callsTimes = callsTimes.stream().sorted(Comparator.comparingInt(o -> o.get(0))).collect(Collectors.toList());

    for (int i = 0; i < callsTimes.size(); i++) {
      List<Integer> pair = callsTimes.get(i);

      for (int j = i+1; j < callsTimes.size(); j++) {
        List<Integer> nextPair = callsTimes.get(j);
        //if first start > second end
        if (pair.get(0) > nextPair.get(1)) break;

        if (nextPair.get(0) > pair.get(1)) break;

        if (isOverLap(pair, nextPair)) count++;
      }
    }

    return noOfCurrentAgents > count ? 0 : count - noOfCurrentAgents;
  }

  static boolean isOverLap(List<Integer> first, List<Integer> second) {
    Integer firstStart = first.get(0);
    Integer firstEnd = first.get(1);

    Integer secondStart = second.get(0);
    Integer secondEnd = second.get(1);

    return firstStart > secondStart && firstStart < secondEnd ||
        firstEnd > secondStart && firstEnd < secondEnd ||
        secondStart > firstStart && secondStart < firstEnd ||
        secondEnd > firstStart && secondEnd < firstEnd;

  }

}
