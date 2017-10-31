package course.homeworkBeforeOOP.week1Additional;


//5) Даны три числа a, b, c. Определить, имеется ли среди них хотя бы одна
//        пара равных

import java.util.Scanner;

public class Add5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st number:");
        int a = scanner.nextInt();
        System.out.println("Enter 2nd number:");
        int b = scanner.nextInt();
        System.out.println("Enter 3rt number:");
        int c = scanner.nextInt();

        if (a == b || a == c || b == c)
            System.out.println("There is a pair of identical numbers");
        else
            System.out.println("There is not a pair of identical numbers");

    }
}
