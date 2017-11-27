package course.codingBat.recursion1;

public class BunnyEars {

    public static void main(String[] args) {
        System.out.println(bunnyEars(5));
    }

    public static int bunnyEars(int bunnies) {
        if (bunnies <= 0) return 0;

        int bunnyEars = 0;
        if (bunnies > 1) {
            bunnyEars = bunnyEars(bunnies - 1);
        }
        return bunnyEars + 2;
    }
}
