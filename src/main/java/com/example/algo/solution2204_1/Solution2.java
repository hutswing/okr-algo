package com.example.algo.solution2204_1;

public class Solution2 {
    public int[] solution(int n, String[] words) {
        String history = "#"+words[0];

        for(int i = 1; i < words.length; i++) {
            history += "#";
            if(words[i-1].charAt(words[i-1].length()-1) == words[i].charAt(0)
                    && history.indexOf("#"+words[i]+"#") == -1) {
                history += words[i];
            }
            else {
                return new int[] {i%n+1, i/n+1};
            }
        }
        return new int[] {0, 0};
    }
}
