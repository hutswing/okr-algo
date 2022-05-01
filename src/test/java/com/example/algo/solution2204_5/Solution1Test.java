package com.example.algo.solution2204_5;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Solution1Test {
    Solution1 s = new Solution1();

    @Test
    void test1() {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] result = {5, 6, 3};

        int[] sol = s.solution(array, commands);

        assertThat(sol.length).isEqualTo(result.length);
        for (int i = 0; i < sol.length; i++) {
            assertThat(sol[i]).isEqualTo(result[i]);
        }
    }

}