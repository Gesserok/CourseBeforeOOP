package course.codingBat.recursion1;

public class ChangePi {

    public static void main(String[] args) {
        System.out.println(changePi("xpipix"));
    }

    public static String changePi(String str) {
        if (str.equals("") || str.length() < 2) return str;

        if (str.charAt(0) == 'p' && str.charAt(1) == 'i') {
            return "3.14" + changePi(str.substring(2));
        }
        return str.charAt(0) + changePi(str.substring(1));
    }

}
