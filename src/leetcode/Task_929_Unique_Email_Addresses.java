package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Task_929_Unique_Email_Addresses {

  public static void main(String[] args) {
    System.out.println(numUniqueEmails(new String[]{"test.email+alex@leetcode.com",
        "test.e.mail+bob.cathy@leetcode.com",
        "testemail+david@lee.tcode.com"}) == 2);
  }

  static int numUniqueEmails(String[] emails) {
    Set<String> set = new HashSet<>();

    for (String email : emails) {
      String[] split = email.split("@");
      String localName = split[0];
      StringBuilder newLocalName = new StringBuilder();

      for (int i = 0; i < localName.length(); i++) {
        if (localName.charAt(i) == '.') {
          continue;
        }

        if (localName.charAt(i) == '+') {
          break;
        }

        newLocalName.append(localName.charAt(i));
      }
      set.add(newLocalName.toString() + "@" + split[1]);

    }

    return set.size();
  }

}
