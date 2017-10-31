package course.homeworkBeforeOOP.week1;

import course.homeworkBeforeOOP.NumericClass;

import java.util.Scanner;


//4.3. Пользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело.

public class HomeWork43 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = new String();
        boolean b;
        do {
            s = scanner.next();
            b = NumericClass.isInteger(s);
            if (b) {
                if(Integer.parseInt(s)%7==0)    System.out.println(Integer.parseInt(s)*2);
                else System.out.println("Не делится на 7");
            }
        } while (!b);
    }
}
