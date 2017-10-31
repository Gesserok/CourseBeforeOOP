package course.homeworkBeforeOOP.week1Additional;


//2) Ввести с клавиатуры три числа, положительные возвести в куб, а отрица-
//        тельные заменить на 0.

import course.homeworkBeforeOOP.NumericClass;

import java.util.Scanner;

public class Add2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = new String();
        boolean b;
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++) {
            do {
                s = scanner.next();
                b = NumericClass.isInteger(s);
            } while (!b);
            a[i] = Integer.parseInt(s);
        }
        for (int i =0; i < a.length; i++) {
            if (a[i] > 0) {
                a[i] = (int) Math.pow(a[i],3);
                System.out.println(a[i]);
            } else {
                a[i] = 0;
                System.out.println(a[i]);
            }
        }




    }
}
