package com.example.algo.solution2205_2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {
    Solution2 s = new Solution2();

    @Test
    void test1() {
        int[] numbers = {6, 10, 2};
        String result = "6210";

        String sol = s.solution(numbers);

        assertThat(sol).isEqualTo(result);
    }

}