package course.homeworkBeforeOOP.week1Additional;

import course.homeworkBeforeOOP.NumericClass;

import java.util.Scanner;


//1) Ввести с клавиатуры значения трех сторон треугольника a, b и c и опреде-
//        лить, является ли он прямоугольным. Ответ вывести в виде сообщения.


public class Add1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[3];
        String s = new String();
        boolean b;
        for (int i = 0; i < a.length; i++) {
            do {
                s = scanner.next();
                b = NumericClass.isInteger(s);
                if (b) {
                    a[i] = Integer.parseInt(s);
                    if (a[i] <= 0) {
                        System.out.println("the side of the triangle must be greater than zero");
                        b=false;
                    }
                }
            } while (!b || a[i] <= 0);
            a[i] = Integer.parseInt(s);
        }

        if (Math.pow(a[0], 2) == Math.pow(a[1], 2) + Math.pow(a[2], 2) || Math.pow(a[1], 2) == Math.pow(a[0], 2) + Math.pow(a[2], 2) ||
                Math.pow(a[2], 2) == Math.pow(a[0], 2) + Math.pow(a[1], 2)) {


            System.out.println("The triangle is rectangular");
        }
            else {
            System.out.println("The triangle isn't rectangular");
        }

    }
}
