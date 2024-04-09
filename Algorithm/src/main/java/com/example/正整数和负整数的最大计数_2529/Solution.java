package com.example.正整数和负整数的最大计数_2529;

class Solution {

    /**
     * 二分查找法 时间复杂度O(log(n)) 空间复杂度O(1)
     * @param nums 数组
     * @return 正整数|负整数 最大值
     */
    public int maximumCount(int[] nums) {
       return -1;
    }

    /**
     * 暴力解法 时间复杂度O(n) 空间复杂度O(1)
     * @param nums 数组
     * @return 正整数|负整数 最大值
     */
    public int maximumCount2(int[] nums) {
        // 0
        // -1, 1
        // -2, -1, 0, 0, 1, 2, 3
        if (nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return nums[0] == 0 ? 0 : 1;
        }
        // 计算负数坐标
        int negative = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                negative++;
            }
            if (nums[i] >= 0) {
                break;
            }
        }
        // 计算正数坐标
        int positive = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > 0) {
                positive++;
            }
            if (nums[i] <= 0) {
                break;
            }
        }
        return positive > negative ? positive : negative;
    }
}