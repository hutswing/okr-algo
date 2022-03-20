package com.example.algo.solution2203_3;

public class Solution2 {
    public String solution(String new_id) {
        String id = new_id;

        // step1
        id = id.toLowerCase();
        // step2
        id = id.replaceAll("[^0-9a-z\\.\\-_]", "");
        // step3
        id = id.replaceAll("\\.+", ".");
        // step4
        id = id.replaceAll("^\\.|\\.$", "");
        // step5
        if (id.length() < 1) {
            id = "a";
        }
        // step6
        if (id.length() > 15) {
            id = id.substring(0, 15).replaceAll("\\.$", "");

        }
        // step7
        while (id.length() < 3) {
            id = id + id.substring(id.length() - 1);
        }

        return id;
    }
}
