package course.codingBat.warmUp2;

/*
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
 */

public class AltPairs {
    public static void main(String[] args) {
        System.out.println(altPairs(""));
        System.out.println(altPairs("x"));
        System.out.println(altPairs("0123"));
        System.out.println(altPairs("012345"));
        System.out.println(altPairs("01234567890"));
        System.out.println(altPairs("01234567890x01234567890"));
    }

    public static String altPairs(String str) {
        String result = "";
        for( int i = 0; i < str.length(); i++) {
            if (i % 4 == 0) {
                result += str.charAt(i);
                if (str.length() > i+1) {
                    result += str.charAt(i+1);
                }
            }
        }
        return result;
    }
}
/*
Solution:

public String altPairs(String str) {
  String result = "";

  // Run i by 4 to hit 0, 4, 8, ...
  for (int i=0; i<str.length(); i += 4) {
    // Append the chars between i and i+2
    int end = i + 2;
    if (end > str.length()) {
      end = str.length();
    }
    result = result + str.substring(i, end);
  }

  return result;
}
 */
