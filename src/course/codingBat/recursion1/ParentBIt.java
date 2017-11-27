package course.codingBat.recursion1;

/*
* Given a string that contains a single pair of parenthesis,
* compute recursively a new string made of only of the parenthesis and their contents,
* so "xyz(abc)123" yields "(abc)".


parenBit("xyz(abc)123") → "(abc)"
parenBit("x(hello)") → "(hello)"
parenBit("(xy)1") → "(xy)"
*/

public class ParentBIt {

    public static void main(String[] args) {
        System.out.println(parenBit("xyz(abc)123"));
    }

    public static String parenBit(String str) {
        if (str == null) return "";
        if (str.isEmpty()) return str;

        if (str.charAt(0) == '(') {
            if (str.charAt(str.length()-1) == ')') {
                return str;
            }
            return parenBit(str.substring(0, str.length() - 1));
        }
        return parenBit(str.substring(1));
    }

}
