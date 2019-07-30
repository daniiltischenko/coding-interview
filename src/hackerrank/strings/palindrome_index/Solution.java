package hackerrank.strings.palindrome_index;

/**
 * TODO not finished!
 * @author Daniil Tyshchenko
 * @version 0.0.1
 * @since 0.0.1
 */
public class Solution {

  public static void main(String[] args) {
    System.out.println(palindromeIndex("aaa") == -1);
    System.out.println(palindromeIndex("aaab") == 3);
    System.out.println(palindromeIndex("baa") == 0);
    System.out.println(palindromeIndex("asd") == -1);
  }

  static int palindromeIndex(String s) {
    if (isPalindrome(s)) {
      return -1;
    }


    return 2;
  }

  static boolean isPalindrome(String s) {
    char[] chars = s.toCharArray();
    for (int i = 0; i < chars.length/2; i++) {
      if (!(chars[i] == chars[chars.length-1-i])) {
        return false;
      }
    }

    return true;
  }

}
