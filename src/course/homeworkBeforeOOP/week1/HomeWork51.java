package course.homeworkBeforeOOP.week1;

import course.homeworkBeforeOOP.NumericClass;

import java.util.Scanner;


//5.1. Перевод с числа с десятичной системы счисления в двоичную, и наоборот. Пользователь сам вводит число


public class HomeWork51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = new String();
        do {
            s1 = scanner.next();
        } while (!NumericClass.isInteger(s1));

        long dec = Long.parseLong(s1);

        System.out.println(("Integer.toBinaryString(a) - " + Long.toBinaryString(dec)));
        String s = new String();
        while (dec > 0) {
            s = String.valueOf(dec%2)+s;
            dec = dec/2;
        }
        System.out.println("Binary by myself          - " + s);

        long decimal = 0;
        long j = 0;
        for (int i = s.toCharArray().length - 1; i >=0; i--) {
             decimal = decimal + Long.parseLong(String.valueOf(s.toCharArray()[i]))*(long)Math.pow(2,j);
             j++;
        }

        System.out.println("From Binary to Dec by myself - " + decimal);

    }
}
