package course.codingBat;


/*
Return true if the given string contains between 1 and 3 'e' chars.

stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
 */
public class StringE {
    public static boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count+= str.charAt(i) == 'e' ? 1 : 0;
        }
        return (count >= 1 && count <= 3) ? true : false;
    }
}
