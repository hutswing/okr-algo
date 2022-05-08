package com.example.algo.solution2205_1;

import java.util.Stack;

public class Solution2 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> bucket = new Stack<>();

        for (int move : moves) {
            int selectedToy = getToy(board, 0, move - 1);

            if (selectedToy == -1) continue;
            else if (bucket.size() == 0 || bucket.peek() != selectedToy) {
                bucket.push(selectedToy);
            } else {
                bucket.pop();
                answer += 2;
            }
        }
        return answer;
    }

    private int getToy(int[][] board, int depth, int line) {
        if (depth == board.length) return -1;

        if (board[depth][line] != 0) {
            int toy = board[depth][line];
            board[depth][line] = 0;
            return toy;
        }
        return getToy(board, depth + 1, line);
    }
}