package com.example.algo.solution2204_3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {
    Solution2 s = new Solution2();

    @Test
    void test1(){
        String[] phone_book = {"119", "97674223", "1195524421"};
        boolean result = false;

        boolean sol = s.solution(phone_book);

        assertThat(sol).isEqualTo(result);
    }

    @Test
    void test2(){
        String[] phone_book = {"123","456","789"};
        boolean result = true;

        boolean sol = s.solution(phone_book);

        assertThat(sol).isEqualTo(result);
    }

    @Test
    void test3(){
        String[] phone_book = {"12","123","1235","567","88"};
        boolean result = false;

        boolean sol = s.solution(phone_book);

        assertThat(sol).isEqualTo(result);
    }
}