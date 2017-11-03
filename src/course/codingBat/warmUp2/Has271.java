package course.codingBat.warmUp2;

/*
Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5,
followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.

has271([1, 2, 7, 1]) → true
has271([1, 2, 8, 1]) → false
has271([2, 7, 1]) → true
 */
public class Has271 {
    public static void main(String[] args) {
        System.out.println(has271(new int[]{3,8,2}));
    }

    public static boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int val = nums[i];
            if (nums[i + 1] == (val + 5) &&              // the "7" check
                    Math.abs(nums[i + 2] - (val - 1)) <= 2) {  // the "1" check
                return true;
            }
        }
        return false;
    }
}
