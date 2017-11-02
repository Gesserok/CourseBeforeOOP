package course.codingBat.warmUp2;

/*
Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3
 */

public class CountXX {
    public static void main(String[] args) {
        System.out.println(countXX("x"));
        System.out.println(countXX("xx"));
        System.out.println(countXX("xxx"));
        System.out.println(countXX("xxxx"));
    }

    static int countXX(String str) {
        String foundStr = "xx";
        int count = 0 ;
        if (str.length() > 1) {
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.substring(i, i + 2).equals(foundStr))
                    count++;
            }
        }
        return count;
    }
}
