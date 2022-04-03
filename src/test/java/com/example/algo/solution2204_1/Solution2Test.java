package com.example.algo.solution2204_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution2Test {

    Solution2 s = new Solution2();

    @Test
    @DisplayName("같은 단어가 나오는 경우")
    void test1(){
        int n = 3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        int[] result = {3,3};

        int[] sol = s.solution(n, words);

        assertThat(sol.length).isEqualTo(result.length);
        assertThat(sol[0]).isEqualTo(result[0]);
        assertThat(sol[1]).isEqualTo(result[1]);
    }

    @Test
    @DisplayName("탈락자가 생기지않는 경우")
    void test2(){
        int n = 5;
        String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
        int[] result = {0,0};

        int[] sol = s.solution(n, words);

        assertThat(sol.length).isEqualTo(result.length);
        assertThat(sol[0]).isEqualTo(result[0]);
        assertThat(sol[1]).isEqualTo(result[1]);
    }

    @Test
    @DisplayName("다른 스펠링으로 시작하는 단어를 말하는 경우")
    void test3(){
        int n = 2;
        String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
        int[] result = {1,3};

        int[] sol = s.solution(n, words);

        assertThat(sol.length).isEqualTo(result.length);
        assertThat(sol[0]).isEqualTo(result[0]);
        assertThat(sol[1]).isEqualTo(result[1]);
    }
}