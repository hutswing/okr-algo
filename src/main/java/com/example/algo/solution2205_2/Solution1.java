package com.example.algo.solution2205_2;

import java.util.*;

public class Solution1 {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer;
        List<Integer> answerList = new ArrayList<>();
        int playCount;
        Map<String, Integer> map  = new HashMap<>();
        List<Music> musicList = new ArrayList<>();


        for (int i = 0; i < genres.length; i++) {
            playCount = plays[i];
            // map에 해당 장르가 들어있을때
            if(map.containsKey(genres[i])){
                playCount = playCount + map.get(genres[i]);
            }
            map.put(genres[i], playCount);
        }

        for (int i = 0; i < genres.length; i++) {
            musicList.add(new Music(map.get(genres[i]), plays[i], i));
        }

        Collections.sort(musicList);

        int count = 1;
        answerList.add(musicList.get(0).number);
        System.out.println("number : " + musicList.get(0).number + " 장르count : " + musicList.get(0).genreTotalPlay);

        for (int i = 1; i < musicList.size(); i++) {
            //System.out.println(" " + musicList.get(i-1).genreTotalPlay + " --- " + musicList.get(i).genreTotalPlay);
            //System.out.println(count);
            //System.out.println("number : " + musicList.get(i).number + " 장르count : " + musicList.get(i).genreTotalPlay);
            if (musicList.get(i-1).genreTotalPlay != musicList.get(i).genreTotalPlay){
                count = 0;
            }
            if (count >= 2){
                continue;
            }
            answerList.add(musicList.get(i).number);
            System.out.println("number : " + musicList.get(i).number + " 장르count : " + musicList.get(i).genreTotalPlay);

            count++;
        }

        answer = answerList.stream()
                .mapToInt(i->i)
                .toArray();

        return answer;
    }

    class Music implements Comparable<Music>{
        int genreTotalPlay;
        int play;
        int number;

        public Music(int genreTotalPlay, int play, int number) {
            this.genreTotalPlay = genreTotalPlay;
            this.play = play;
            this.number = number;
        }

        @Override
        public int compareTo(Music o) {
            if(this.genreTotalPlay < o.genreTotalPlay){
                return 1;
            }
            else if(this.genreTotalPlay == o.genreTotalPlay){
                if (this.play < o.play){
                    return 1;
                } else if (this.play == o.play) {
                    if (this.number > o.number) {
                        return 1;
                    }
                    else {
                        return -1;
                    }
                } else {
                    return -1;
                }
            }
            else {
                return -1;
            }

        }

    }


}