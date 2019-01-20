package chapter11;

public class Sort {

	public void selectionSort(int[] a) {
		int i, j, min;
		for(i=0; i<a.length; i++) {
			min = i;
			for(j=i+1; j<a.length; j++) {
				if(a[min] > a[j]) {
					min = j;
				}
			}
			//min 이라는 가장 작은 위치와 i 라는 기준 위치의 원소를 자리 바꿈..
			swap(a, min, i);
			System.out.printf("\n선택 정렬 %d 단계 : ", i+1);
			for(j=0; j<a.length; j++) {
				System.out.printf("%3d", a[j]);
			}
		}
	} // selectionSort
	
	public void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public void bubbleSort(int[] a) {
		int i, j, temp, size;
		size = a.length;
		//마지막 인덱스에서 점점 줄여나감..
		for(i=size-1; i>0; i--) {
			System.out.printf("\n버블 정렬 %d 단계 : ", size-i);
			//줄여나가는 범위 사이에서 첫 인덱스부터 비교하며 바꿈..
			for(j=0; j<i; j++) {
				//앞 인덱스 값이 더 크면 자리 바꿈..
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				} // 자리 바꾸기..
				
				System.out.printf("\n\t");
				//바뀐 자리 확인..
				for(int k=0; k<size; k++) {
					System.out.printf("%3d ", a[k]);
				} //출력..
			} //for
		} //for
	} //bubblesort
	
	public void insertionSort(int[] a, int size) {
		int i, j, t, temp;
		for(i=1; i<size; i++) {
			temp = a[i];
			j = i;
			//unsorted 첫번재 원소랑 바로 앞자리 원소와 비교해서 앞자리가 더 크면 자리 땡긴다..
			while((j>0) && (a[j-1] > temp)) {
				a[j] = a[j-1];
				j--;
			} 
			//정해진 자리에 temp 값 위치 시킨다..
			a[j] = temp;
			
			System.out.printf("\n삽입정렬 %d 단계 : ", i);
			for(t=0; t<size; t++) {
				System.out.printf("%3d ", a[t]);
			}
			System.out.println();
		} //for
	} //insertionSort
	
	public void intervalSort(int[] a, int begin, int end, int interval) {
		int i, j, item;
		//인터벌로 나눈 부분 집합안에서 첫째 원소말고 두번째 원소부터 인터벌만큼 커져가며 비교..
		for(i=begin+interval; i<=end; i=i+interval) {
			//삽입 정렬 형태..
			item = a[i];
			//해당하는 i 인덱스보다 인터벌만큼 적어져 가면서 인덱스에 있는 원소들과 크기 비교해서 삽입..
			for(j=i-interval; (j >= begin) && (item < a[j]); j=j-interval) {
				a[j+interval] = a[j];
			} // for..
			a[j+interval] = item;
		} //for
	} //intervalSort
	
	public void shellSort(int[] a, int size) {
		int i, j, interval, t=0;
		interval = size / 2;
		//인터벌을 2로 나누면서 반복..
		while(interval >= 1) {
			//인터벌로 나눈 부분집합들 중에 다른 집합으로 옮기는 반복문..
			for(i=0; i<interval; i++) {
				intervalSort(a, i, size-1, interval);
			}
			System.out.printf("\n셸 정렬 %d 단계 : interval = %d >> ", ++t, interval);
			
			for(j=0; j<size;j++) {
				System.out.printf("%d   ", a[j]);
			}
			System.out.println();
			interval /= 2;
		} //while
	} //shellSort
	
	private int sorted[] = new int [30];
	
	public void merge(int a[], int m, int middle, int n) {
		int size = a.length;
		int i, j, k, t;
		i = m;
		j = middle+1;
		k = m;
		//부분 배열의 앞 원소끼리 먼저 크기 비교후..자리 배치..
		while(i<=middle && j<=n) {
			//첫 원소끼리 비교..자리 바꾸고 나서는 첫원소가 배치된 후의 다음 원소와 다시 첫 원소와 비교..
			if(a[i] <= a[j]) sorted[k] = a[i++];
			else sorted[k] = a[j++];
			k ++;
		}
		//모두 비교해서 병합 배치 햇는데..아직 남은 원소가 있다면 남은 병합 배열에 배치..3번 순서..
		if(i>middle) {
			for(t=j; t<=n; t++, k++) {
				sorted[k] = a[t];
			}
		} else {
			for(t=i; t<middle; t++, k++) {
				sorted[k] = a[t];
			}
		}
		
		for(t=m; t<=n; t++) {
			a[t] = sorted[t];
			System.out.printf("\n 병합 정렬 >> ");
		}
		for(t=0; t<size; t++) {
			System.out.printf("%3d ", a[t]);
		}
	} //merge
	
	public void mergeSort(int[] a, int m, int n) {
		int middle;
		if(m<n) {
			middle = (m+n) /2;
			mergeSort(a, m, middle);
			mergeSort(a, middle+1, n);
			merge(a, m, middle, n);
		}
	} //mergeSort
} //end class
