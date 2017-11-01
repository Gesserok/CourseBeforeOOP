package course.codingBat.warmUp1;


//Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.
//
//
//        delDel("adelbc") → "abc"
//        delDel("adelHello") → "aHello"
//        delDel("adedbc") → "adedbc"


public class DelDel {
    public static void main(String[] args) {
        System.out.println(delDel("delafsd"));
        System.out.println(delDel("adelafsd"));
        System.out.println(delDel("aadelbb"));
    }
    public static String delDel(String str) {
        if (str.contains("del") && !str.startsWith("del")) {
            String[] strSpit = str.split("del");
            String result = "";
            for (String x : strSpit) {
                result += x;
            }
            return result;
        } else return str;
    }
}




/*


 */
