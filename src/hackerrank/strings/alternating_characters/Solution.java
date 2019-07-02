package hackerrank.strings.alternating_characters;

/**
 * @author Daniil Tyshchenko
 * @version 0.0.1
 * @since 0.0.1
 */
public class Solution {

  public static void main(String[] args) {
    System.out.println(alternatingCharacters("AAAA"));
    System.out.println(alternatingCharacters("BBBBB"));
    System.out.println(alternatingCharacters("ABABABAB"));
    System.out.println(alternatingCharacters("BABABA"));
    System.out.println(alternatingCharacters("AAABBB"));
  }

  static int alternatingCharacters(String s) {
    char[] chars = s.toCharArray();
    int count = 0;
    for (int i = 1; i < chars.length; i++) {
      if (chars[i] == chars[i-1]) {
          count++;
      }
    }

    return count;
  }

}
