package course.codingBat.warmUp2;

/*

Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
 */

public class DoubleX {
    public static void main(String[] args) {
        System.out.println(doubleX("asdf"));
    }
    static boolean doubleX(String str) {
        System.out.println(str.indexOf("x"));
        if (str.isEmpty() || str.length() < 2 ) return false;
        else if (str.contains("x") && str.indexOf("x") < str.length()-1) {
            return (str.substring(str.indexOf("x"), str.indexOf("x") + 2).equals("xx")) ? true : false;
        }
        else return false;
    }
}

/*
Solution:
boolean doubleX(String str) {
  int i = str.indexOf("x");
  if (i == -1) return false; // no "x" at all

  // Is char at i+1 also an "x"?
  if (i+1 >= str.length()) return false; // check i+1 in bounds?
  return str.substring(i+1, i+2).equals("x");

  // Another approach -- .startsWith() simplifies the logic
  // String x = str.substring(i);
  // return x.startsWith("xx");
}
 */