package com.example.algo.solution2204_2;

import java.util.LinkedList;

public class Solution2 {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        LinkedList<String> cache = new LinkedList<>();

        for (int i = 0; i < cities.length; i++) {
            String city = cities[i].toUpperCase();
            if (cacheSize == 0) return cities.length * 5;
            if (cache.contains(city)) {
                cache.remove(city);
                cache.add(city);
                answer += 1;
            } else {
                if (cache.size() < cacheSize) {
                    cache.add(city);
                } else {
                    cache.remove(0);
                    cache.add(city);
                }
                answer += 5;
            }
        }
        return answer;
    }
}
