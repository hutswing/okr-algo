package com.example.algo.solution2204_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public String[] solution(String[] record) {
        ArrayList<String> answer = new ArrayList<>();
        Map<String, String> userInfo = new HashMap<>();

        for (int i = 0; i < record.length; i++) {
            String[] data = record[i].split(" ");
            if ("Enter".equals(data[0]) || "Change".equals(data[0])){
                userInfo.put(data[1], data[2]);
            }
        }

        for (int i = 0; i < record.length; i++) {
            String[] data = record[i].split(" ");
            if ("Enter".equals(data[0])){
                answer.add(userInfo.get(data[1])+"님이 들어왔습니다.");
            }
            else if ("Leave".equals(data[0])){
                answer.add(userInfo.get(data[1])+"님이 나갔습니다.");
            }
        }

        return answer.toArray(new String[answer.size()]);
    }
}
/*
def solution(record):
    answer = []
    userInfo = {}

    for i in range(0, len(record)):
        data = record[i].split()
        if data[0] == "Enter" or data[0] == "Change":
            userInfo[data[1]] = data[2]

    for i in range(0, len(record)):
        data = record[i].split()
        if data[0] == "Enter":
            answer.append(userInfo[data[1]]+"님이 들어왔습니다.")
        elif data[0] == "Leave":
            answer.append(userInfo[data[1]]+"님이 나갔습니다.")



    return answer
 */