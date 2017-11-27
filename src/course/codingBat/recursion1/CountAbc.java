package course.codingBat.recursion1;
/*
Count recursively the total number of "abc" and "aba" substrings that appear in the given string.


countAbc("abc") → 1
countAbc("abcxxabc") → 2
countAbc("abaxxaba") → 2
*/
public class CountAbc {

    public static void main(String[] args) {
        System.out.println(countAbc("abaxxaba"));
    }

    public static int countAbc(String str) {
        int count = 0;
        if (str == null || str.length() < 3) return count;

        if (str.substring(0,3).equals("abc") || str.substring(0,3).equals("aba")) {
            return count + 1 + countAbc(str.substring(2));
        }

        return count + countAbc(str.substring(1));
    }

}
