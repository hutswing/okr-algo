package com.example.algo.solution2205_2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Solution1Test {
    Solution1 s = new Solution1();

    @Test
    void test1() {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        int[] result = {4, 1, 3, 0};

        int[] sol = s.solution(genres, plays);

        assertThat(sol.length).isEqualTo(result.length);
        for (int i = 0; i < sol.length; i++) {
            assertThat(sol[i]).isEqualTo(result[i]);
        }
    }
}