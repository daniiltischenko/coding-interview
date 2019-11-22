package hackerrank.strings.sherlock_and_valid_string;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * @author Daniil Tyshchenko
 * @version 0.0.1
 * @since 0.0.1
 */
public class Solution {

  public static void main(String[] args) throws Exception {
    //NO
    //NO
    //YES
    //NO
    //YES
    //YES
//    System.out.println(isValid("aabbcd").equals("NO"));
//    System.out.println(isValid("aabbccddeefghi").equals("NO"));
    System.out.println(isValid("abcdefghhgfedecba").equals("YES"));
    System.out.println(isValid("aaaabbcc").equals("NO"));
    System.out.println(isValid("aabbc").equals("YES"));
    System.out.println(isValid("ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd").equals("YES"));
    System.out.println(isValid(new String(Files.readAllBytes(Paths.get("1.txt")))).equals("YES"));
  }

  //[2,2,1,1]

  static String isValid(String s) {
    Map<Character, Integer> map = new HashMap<>();

    for (char ch : s.toCharArray()) {
      map.compute(ch, (character, integer) -> integer != null ? ++integer : 1);
    }

    int norm = 0;
    int dev = 1;

    Integer[] integers = map.values().toArray(new Integer[0]);
    for (int i = 1; i < integers.length; i++) {
      int prev = integers[i-1];
      int cur = integers[i];

      if (cur == prev) {
        if (norm == 0) {
          norm = cur;
          continue;
        } else {
          if (cur - norm == 0) {
            continue;
          }

          if (cur != norm) {
            if (Math.abs(cur - norm) > 1) {
              return "NO";
            }

            if (Math.abs(cur - prev) == 1 && dev--==0) {
              return "NO";
            }

            if (Math.abs(cur - prev) == 0 && dev--==0) {
              return "NO";
            }
          }
        }
      }


      if (Math.abs(cur - prev) > 1) {
        return "NO";
      }

      if (Math.abs(cur - prev) == 1 && dev--==0) {
        return "NO";
      }

    }

    return "YES";
  }

}
