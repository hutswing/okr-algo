package com.example.algo.solution2204_2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution1Test {
    Solution1 s = new Solution1();

    @Test
    void test1(){
        int n = 2;
        int t = 4;
        int m = 2;
        int p = 1;
        String result = "0111";

        String sol = s.solution(n, t, m, p);

        assertThat(sol).isEqualTo(result);
    }

    @Test
    void test2(){
        int n = 16;
        int t = 16;
        int m = 2;
        int p = 1;
        String result = "02468ACE11111111";

        String sol = s.solution(n, t, m, p);

        assertThat(sol).isEqualTo(result);
    }

    @Test
    void test3(){
        int n = 16;
        int t = 16;
        int m = 2;
        int p = 2;
        String result = "13579BDF01234567";

        String sol = s.solution(n, t, m, p);

        assertThat(sol).isEqualTo(result);
    }
}