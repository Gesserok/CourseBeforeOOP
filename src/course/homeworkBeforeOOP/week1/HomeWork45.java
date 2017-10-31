package course.homeworkBeforeOOP.week1;

import course.homeworkBeforeOOP.NumericClass;

import java.util.Scanner;

//4.5. Вводим 2 числа. Если первое число больше второго, то вывести на экран разницу чисел. Если второе больше, то выводим сумму.


public class HomeWork45 {
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


        if (Integer.parseInt(a) > Integer.parseInt(b)) System.out.println(Integer.parseInt(a)-Integer.parseInt(b));
        else if (Integer.parseInt(a) == Integer.parseInt(b)) System.out.println("Числа равны");
        else System.out.println(Integer.parseInt(a)+Integer.parseInt(b));

    }


}
