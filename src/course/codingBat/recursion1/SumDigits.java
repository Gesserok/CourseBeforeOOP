package course.codingBat.recursion1;

public class SumDigits {

    public static void main(String[] args) {
        System.out.println(sumDigits(127));
    }

    public static int sumDigits(int n) {

        if (n == 0) return 0;

        int summ = 0;
        if (n / 10 > 0) {
            summ = sumDigits(n / 10);
        }

        return summ += n % 10;

    }
}
