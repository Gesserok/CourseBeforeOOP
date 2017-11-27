package course.codingBat.recursion1;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        if (n == 0) return 1;
        int fact = 0;
        if (n > 0) {
            fact = n * factorial(n - 1);
        }
        return fact;
    }
}
