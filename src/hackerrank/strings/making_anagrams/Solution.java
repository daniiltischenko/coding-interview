package hackerrank.strings.making_anagrams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * @author Daniil Tyshchenko
 * @version 0.0.1
 * @since 0.0.1
 */
public class Solution {

  public static void main(String[] args) {
    System.out.println(makeAnagram("abc", "cde"));
    System.out.println(makeAnagram("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
  }

  static int makeAnagram(String a, String b) {
    int [] letters =  new int[26];
    a.chars().forEach(c -> letters[c-'a']++);
    b.chars().forEach(c -> letters[c-'a']--);
    return IntStream.of(letters).map(Math::abs).sum();
  }

//  static int makeAnagram(String a, String b) {
//    int[] lettercounts = new int[26];
//    for(char c : a.toCharArray()){
//      lettercounts[c-'a']++;
//    }
//    for(char c : b.toCharArray()){
//      lettercounts[c-'a']--;
//    }
//    int result = 0;
//    for(int i : lettercounts){
//      result += Math.abs(i);
//    }
//    return result;
//  }

//  static int makeAnagram(String a, String b) {
//    char[] a1 = a.toCharArray();
//    Arrays.sort(a1);
//    char[] b1 = b.toCharArray();
//    Arrays.sort(b1);
//
//    int sum = 0;
//    for (int i = 0, j = 0; i < a1.length && j < b1.length; ) {
//      if (a1[i] < b1[j]) {
//        i++;
//        sum++;
//      } else if (a1[i] > b1[j]) {
//        j++;
//        sum++;
//      } else {
//        i++;
//        j++;
//      }
//
//      if (i == a1.length) {
//        sum += b1.length - j;
//      }
//
//      if (j == b1.length) {
//        sum += a1.length - i;
//      }
//    }
//
//    return sum;
//  }

//  static int makeAnagram(String a, String b) {
//    Map<Character, Integer> map01 = new HashMap<>();
//    Map<Character, Integer> map02 = new HashMap<>();
//
//    for (char c : a.toCharArray()) {
//      Integer value = map01.getOrDefault(c, 0);
//      map01.put(c, ++value);
//    }
//
//    for (char c : b.toCharArray()) {
//      Integer value = map02.getOrDefault(c, 0);
//      map02.put(c, ++value);
//    }
//
//    int sum = 0;
//    Set<Character> worked = new HashSet<>();
//    for (Entry<Character, Integer> entry : map01.entrySet()) {
//      Character key = entry.getKey();
//      Integer val01 = entry.getValue();
//      Integer val02 = map02.getOrDefault(key, 0);
//
//      if (val01 > val02) {
//        sum += val01 - val02;
//      } else if (val01 < val02){
//        sum += val02 - val01;
//      }
//
//      worked.add(key);
//    }
//
//    worked.forEach(map01::remove);
//    worked.forEach(map02::remove);
//
//    if (!map01.isEmpty()) {
//      sum += map01.values().stream().mapToInt(Integer::intValue).sum();
//    }
//
//    if (!map02.isEmpty()) {
//      sum += map02.values().stream().mapToInt(Integer::intValue).sum();
//    }
//
//    return sum;
//  }

}
