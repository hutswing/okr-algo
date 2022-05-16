package com.example.algo.solution2205_2;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public String solution(int[] numbers) {
        String answer = "";
        List<String> list = new ArrayList();
        for(int i=0; i < numbers.length; i++){
            list.add(numbers[i]+"");
        }
        list.sort((String x, String y) -> (y+x).compareTo(x+y));
        for(String str : list){
            answer += str;
        }

        if(answer.charAt(0) == '0') return "0";
        return answer;
    }
}