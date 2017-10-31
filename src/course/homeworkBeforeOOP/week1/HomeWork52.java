package course.homeworkBeforeOOP.week1;

import course.homeworkBeforeOOP.NumericClass;

import java.math.BigInteger;
import java.util.Scanner;

//5.2. Вычислить факториал числа.


public class HomeWork52 {
    public static void main(String[] args) {
        String a = new String();
        Scanner scanner = new Scanner(System.in);
        boolean isTrue;
        do {
            a = scanner.next();
            isTrue = NumericClass.isInteger(a);
            if (!isTrue) System.out.println(a + " - isn't numeric");
        } while (!isTrue);

        System.out.println(getFactorialNotRecursion(Integer.parseInt(a)));
    }

    public static BigInteger getFactorialNotRecursion(int n)
    {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}
