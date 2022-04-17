package com.example.algo.solution2204_3;

import java.util.Arrays;

public class Solution1 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum =0;
        Arrays.sort(d);
        for(int i=0; i<d.length; i++) {
            if(sum + d[i] > budget) break;
            sum += d[i];
            answer++;
        }
        return answer;
    }
}
