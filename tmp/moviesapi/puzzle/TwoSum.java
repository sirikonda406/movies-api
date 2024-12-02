package com.mahesh.movies.api.moviesapi.puzzle;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            return checkSumEqualToTarget(nums, i, target);
        }
        return nums;
    }

    private static int[] checkSumEqualToTarget(int[] nums, int i, int target) {
        int[] indexes = new int[2];
        for (int j = 0; j < nums.length; j++) {
            if (i != j) {
                if (nums[i] + nums[j] == target) {
                    indexes[0] = i;
                    indexes[1] = j;
                    return indexes;
                }
            }
        }
        return indexes;
    }

   /* public static int[] twoSum(int[] nums, int target) {
        int[] indexes = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] + nums[j] == target) {
                        indexes[0] = i;
                        indexes[1] = j;
                        return indexes;
                    }
                }
            }
        }
        return indexes;
    }*/


    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 4};
        int[] sumIndex = twoSum(nums, 6);
        System.out.println("(" + sumIndex[0] + "," + sumIndex[1] + ")");
    }
}
