package course.codingBat.recursion1;

public class BunnyEars2 {

    public static void main(String[] args) {
        System.out.println(bunnyEars2(1));
        System.out.println(bunnyEars2(2));
        System.out.println(bunnyEars2(3));
        System.out.println(bunnyEars2(4));
        System.out.println(bunnyEars2(5));
    }


    public static int bunnyEars2(int bunnies) {
        if (bunnies <= 0) return 0;

        int bunnyEars = 0;
        if (bunnies >  0) {
            bunnyEars = bunnyEars2(bunnies - 1);
        }
        if (bunnies % 2 == 0) {
            return bunnyEars + 3;
        }
        return bunnyEars + 2;
    }
}