package course.codingBat.warmUp2;

/*
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"
 */

public class StringBits {

    public static void main(String[] args) {
        System.out.println(stringBits("Hello"));
        System.out.println(stringBits("Hi"));
        System.out.println(stringBits("Heeololeo"));
        System.out.println(stringBits(""));
    }

    public static String stringBits(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if ( i % 2 == 0 ) {
                result += str.charAt(i);
            }
        }
        return result;
    }
}
