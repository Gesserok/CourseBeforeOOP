package course.codingBat.recursion1;

/*Given a string and a non-empty substring sub, compute recursively the largest
substring which starts and ends with sub and return its length.


strDist("catcowcat", "cat") → 9
strDist("catcowcat", "cow") → 3
strDist("cccatcowcatxx", "cat") → 9
*/

public class StrDist {
    public static void main(String[] args) {
        System.out.println(strDist("catwalcat", "cat"));
    }

    public static int strDist(String str, String sub) {
        int size = 0;
        if (str == null || str.isEmpty() || str.length() < sub.length()) return size;

        if (str.endsWith(sub)) {
            if (str.startsWith(sub)){
                return str.length();
            }
            return strDist(str.substring(1), sub);
        }
        return strDist(str.substring(0, str.length()-1), sub);

    }
}
