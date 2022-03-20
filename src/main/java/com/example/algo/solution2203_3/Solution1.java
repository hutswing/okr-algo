package com.example.algo.solution2203_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution1 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        List<Integer> winNumsList
                = Arrays.stream(win_nums)
                .boxed()
                .collect(Collectors.toList());

        long matchNumberCount = Arrays.stream(lottos)
                .filter(number -> winNumsList.contains(number))
                .count();

        long zeroCount = Arrays.stream(lottos)
                .filter(number -> number == 0)
                .count();
        answer[0] = getRank(matchNumberCount + zeroCount);
        answer[1] = getRank(matchNumberCount);

        return answer;
    }

    private static int getRank(long matchNumberCount) {
        if (matchNumberCount < 2) return 6;
        return 6 - (int) matchNumberCount + 1;
    }
}
