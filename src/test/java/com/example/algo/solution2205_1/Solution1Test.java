package com.example.algo.solution2205_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Solution1Test {

    Solution1 s = new Solution1();

    @Test
    void test1() {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        int[] result = {2, 1};

        int[] sol = s.solution(progresses, speeds);

        assertThat(sol.length).isEqualTo(result.length);
        for (int i = 0; i < sol.length; i++) {
            assertThat(sol[i]).isEqualTo(result[i]);
        }
    }

    @Test
    void test2() {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        int[] result = {1, 3, 2};

        int[] sol = s.solution(progresses, speeds);

        assertThat(sol.length).isEqualTo(result.length);
        for (int i = 0; i < sol.length; i++) {
            assertThat(sol[i]).isEqualTo(result[i]);
        }
    }

}