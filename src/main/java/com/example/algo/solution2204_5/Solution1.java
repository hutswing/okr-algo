package com.example.algo.solution2204_5;

import java.util.Arrays;

public class Solution1 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] temp = Arrays.stream(Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1])).sorted().toArray();
            answer[i] = temp[commands[i][2]-1];
        }
        return answer;
    }
}
