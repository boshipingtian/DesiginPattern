package com.example.正整数和负整数的最大计数_2529;

import org.junit.jupiter.api.Test;

class SolutionTest {
    
    private static int[] nums = new int[]{-2, -1, 0, 0, 1, 2, 3};
    
    @Test
    public void test1(){
        Solution solution = new Solution();
        System.out.println(solution.maximumCount2(nums));
    }
}