package course.homeworkBeforeOOP.week1;

import course.homeworkBeforeOOP.NumericClass;

import java.util.Scanner;



//4.8. Вводим два числа, сравнить последнии цифры этих чисел (пользоваться оператором %)
//        124    4    -   true
//        1456   567  -   false
//        1      2    -   false
//        18     98   -   true



public class HomeWork48 {
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

        if (Integer.parseInt(a)%10 == Integer.parseInt(b)%10) System.out.println(a + " " + b + " - " + "true");
        else System.out.println(a + " " + b + " - " + "false");


    }
}
