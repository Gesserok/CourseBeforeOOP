package course.codingBat.recursion1;

public class CountX {

    public static void main(String[] args) {
        System.out.println(countX("xxasxxxdffghjx"));
    }

    public static int countX(String str) {
        if (str.length() == 0) return 0;
        int count = 0;
        String strCount = str.substring(str.length() -1, str.length());
        str = str.substring(0, str.length() - 1);
        if (strCount.equals("x")) {
            count += 1;
        }

        return count += countX(str);
    }
}
