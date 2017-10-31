package course.homeworkBeforeOOP.week1;

import course.homeworkBeforeOOP.NumericClass;

import java.util.Scanner;

//4.6. Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19.

public class HomeWork46 {
    public static void main(String[] args) {
        String a = new String();
        String b = new String();

        Scanner scanner = new Scanner(System.in);

        do {
            a = scanner.next();
        } while (!NumericClass.isInteger(a));

        do {
            b = scanner.next();
        } while (!NumericClass.isInteger(b));
        int sum = Integer.parseInt(a) + Integer.parseInt(b);
        if (sum > 10 && sum < 20) System.out.println(a+b);
    }
}
