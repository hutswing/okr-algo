package com.example.algo.solution2204_3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution1Test {
    Solution1 s = new Solution1();

    @Test
    void test1(){
        int[] d = {1,3,2,5,4};
        int budget = 9;
        int result = 3;

        int sol = s.solution(d, budget);

        assertThat(sol).isEqualTo(result);
    }

    @Test
    void test2(){
        int[] d = {2,2,3,3};
        int budget = 10;
        int result = 4;

        int sol = s.solution(d, budget);

        assertThat(sol).isEqualTo(result);
    }

}