package course.homeworkBeforeOOP;

public class NumericClass {
    public static boolean isInteger(String s) {
        if (s == null || s.isEmpty()) return false;

        if (Character.isDigit(s.codePointAt(0))) {
            for (int i = 1; i < s.length(); i++) {
                if (!Character.isDigit(s.codePointAt(i))) return false;
            }
            return true;
        } else {
            if ((s.codePointAt(0)) == '-' && s.length() > 1) {
                for (int i = 1; i < s.length(); i++) {
                    if (!Character.isDigit(s.codePointAt(i))) return false;
                }
                return true;
            } else return false;

        }
    }

    public static boolean isDouble(String s) {
        int point = 0;
        if (s == null || s.isEmpty()) return false;

        if (Character.isDigit(s.codePointAt(0))) {
            for (int i = 1; i < s.length(); i++) {
                if (!Character.isDigit(s.codePointAt(i))) {
                    if (s.codePointAt(i) == '.' || s.codePointAt(i) == ',') {
                        point ++; {
                            if (point >1 || i == s.length()-1) {
//                                System.out.println("Not a number");
                                return false;
                            }
//                            else System.out.println(" It's a Double");
                        }
                    }
                }
            }
            return true;
        } else {
            if ((s.codePointAt(0)) == '-' && s.length() > 1) {
                for (int i = 1; i < s.length(); i++) {
                    if (!Character.isDigit(s.codePointAt(i))) {
                        if (s.codePointAt(i) == '.' || s.codePointAt(i) == ',') {
                            point ++; {
                                if (point >1 || i == s.length()-1 || i == 1) {
//                                    System.out.println("Not a number");
                                    return false;
                                }
//                                else System.out.println(" It's a Double");
                            }
                        }
                    }
                }
                return true;
            } else return false;

        }
    }

    public static boolean isIntegerPlus(String s) {
        if (s == null || s.isEmpty()) return false;

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.codePointAt(i))) return false;
        }
        return true;
    }



}