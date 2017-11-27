package course.codingBat.recursion1;

/*
Given an array of ints, compute recursively if the array contains a 6.
We'll use the convention of considering only the part of the array that begins
at the given index. In this way, a recursive call can pass index+1 to move down
the array. The initial call will pass in index as 0.


array6([1, 6, 4], 0) → true
array6([1, 4], 0) → false
array6([6], 0) → true

*/

public class Array6 {

    public static void main(String[] args) {

        System.out.println(array6(new int[]{1, 4, 6}, 0));
        System.out.println(array6(new int[]{1, 6, 4}, 0));
        System.out.println(array6(new int[]{1, 4}, 0));
        System.out.println(array6(new int[]{6}, 0));
        System.out.println(array6(new int[]{}, 0));
        System.out.println(array6(null, 0));
    }

    public static boolean array6(int[] nums, int index) {
        if (nums == null || nums.length == 0 || index == nums.length) return false;

        if (nums[index] == 6) {
            return true;
        }
        return array6(nums,index+1);
    }

}
