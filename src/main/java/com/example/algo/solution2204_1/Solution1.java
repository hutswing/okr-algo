package com.example.algo.solution2204_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution1 {
    public int solution(int[] citations) {
        int answer = 0;
        int citationsLength = citations.length;
        List<Integer> citationList =
                Arrays.stream(citations).sorted().boxed().collect(Collectors.toList());

        for (int i = 0; i < citationsLength; i++) {
            if(citationsLength-i <= citationList.get(i)){
                return citationsLength-i;
            }
        }

        return answer;
    }
}
