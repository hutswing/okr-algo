package com.example.algo.solution2203_3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution1Test {

    Solution1 s = new Solution1();

    @Test
    void test1() {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int[] result = {3, 5};

        int[] sol = s.solution(lottos, win_nums);

        assertThat(sol[0]).isEqualTo(result[0]);
        assertThat(sol[1]).isEqualTo(result[1]);
    }

    @Test
    void test2() {
        int[] lottos = {0, 0, 0, 0, 0, 0};
        int[] win_nums = {38, 19, 20, 40, 15, 25};
        int[] result = {1, 6};

        int[] sol = s.solution(lottos, win_nums);

        assertThat(sol[0]).isEqualTo(result[0]);
        assertThat(sol[1]).isEqualTo(result[1]);
    }

    @Test
    void test3() {
        int[] lottos = {45, 4, 35, 20, 3, 9};
        int[] win_nums = {20, 9, 3, 45, 4, 35};
        int[] result = {1, 1};

        int[] sol = s.solution(lottos, win_nums);

        assertThat(sol[0]).isEqualTo(result[0]);
        assertThat(sol[1]).isEqualTo(result[1]);
    }

}