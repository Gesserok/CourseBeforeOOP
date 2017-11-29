package course.codingBat.recursion2;
/*
Given an array of ints, is it possible to choose a group of some of the ints,
such that the group sums to the given target, with this additional constraint:
if there are numbers in the array that are adjacent and the identical value,
they must either all be chosen, or none of them chosen.
For example, with the array {1, 2, 2, 2, 5, 2}, either all three 2's
in the middle must be chosen or not, all as a group. (one loop can be used
to find the extent of the identical values).


groupSumClump(0, [2, 4, 8], 10) → true
groupSumClump(0, [1, 2, 4, 8, 1], 14) → true
groupSumClump(0, [2, 4, 4, 8], 14) → false*/


public class GroupSumClump {
    public static void main(String[] args) {
        System.out.println(groupSumClump(0, new int[]{8, 2, 2, 1}, 9));
    }

    public static boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length) return target == 0;


        if (nums.length - 1 > start && nums[start + 1] == nums[start]) {
            return groupSumClump(start+2, nums, target - nums[start] - nums[start+1]) || groupSumClump(start+2, nums, target);
        }
        return groupSumClump(start+1, nums, target - nums[start]) ||
                groupSumClump(start+1, nums, target);
    }
}
