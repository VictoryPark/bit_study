package chapter11;

public class QuickSort {

	int i = 0;
	public int partition(int[] a, int begin, int end) {
		int pivot, temp, L, R, t;
		
		L = begin;
		R = end;
		pivot = (begin + end) / 2 ;
		System.out.printf("\n [퀵정렬 %d 단계 : pivot = %d ]\n", ++i, a[pivot]); 
		
		// L과 R 이 같이 위치가 되기 전까지 반복...
		while(L<R) {
			while((a[L] < a[pivot]) && (L < R))  L++;
			while((a[R] >= a[pivot]) && (L < R))  R--;
			if(L<R) {
				temp = a[L];
				a[L] = a[R];
				a[R] = temp;				
			}
			
			//R 이 pivot과 같은 인덱스 일때는 L하고 
			if(R==pivot) {
				for(t=0; t<a.length; t++) {
					System.out.printf("%3d ", a[t]);
				}
				System.out.println();
				return L;
			}
			
		} // L=R이 되면 끝남..
		
		temp = a[pivot];
		a[pivot] = a[R];
		a[R] = temp;
		for(t=0; t<a.length; t++) {
			System.out.printf("%3d ", a[t]);
		}
		System.out.println();
		//피봇자리가 확정된 R 자리를 return 함..
		return R;
	} //partition
	
	public void sort(int[] a, int begin, int end) {
		if(begin < end) {
			int p;
			p = partition(a,begin, end);
			sort(a, begin, p-1);
			sort(a, p+1, end);
		}
	} //sort
} //QuickSort
