package course.codingBat.recursion1;

public class Count7 {

    public static void main(String[] args) {
        System.out.println(count7(1774));
    }

    public static int count7(int n) {


        int count = 0;
        if (n / 10 > 0) {
            count = count7(n / 10);
        }
        if (n % 10 == 7) {
            return count + 1;
        }
        return count;
    }

}
