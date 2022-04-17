package com.example.algo.solution2204_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution2 {
    public boolean solution(String[] phone_book) {
        List<String> phoneNumberList =
                Arrays.stream(phone_book).sorted().collect(Collectors.toList());

        for (int i = 1; i < phoneNumberList.size(); i++) {
            if(phoneNumberList.get(i).startsWith(phoneNumberList.get(i-1))){
                return false;
            }
        }

        return true;
    }
}
