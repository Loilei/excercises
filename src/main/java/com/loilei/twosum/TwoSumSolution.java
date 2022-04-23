package com.loilei.twosum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSumSolution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, List<Integer>> givenNumbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (givenNumbers.containsKey(nums[i])) {
                givenNumbers.get(nums[i]).add(i);
            } else {
                givenNumbers.put(nums[i], new ArrayList<>());
                givenNumbers.get(nums[i]).add(i);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            int searchedNumber = target - nums[i];
            if (givenNumbers.containsKey(searchedNumber) && !isSameNumber(nums[i], searchedNumber, givenNumbers)) {
                if (nums[i] == searchedNumber) {
                    return new int[]{givenNumbers.get(searchedNumber).get(0), givenNumbers.get(searchedNumber).get(1)};
                } else {
                    return new int[]{i, givenNumbers.get(searchedNumber).get(0)};
                }
            }
        }
        throw new IllegalArgumentException("No sum found");
    }

    private boolean isSameNumber(int currentNumber, int searchedNumber, HashMap<Integer, List<Integer>> givenNumbers) {
        return currentNumber == searchedNumber && givenNumbers.get(currentNumber).size() == 1;
    }
}
