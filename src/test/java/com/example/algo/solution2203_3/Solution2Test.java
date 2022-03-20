package com.example.algo.solution2203_3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution2Test {

    Solution2 s = new Solution2();

    @Test
    void test1() {
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        String result = "bat.y.abcdefghi";

        String sol = s.solution(new_id);

        assertThat(sol).isEqualTo(result);
    }

    @Test
    void test2() {
        String new_id = "z-+.^.";
        String result = "z--";

        String sol = s.solution(new_id);

        assertThat(sol).isEqualTo(result);
    }

    @Test
    void test3() {
        String new_id = "=.=";
        String result = "aaa";

        String sol = s.solution(new_id);

        assertThat(sol).isEqualTo(result);
    }

    @Test
    void test4() {
        String new_id = "123_.def";
        String result = "123_.def";

        String sol = s.solution(new_id);

        assertThat(sol).isEqualTo(result);
    }

    @Test
    void test5() {
        String new_id = "abcdefghijklmn.p";
        String result = "abcdefghijklmn";

        String sol = s.solution(new_id);

        assertThat(sol).isEqualTo(result);
    }
}