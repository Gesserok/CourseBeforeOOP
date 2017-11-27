package course.codingBat.recursion1;

/*
Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that value times 10. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.


array220([1, 2, 20], 0) → true
array220([3, 30], 0) → true
array220([3], 0) → false*/

public class Array220 {

    public static void main(String[] args) {
        System.out.println(array220(new int[] {20, 2, 26},0));
//        System.out.println(array220(new int[] {0},0));
//        System.out.println(array220(new int[] {21, 1, 22},0));



    }

    public static boolean array220(int[] nums, int index) {
        if (nums == null || nums.length == 0 || index >= nums.length -1)
            return false;

        if (nums[index+1] == nums[index] * 10) {
            return true;
        }
        return array220(nums, index + 1);





    }
//
//    public static int findMax(int[] nums, int index) {
//        if (nums.length > index) {
//            int next = findMax(nums, index + 1);
//            System.out.println("next=" + next + " index=" + index);
//            return (nums[index] > next) ? nums[index] : next;
//        } else {
//            return nums[0];
//        }
//    }
}
