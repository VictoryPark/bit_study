package chapter12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Prac2 {
	
	public static void main(String[] args) {
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		
		solution(genres, plays);
	} // main
	
	public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        Set<String> nameSet = new HashSet<>();
        Map<String, Integer> playMap= new HashMap<>();
        String genre = null;
        int playNo = 0;
        
        //주어진 장르 만큼 돌려서 set에는 장르 종류를 담고 map에는 총점을 담는다.
        for(int i=0; i<genres.length; i++) {
        	genre = genres[i];
        	if(!nameSet.contains(genre)) {
        		nameSet.add(genre);
        		playMap.put(genre, plays[i]);
        	} else {
        		playNo = playMap.get(genre);
        		playMap.replace(genre, plays[i] + playNo);
        	}
        } // for
        
        for(String name : nameSet) {
        	
        }
        
        System.out.println(nameSet.toString());
        System.out.println(playMap.toString());
        return answer;
    }
} //end class
