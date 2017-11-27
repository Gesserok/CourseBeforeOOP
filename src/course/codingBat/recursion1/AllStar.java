package course.codingBat.recursion1;

/*
Given a string, compute recursively a new string where
all the adjacent chars are now separated by a "*".


allStar("hello") → "h*e*l*l*o"
allStar("abc") → "a*b*c"
allStar("ab") → "a*b"*/

public class AllStar {

    public static void main(String[] args) {
        System.out.println(allStar("aaaaaaaa"));
        System.out.println(allStar(""));
        System.out.println(allStar(null));
    }

    public static String allStar(String str) {
        if (str == null || str.isEmpty() || str.length() == 1) return str;
        String charStr = str.substring(0,1);
        String strSub = str.substring(1);
        return charStr +"*" + allStar(strSub);


    }

}
