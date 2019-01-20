package chapter11;

public class Ex11_4 {

	public static void main(String[] args) {
		int[] a = {69, 10, 30, 2, 16, 8, 31, 22};
		Sort S = new Sort();
		System.out.printf("\n정렬할 원소 : ");
		for(int i=0; i<a.length;i++) {
			System.out.printf(" %3d", a[i]);
		}
		System.out.println();
		S.insertionSort(a, a.length);
	} //main
} //end class
