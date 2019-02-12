package coding_test;

public class codility_3 {

	static int[] A = {0,1,2,2,3,5};
	static int[] B = {500000, 500000, 0, 0, 0, 20000};
	
	public static void main(String[] args) {
		System.out.println(solution(A, B));
	}
	public static int solution(int[] A, int[] B) {
		double[] C = new double[A.length];
		for(int i =0; i<A.length; i++) {
			C[i] = (double)(A[i]) + (double)(B[i]) / 1000000;
		} //C 배열 만들기..
		
		double multiple = 0;
		double sum = 0;
		int count = 0;
		
		for(int i=0; i < C.length-1; i++) {
			for(int j=i+1; j < C.length; j++ ) {
				multiple = C[i] * C[j];
				sum = C[i] + C[j];
				if(multiple >= sum) count++;
			}
		} //for..
		
		if(count > 1000000000) {
			return 1000000000;
		}
		return count;
	} // solution
}
