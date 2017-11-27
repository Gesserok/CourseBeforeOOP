package course.codingBat.recursion1;

/*Given a string and a non-empty substring sub, compute recursively
the number of times that sub appears in the string, without the sub strings overlapping.


        strCount("catcowcat", "cat") → 2
        strCount("catcowcat", "cow") → 1
        strCount("catcowcat", "dog") → 0*/

public class StrCount {
    public static void main(String[] args) {
        System.out.println(strCount("catcowcat", "dog"));
    }

    public static int strCount(String str, String sub) {
        int count = 0;
        if (str == null || str.length() < sub.length()) return count;

        if (str.substring(0, sub.length()).equals(sub)) {
            return count + 1 + strCount(str.substring(sub.length()), sub);
        }
        return count + strCount(str.substring(1), sub);
    }
}

