package course.homeworkBeforeOOP.week1;

import course.homeworkBeforeOOP.NumericClass;

import java.util.Scanner;


//4.2. Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее


public class HomeWork42 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++) {
            String s = new String();
            do {
                s = scanner.next();
            } while (!NumericClass.isInteger(s));
            a[i] = Integer.parseInt(s);
        }
        System.out.println(max(a) + " " + min(a));
    }

    private static int min(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    private static int max(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }


}
