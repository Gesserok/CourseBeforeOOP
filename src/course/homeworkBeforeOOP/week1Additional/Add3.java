package course.homeworkBeforeOOP.week1Additional;


//3) Дано трехзначное число. Определить: а) верно ли, что все его цифры
//        одинаковые; б) есть ли среди его цифр одинаковые.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Add3 {
    public static void main(String[] args) {

        int a = 123;

        if (!allNumbersEquals(a)) {
            someNumbersEquals(a);
        }


    }

    private static boolean allNumbersEquals(int i) {

        if (i/100 == (i%100)/10 && i/100 == (i%10) && (i%100)/10 == (i%10)) {
            System.out.println("all is");
            return true;
        }

        return false;
    }


    private static boolean someNumbersEquals(int i) {

        if (i/100 == (i%100)/10 || i/100 == (i%10) || (i%100)/10 == (i%10)) {
            System.out.println("some is");
            return true;
        } else {
            System.out.println("no one");
            return false;
        }


    }

}
