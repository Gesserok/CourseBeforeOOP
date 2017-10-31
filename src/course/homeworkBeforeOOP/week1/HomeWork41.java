package course.homeworkBeforeOOP.week1;

import course.homeworkBeforeOOP.NumericClass;

import java.util.Scanner;


//4.1. Пользователь вводит параметр с консоли (текущий час от 0 до 24)
//        Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")


public class HomeWork41 {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String s = new String();
        int hour = 0;
        boolean b;
        do {
            s = scanner.next();
            b= NumericClass.isInteger(s);
            if (b) {
                hour = Integer.parseInt(s);
                if ((hour > 23 || hour < 0)) System.out.println("Время от 0 до 23 включительно");
            }
        } while (!b || (hour > 23 || hour < 0));

        if (hour > 8 && hour < 18) System.out.println("Я на работе");
        else System.out.println("Я отдыхаю");
    }


}
