package course.homeworkBeforeOOP.week1Additional;


//7) Ввести с экрана число от 1 до 12. По номеру месяца выдать сообщение о
//        времени года. Если пользователь введет недопустимое число, программа
//        должна выдать сообщение об ошибке.

import java.util.Scanner;

public class Add7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Номер месяца");
        int number = scanner.nextInt();
        if (number < 1 || number > 12) {
            System.out.println("Ошибка! Такого месяца нет");
        } else {
            if (number == 12 || number == 1 || number == 2) {
                System.out.println("Зима");
            } else if (number > 2 && number < 6) {
                System.out.println("Весна");
            } else if (number > 5 && number < 9) {
            System.out.println("лето");
            } else {
            System.out.println("Осень");
        }
        }
    }
}
