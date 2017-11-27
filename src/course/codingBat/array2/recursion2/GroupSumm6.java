package course.codingBat.array2.recursion2;

/*
Given an array of ints, is it possible to choose a group of some of the ints,
beginning at the start index, such that the group sums to the given target?
However, with the additional constraint that all 6's must be chosen.
(No loops needed.)


        groupSum6(0, [5, 6, 2], 8) → true
        groupSum6(0, [5, 6, 2], 9) → false
        groupSum6(0, [5, 6, 2], 7) → false*/


import java.util.Arrays;

public class GroupSumm6 {
    public static void main(String[] args) {
        System.out.println(groupSum6(0, new int[]{5, 6, 2}, 8));
        System.out.println(groupSum6(0, new int[]{5, 6, 2}, 9));
        System.out.println(groupSum6(0, new int[]{5, 6, 2}, 7));
    }

    public static boolean groupSum6(int start, int[] nums, int target) {
        if (nums.length == start) {
            return target == 0;
        }

        boolean res1 = groupSum6(start + 1, nums, target - nums[start]);
        boolean res2 = false;

        if (nums[start] != 6) {
            res2 = groupSum6(start + 1, nums, target);
        }

        return res1 || res2;
    }

}
