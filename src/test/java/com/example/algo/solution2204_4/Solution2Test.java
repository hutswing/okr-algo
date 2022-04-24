package com.example.algo.solution2204_4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    Solution2 s = new Solution2();

    @Test
    void test1(){
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};
        int result = 8;

        int sol = s.solution(bridge_length, weight, truck_weights);

        assertThat(sol).isEqualTo(result);
    }

    @Test
    void test2(){
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = {10};
        int result = 101;

        int sol = s.solution(bridge_length, weight, truck_weights);

        assertThat(sol).isEqualTo(result);
    }

    @Test
    void test3(){
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};
        int result = 110;

        int sol = s.solution(bridge_length, weight, truck_weights);

        assertThat(sol).isEqualTo(result);
    }

}