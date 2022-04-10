package com.example.algo.solution2204_2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution2Test {
    Solution2 s = new Solution2();

    @Test
    void test1(){
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        int result = 50;

        int sol = s.solution(cacheSize, cities);

        assertThat(sol).isEqualTo(result);
    }

    @Test
    void test2(){
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
        int result = 21;

        int sol = s.solution(cacheSize, cities);

        assertThat(sol).isEqualTo(result);
    }

    @Test
    void test3(){
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
        int result = 60;

        int sol = s.solution(cacheSize, cities);

        assertThat(sol).isEqualTo(result);
    }

    @Test
    void test4(){
        int cacheSize = 5;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
        int result = 52;

        int sol = s.solution(cacheSize, cities);

        assertThat(sol).isEqualTo(result);
    }

    @Test
    void test5(){
        int cacheSize = 2;
        String[] cities = {"Jeju", "Pangyo", "NewYork", "newyork"};
        int result = 16;

        int sol = s.solution(cacheSize, cities);

        assertThat(sol).isEqualTo(result);
    }

    @Test
    void test6(){
        int cacheSize = 0;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        int result = 25;

        int sol = s.solution(cacheSize, cities);

        assertThat(sol).isEqualTo(result);
    }


}