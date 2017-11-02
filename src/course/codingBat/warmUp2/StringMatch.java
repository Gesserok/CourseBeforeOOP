package course.codingBat.warmUp2;

/*

Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.


stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0
*/


public class StringMatch {
    public static void main(String[] args) {
        System.out.println(stringMatch("aabbccdd", "abbbxxd"));
        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
        System.out.println(stringMatch("abc", "abc"));
        System.out.println(stringMatch("abc", "axc"));
    }

    public static int stringMatch(String a, String b) {
        String substr = "";
        int count = 0;
        for (int i = 0; i < a.length() - 1; i++) {
            substr = a.substring(i, i + 2);
            for (int j = 0; j < b.length() - 1; j++) {
                if (b.substring(j, j+2).equals(substr) && i == j) {
                    count++;
                }
            }
        }
    return count;
    }
}

/*
Solution:
public int stringMatch(String a, String b) {
  // Figure which string is shorter.
  int len = Math.min(a.length(), b.length());
  int count = 0;

  // Look at both substrings starting at i
  for (int i=0; i<len-1; i++) {
    String aSub = a.substring(i, i+2);
    String bSub = b.substring(i, i+2);
    if (aSub.equals(bSub)) {  // Use .equals() with strings
      count++;
    }
  }

  return count;
}
*/
