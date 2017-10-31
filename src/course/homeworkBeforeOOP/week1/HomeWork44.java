package course.homeworkBeforeOOP.week1;

import course.homeworkBeforeOOP.NumericClass;

import java.math.BigDecimal;
import java.util.Scanner;

//4.4. Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1


public class HomeWork44 {

    public static void main(String[] args) {
        String a = new String();
        Scanner scanner = new Scanner(System.in);
        boolean b;
        do {
            a = scanner.next();
            b = NumericClass.isDouble(a);
            if (!b) System.out.println(a + " - isn't numeric");
        } while (!b);
        a = changePoint(a);
        BigDecimal bd = new BigDecimal(a);
        if (bd.compareTo(BigDecimal.ZERO) == -1 || bd.compareTo(BigDecimal.ONE) == 1) {
            System.out.println("Не лежит в диапазоне от 0 до 1");
        }   else {
            System.out.println("Лежит в диапазоне от 0 до 1");
        }


    }


    private static String changePoint(String s){
        return s.replace(',', '.');
    }

}
