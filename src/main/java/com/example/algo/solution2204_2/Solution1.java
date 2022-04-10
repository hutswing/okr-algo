package com.example.algo.solution2204_2;

public class Solution1 {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= t * m; ++i) {
            sb.append(Integer.toString(i, n).toUpperCase());
        }
        StringBuilder ans = new StringBuilder();
        for (int i = p - 1, j = 0; j < t; i+= m, ++j) {
            ans.append(sb.charAt(i));
        }
        return ans.toString();
    }
}
