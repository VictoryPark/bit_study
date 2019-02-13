package coding_test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EstSoft_1 {

	static int[] ranks = {3,4,3,0,2,2,3,0,0};
	static int[] ran2 = {4,2,0};
	static int[] ran3 = {4,4,3,3,1,0};
	
	public static void main(String[] args) {
		System.out.println(solution(ran3));
	}
	public static int solution(int[] ranks) {
		if(ranks.length<2 || ranks.length >100000) System.exit(0);
		
		int count = 0;
		int result = 0;
		Map<Integer, Integer> soldierMap = new HashMap<>();
		for(int i=0; i<ranks.length; i++) {
			//i 인덱스값보다 1큰 수 있는지 찾기..
			for(int j=0; j<ranks.length; j++) {
				//상사 찾았으면..
				if(ranks[i]+1 == ranks[j]) {
					count++;
					//동기 찾기..
					for(int k=i+1; k<ranks.length; k++) {
						if(ranks[i]==ranks[k]) {
							count++;
						}
					} //for...
					if(!soldierMap.containsKey(ranks[i]))
						soldierMap.put(ranks[i], count);
						count = 0;
				} //if
				
			} //상사 찾기..
		} //solider 돌기..
		for(int key : soldierMap.keySet()) {
			result += soldierMap.get(key);
		}
		return result;
	}
} // class
