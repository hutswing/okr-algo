package com.example.algo.solution2203_4;

import java.util.Arrays;

public class Solution1 {
    public String solution(String[] participant, String[] completion) {
        int i;

        Arrays.sort(participant);
        Arrays.sort(completion);

        for (i = 0; i < participant.length - 1; i++) {
            if (!participant[i].equals(completion[i])) break;
        }

        return participant[i];
    }
}
