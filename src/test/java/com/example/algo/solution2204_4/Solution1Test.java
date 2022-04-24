package com.example.algo.solution2204_4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Solution1Test {

    Solution1 s = new Solution1();

    @Test
    void test1(){
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        int result = 5;

        int sol = s.solution(numbers, target);

        assertThat(sol).isEqualTo(result);
    }

    @Test
    void test2(){
        int[] numbers = {4, 1, 2, 1};
        int target = 4;
        int result = 2;

        int sol = s.solution(numbers, target);

        assertThat(sol).isEqualTo(result);
    }

}