package course.codingBat.warmUp1;

public class WarmUp1 {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else return false;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile)
            return true;
        else if (!aSmile && !bSmile)
            return true;
        else return false;
    }

    public int sumDouble(int a, int b) {
        if (a<b) return b+a;
        else if (a>b) return a+b;
        else return 2*(a+b);
    }

    public int diff21(int n) {
        if (n<21) return 21-n;
        else if (n==21) return n-21;
        else return 2*(n-21);
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour < 7 || (hour > 20 && hour < 24))) {
            return true;
        }
        else return false;
    }

    public boolean makes10(int a, int b) {
        if ( (a == 10 || b == 10 || a + b == 10)) return true;
            else return false;
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            if (a < 0 && b < 0) return true;
            return false;
        } else {
            if (a < 0 && b > 0) return true;
            else if (a > 0 && b < 0) return true;
            else return false;
        }
    }

    public String notString(String str) {
        if (str.startsWith("not")) return str;
        else return "not "+str;
    }

    public String missingChar(String str, int n) {
        String front = str.substring(0, n);

        // Start this substring at n+1 to omit the char.
        // Can also be shortened to just str.substring(n+1)
        // which goes through the end of the string.
        String back = str.substring(n+1, str.length());

        return front + back;
    }

    public String frontBack(String str) {
        if (str.length() <= 1) return str;

        String mid = str.substring(1, str.length()-1);

        // last + mid + first
        return str.charAt(str.length()-1) + mid + str.charAt(0);
    }


}
