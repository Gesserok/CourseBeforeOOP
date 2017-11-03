package course.homeworkBeforeOOP.week3.homework312.password;

import java.util.Scanner;

public class PasswordGeneration {

    public static String manualPasswordGenerator(){
        Scanner scanner = new Scanner(System.in);
        String pass1 = scanner.nextLine();
        String pass2 = scanner.nextLine();
        if (pass1.equals(pass2)) {
            if (PasswordControl.meetTheConditions(pass1)) {
                return pass1;
            } else return "Password isn't satisfying the conditions";
        }
        else return "Password isn't satisfying the conditions";
    }


    public static String automaticPasswordGenerator(){
        String str = new String();
        for (int i = 0; i < 20; i++) {
            int x;
            do {
                x = (int) (Math.random() * 200);
            } while (!(((47 < x) && x < 58) || ((64 < x) && x < 91) || ((96 < x) && x < 123)));
            str += (char)x;
        }
        return String.valueOf(str);
    }


}
