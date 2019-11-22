package leetcode;

public class Task_1221_Split_a_String_in_Balanced_Strings {

  public static void main(String[] args) {
    System.out.println(balancedStringSplit("RLRRRLLRLL"));
  }

  public static int balancedStringSplit(String s) {
    if (s.length() < 2) {
      return 0;
    }

    char[] chars = s.toCharArray();

    char prev = chars[0];
    int innerNum = 1;
    int answer = 0;
    for (int i = 1; i < chars.length; i++) {
      if (chars[i] == prev) {
        innerNum++;
      } else {
        innerNum--;
      }

      if (innerNum == 0) {
        answer++;
      }
    }

    return answer;
  }
}
