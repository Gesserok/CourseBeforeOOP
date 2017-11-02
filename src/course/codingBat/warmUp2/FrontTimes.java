package course.codingBat.warmUp2;

/*
Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
or whatever is there if the string is less than length 3. Return n copies of the front;

frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
 */

public class FrontTimes {
    public static void main(String[] args) {
        System.out.println(frontTimes("as", 5));
    }
    public static String frontTimes(String str, int n) {
        String copyStr = "";
        for (int i = 0; i < n; i ++) {
            if (str.length() > 3) {
                copyStr += str.substring(0, 3);
            } else {
                copyStr += str;
            }
        }
        return copyStr;
    }

}
