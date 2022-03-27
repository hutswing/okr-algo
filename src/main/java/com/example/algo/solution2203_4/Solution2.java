package com.example.algo.solution2203_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {
    public int[] solution(int[] answers) {
        int answer;

        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] answerCounts = {0, 0, 0};

        for (int i = 0; i < answers.length; i++) {
            answer = answers[i];
            if (answer == student1[i%5]) answerCounts[0]++;
            if (answer == student2[i%8]) answerCounts[1]++;
            if (answer == student3[i%10]) answerCounts[2]++;
        }

        int maxAnswerCount = Arrays.stream(answerCounts).max().getAsInt();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < answerCounts.length; i++) {
            if (answerCounts[i] == maxAnswerCount) {
                result.add(i+1);
            }
        }

        return result.stream().mapToInt(i->i).toArray();
    }
}
