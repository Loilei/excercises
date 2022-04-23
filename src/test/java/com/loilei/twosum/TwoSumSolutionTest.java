package com.loilei.twosum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumSolutionTest {

    @Test
    void givenProperArray_shouldReturnProperSolutionTest1() {
        //given
        var TwoSumSolution = new TwoSumSolution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expectedOutcome = {0, 1};
        //when
        int[] solution = TwoSumSolution.twoSum(nums, target);
        //then
        assertEquals(expectedOutcome[0], solution[0]);
        assertEquals(expectedOutcome[1], solution[1]);
    }

    @Test
    void givenProperArray_shouldReturnProperSolutionTest2() {
        //given
        var TwoSumSolution = new TwoSumSolution();
        int[] nums = {3, 3};
        int target = 6;
        int[] expectedOutcome = {0, 1};
        //when
        int[] solution = TwoSumSolution.twoSum(nums, target);
        //then
        assertEquals(expectedOutcome[0], solution[0]);
        assertEquals(expectedOutcome[1], solution[1]);
    }

    @Test
    void givenProperArray_shouldReturnProperSolutionTest3() {
        //given
        var TwoSumSolution = new TwoSumSolution();
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expectedOutcome = {1, 2};
        //when
        int[] solution = TwoSumSolution.twoSum(nums, target);
        //then
        assertEquals(expectedOutcome[0], solution[0]);
        assertEquals(expectedOutcome[1], solution[1]);
    }
}