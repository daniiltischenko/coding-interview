package leetcode;

/**
 * @author Daniil Tyshchenko
 * @version 0.0.1
 * @since 0.0.1
 */
public class Task_1108_Defanging_an_IP_Address {

  public static void main(String[] args) {
    System.out.println(defangIPaddr("1.1.1.1").equals("1[.]1[.]1[.]1"));
  }

//  static String defangIPaddr(String address) {
//    return address.replace(".", "[.]");
//  }

  static String defangIPaddr(String address) {
    char[] chars = address.toCharArray();
    char[] defanged = new char[chars.length + 6];

    for (int i = 0, j = 0; i < chars.length; i++, j++) {
      if (chars[i] == '.') {
        defanged[j] = '[';
        defanged[j+1] = '.';
        defanged[j+2] = ']';
        j += 2;
      } else {
        defanged[j] = chars[i];
      }

    }

    return new String(defanged);

  }

}
