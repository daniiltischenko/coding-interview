package leetcode.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Daniil Tyshchenko
 * @version 0.0.1
 * @since 0.0.1
 */
public class Remove_Outermost_Parentheses_1021 {

  public static void main(String[] args) {
    System.out.println(removeOuterParentheses_01("(()())(())").equals("()()()"));
    System.out.println(removeOuterParentheses_01("(()())(())(()(()))").equals("()()()()(())"));
    System.out.println(removeOuterParentheses_01("()()").equals(""));
  }

  static String removeOuterParentheses_01(String S) {
    char[] chars = S.toCharArray();

    int open = 0;
    int close = 0;
    int start = 1;
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == '(') {
        open++;
      } else {
        close++;
      }

      if (open == close) {
        start = i+2;
        continue;
      }

      if (i >= start) {
        result.append(chars[i]);
      }

    }

    return result.toString();
  }

}
