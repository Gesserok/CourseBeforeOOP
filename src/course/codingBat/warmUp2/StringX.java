package course.codingBat.warmUp2;

/*
Given a string, return a version where all the "x" have been removed.
Except an "x" at the very start or end should not be removed.

stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
 */

public class StringX {
    public static void main(String[] args) {
        System.out.println("abxxxcd - " + stringX("abxxxcd"));
        System.out.println("xabxxxcdx - " +stringX("xabxxxcdx"));
        System.out.println("xxHxix - " + stringX("xxHxix"));
        System.out.println("xx - " +stringX("xx"));
        System.out.println("xxx - " + stringX("xxx"));
        System.out.println("empty - " + stringX(""));


    }

    public static String  stringX(String str) {
        if (str.isEmpty()) return str;
        else if (str.length() < 3) return str;
        else return str.substring(0,1).concat((str.substring(1, str.length()-1)).replaceAll("x", "")).concat(str.substring(str.length()-1,str.length()));
    }
}

/*
Solution:

public String stringX(String str) {
  String result = "";
  for (int i=0; i<str.length(); i++) {
    // Only append the char if it is not the "x" case
    if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
      result = result + str.substring(i, i+1); // Could use str.charAt(i) here
    }
  }
  return result;
}
 */