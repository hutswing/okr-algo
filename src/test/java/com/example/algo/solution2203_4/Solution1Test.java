package com.example.algo.solution2203_4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution1Test {

    Solution1 s = new Solution1();

    @Test
    void test1() {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        String result = "leo";

        String sol = s.solution(participant, completion);

        assertThat(sol).isEqualTo(result);
    }

    @Test
    void test2() {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        String result = "vinko";

        String sol = s.solution(participant, completion);

        assertThat(sol).isEqualTo(result);
    }

    @Test
    void test3() {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        String result = "mislav";

        String sol = s.solution(participant, completion);

        assertThat(sol).isEqualTo(result);
    }

}