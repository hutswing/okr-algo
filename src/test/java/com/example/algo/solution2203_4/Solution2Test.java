package com.example.algo.solution2203_4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution2Test {

    Solution2 s = new Solution2();

    @Test
    void test1() {
        int[] answers = {1,2,3,4,5};
        int[] result = {1};

        int[] sol = s.solution(answers);

        assertThat(sol.length).isEqualTo(result.length);
        for (int i = 0; i < sol.length; i++) {
            assertThat(sol[i]).isEqualTo(result[i]);
        }
    }

    @Test
    void test2() {
        int[] answers = {1,3,2,4,2};
        int[] result = {1,2,3};

        int[] sol = s.solution(answers);

        assertThat(sol.length).isEqualTo(result.length);
        for (int i = 0; i < sol.length; i++) {
            assertThat(sol[i]).isEqualTo(result[i]);
        }
    }
}