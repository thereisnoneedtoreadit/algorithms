package org.example;

import java.util.HashMap;
import java.util.Map;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
//
//        Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        //return bruteForce(nums, target);
        return improved(nums, target);
    }


    // O(N^2)
    public int[] bruteForce(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return new int[0];
        }
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if ((i + 1) < nums.length) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        result[0] = i;
                        result[1] = j;
                    }
                }
            }
        }
        return result;
    }


    // O(N)
    public int[] improved(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return new int[0];
        }
        int[] result = new int[2];

        Map<Integer, Integer> supplements = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer supplementIdx = supplements.get(target - nums[i]);
            if (supplementIdx != null) {
                result[0] = i;
                result[1] = supplementIdx;
            } else {
                supplements.put(nums[i], i);
            }
        }
        return result;
    }

}
