package course.codingBat.recursion1;

public class ChangeXY {

    public static void main(String[] args) {
        System.out.println(changeXY("xsdfxdsfdxxadff"));
    }

    public static String changeXY(String str) {
        if (str.length() == 0) return "";

        String strX = str.substring(str.length()-1, str.length());
        if (strX.equals("x")) {
            strX = "y";
        }
        return changeXY(str.substring(0, str.length()-1)) + strX;
     }
}
