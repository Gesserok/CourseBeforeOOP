package course.homeworkBeforeOOP.week2;

//2.2 Проверить или является число простым

import java.math.BigInteger;
import java.util.Date;

public class HomeWork72 {
    public static void main(String[] args) {
        Date startTime = new Date();
        System.out.println(isPrimeNumber((int) (Math.pow(2, 31)-1)));
        Date finishTime = new Date();

        System.out.println(finishTime.getTime() - startTime.getTime());
    }

    private static boolean isPrimeNumber(int number) {
        if (number == 2) return true;
        else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) return false;
            }
            return true;
        }
    }
}
