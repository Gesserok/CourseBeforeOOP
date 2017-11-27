package course.codingBat.recursion1;

public class NoX {
    public static void main(String[] args) {
        System.out.println(noX("asdasdxasdasd"));
    }

    public static String noX(String str) {
        String string = str.substring(str.length()-1, str.length());
        str = str.substring(0,str.length()-1);

        if (string.equals("x")) {
            string = "";
        }

        return str + string;
    }
}
