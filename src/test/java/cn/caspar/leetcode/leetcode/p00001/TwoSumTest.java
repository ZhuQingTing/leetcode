package cn.caspar.leetcode.leetcode.p00001;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum() {
        TwoSum twoSum = new TwoSum();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        Assertions.assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void twoSum1() {
        TwoSum twoSum = new TwoSum();
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        int[] result = twoSum.twoSum(nums, target);
        Assertions.assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void twoSum2() {
        TwoSum twoSum = new TwoSum();
        int[] nums = new int[]{-1, -2, -3, -4, -5};
        int target = -8;
        int[] result = twoSum.twoSum(nums, target);
        Assertions.assertArrayEquals(new int[]{2, 4}, result);
    }
}