package course.homeworkBeforeOOP.week1;

import course.homeworkBeforeOOP.NumericClass;

import java.util.Scanner;

//4.7. Вводим два числа, если одно из них делиться на другое без остатка, то выводим тру и показываем результат деления (целую часть от деления  и остачу)
//        в другом случае выводим false и показываем результат деления (целую часть от деления  и остачу)


public class HomeWork47 {
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

        int min = minMaxAbs(a, b)[0];
        int max = minMaxAbs(a, b)[1];

        if (min != 0 || max != 0) {
            if (min!=0) {
                if (max % min == 0) System.out.println("true " + max/min + " " + max%min);
                else System.out.println("false " + max/min + " " + max%min);
            } else {
                System.out.println("true " + min/max + " " + min%max);
            }
        } else System.out.println("Impossible");
    }
    private static int[] minMaxAbs(String x, String y){
        int [] minMax = new int[2];
        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        if (Math.abs(a) <= Math.abs(b)) {
            minMax[0] = a;
            minMax[1] = b;
        } else {
            minMax[0] = b;
            minMax[1] = a;
        }
        return minMax;
    }
}
