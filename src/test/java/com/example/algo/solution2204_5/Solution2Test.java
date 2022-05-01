package com.example.algo.solution2204_5;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    Solution2 s = new Solution2();

    @Test
    void test1() {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        String[] result = {"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."};

        String[] sol = s.solution(record);

        assertThat(sol.length).isEqualTo(result.length);
        for (int i = 0; i < sol.length; i++) {
            assertThat(sol[i]).isEqualTo(result[i]);
        }

    }
}