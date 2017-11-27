package course.codingBat.recursion1;

public class Triangle {

    public static void main(String[] args) {

        System.out.println(triangle(4));
    }

    public static int triangle(int rows) {

        if (rows == 0) return 0;

        int summ = 0;
        if (rows > 0) {
            summ = triangle(rows-1);
        }

        return summ + rows;

    }
}
