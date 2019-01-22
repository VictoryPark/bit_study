package chapter12;

public class Ex12_1 {

	public static void main(String[] args) {
		int[] a1 = {8, 30, 1, 9, 11, 19, 2};
		int size = a1.length;
		Search S = new Search();
		System.out.printf("\n 정렬되지 않은 자료에서의 순차검색 >> ");
		S.sequentialSearch1(a1, size, 9);
		S.sequentialSearch1(a1, size, 6);
		
		int[] a2 = {1, 2, 8, 9, 11, 19, 29};
		size = a2.length;
		System.out.printf("\n정렬되어 있는 자료에서의 순차검색 >> ");
		S.sequentialSearch2(a2,size, 9);
		S.sequentialSearch2(a2,size, 6);
		
	} //main
} //end class
