package com.example.algo.solution2205_1;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        int currentPos = 0;

        while (currentPos < progresses.length) {
            int day = (int) Math.ceil((double) (100 - progresses[currentPos]) / speeds[currentPos]);
            for (int i = currentPos; i < progresses.length; i++) {
                progresses[i] += speeds[i] * day;
            }

            int count = 0;
            int pos = currentPos;
            for (; pos < progresses.length; pos++) {
                if (progresses[pos] >= 100) {
                    count++;
                }
                else break;
            }
            answer.add(count);
            currentPos = pos;

        }

        return answer.stream().mapToInt(i -> i).toArray();

    }


}