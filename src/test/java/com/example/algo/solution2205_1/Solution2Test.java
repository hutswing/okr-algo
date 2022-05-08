package com.example.algo.solution2205_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {
    Solution2 s = new Solution2();

    @Test
    void test1() {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        int result = 4;

        int sol = s.solution(board, moves);

        assertThat(sol).isEqualTo(result);

    }

}