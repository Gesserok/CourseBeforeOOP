package course.codingBat.recursion1;

public class NestParen {

    public static void main(String[] args) {
        System.out.println(nestParen("((()"));
    }


    public static boolean nestParen(String str) {
        if (str == null) return false;
        if (str.isEmpty() && str.length() % 2 == 0) return true;

        if (str.charAt(0) == '(') {
            if (str.charAt(str.length() - 1) == ')') {
                return nestParen(str.substring(1,str.length() - 1));
            }
        }
        return false;
    }
}
