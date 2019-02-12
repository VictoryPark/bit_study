package coding_test;

import java.util.Set;
import java.util.TreeSet;

public class codility_2 {

	static int[] A = {0,1,3,-2,0,1,0,-3,2,3};
	static int[] triplet = new int[3];
	
	public static void main(String[] args) {
		System.out.println(solution(A));
	}
	public static int solution(int[] A) {
		TreeSet<Integer> depthSet = new TreeSet<>();
		
		for(int i = 0; i<A.length-2; i++) {
			triplet[0] = A[i];
			
			sec:for(int j=i+1; j<A.length-1; j++) {
				if(A[i] > A[j]) {
					//i와 j인덱스에 있는 원소까지 가면서 순차적으로 감소하는지 파악해야 함..
					for(int a=i+1; a<j; a++) {
						if(A[a-1] < A[a]) break sec;
					}
					triplet[1] = A[j];
					
					thr:for(int k=j+1; k<A.length; k++) {
						if(A[j] < A[k]) {
							//j와 k인덱스에 있는 원소까지 가면서 순차적으로 증가하는지 파악해야 함..
							for(int b=j+1; b<k; b++) {
								if(A[b-1] > A[b]) break thr;
							}
							triplet[2] = A[k];
							depthSet.add(findMin(triplet[0]-triplet[1], triplet[2]-triplet[1]));
						}
					} // 세번째 자리 채우는 for..
				}
			} // 두번째 자리 채우는 for
		} //첫번째 자리 채우는 for..
		if(depthSet.size()==0) {
			return -1;
		}
		
		return depthSet.last();
	} //solution
	
	private static int findMin(int a, int b) {
		if(a < b) {
			return a;
		} else {
			return b;
		}
	} //findMin
	
} //end class
