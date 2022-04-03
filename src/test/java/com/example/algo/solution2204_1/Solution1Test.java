package com.example.algo.solution2204_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution1Test {

    Solution1 s = new Solution1();

    @Test
    void test1(){
        int[] citations = {3, 0, 6, 1, 5};
        int result = 3;

        int sol = s.solution(citations);

        assertThat(sol).isEqualTo(result);
    }

}