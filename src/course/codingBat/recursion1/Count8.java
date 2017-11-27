package course.codingBat.recursion1;

public class Count8 {

    public static void main(String[] args) {
        System.out.println(count8(8818));
        System.out.println(count8(818));
    }


    public static int count8(int n) {
        int count = 0;
        if (n / 10 > 0) {
            count = count8(n / 10);
        }
        if (n % 10 == 8) {
            if (n % 100 == 88) {
                return count + 2;
            }
            return count + 1;
        }
        return count;
    }
}
