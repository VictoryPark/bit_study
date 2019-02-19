package coding_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

// 가장 긴 구슬 목걸이를 가진 목걸이의 구슬 수를 구하라..
public class EstSoft_2 {

	static int[] A = {5,4,0,3,1,6,2};
	static int[] B = {4,6,3,5,0,7,1,8,9,2};
	static int[] C = {0,1,2,3,4,5,6,7,8,9,11,12,13,14,10};
	
	public static void main(String[] args) {
		System.out.println(solution(B));
	}
	public static int solution(int[] A) {
		int answer = 0;
		if(A.length == 0) return answer;
		List<Integer> AList = new ArrayList<>();
		
		for(int item : A) {
			AList.add(item);
		}//원소를 지울 수 있게 List에 담음..
		
		List<Integer> sizeList = new ArrayList<>();
		TreeSet<Integer> beadSet = new TreeSet<>();
		
		int nextBead = 0;
		int i=0;
		
		while(true) {
			nextBead = A[i];
			if(nextBead == i) { 	//A[3] = 3 의 상황..구슬이 1개인 목걸이..
				sizeList.add(1);
				AList.remove(AList.indexOf(i));
			} else if(A[nextBead]==i) {		//A[1] = 4 의 상황, A[4]=1의 상황..구슬이 2개인 목걸이..
				sizeList.add(2);
				AList.remove(AList.indexOf(nextBead));
				AList.remove(AList.indexOf(i));
			} else {
				beadSet.add(nextBead);	//5
				AList.remove(AList.indexOf(i));	//0번 인덱스 지움..
				while(nextBead != i) {
					AList.remove(AList.indexOf(nextBead));	//5번 인덱스 지움..6번 인덱스 지우고  2번 인덱스 지움..
					nextBead = A[nextBead];	//6,2,0
					beadSet.add(nextBead);	//6,2,0
				} //nextBead 값이 맨처음 i 값으로 돌아올때까지 반복..set에는 bead 값 쌓임..
				
				sizeList.add(beadSet.size());
			} //if else..
			
			if(AList.size()==0) break;
			i = AList.get(0);
		}//AList 사이즈가 0이 될때까지 반복..
		
		Collections.sort(sizeList);
		answer = sizeList.get(sizeList.size()-1);
		return answer;
	} //solution
} // 
