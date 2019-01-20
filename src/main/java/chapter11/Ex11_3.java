package chapter11;

public class Ex11_3 {

	public static void main(String[] args) {
		int[] a = {69, 10, 30, 2, 16, 8, 31, 22};
		QuickSort S = new QuickSort();
		System.out.printf("\n정렬할 원소 : ");
		for(int i=0; i<a.length;i++) {
			System.out.printf(" %3d", a[i]);
		}
		System.out.println();
		S.sort(a, 0, 7);
	} //main
} //end class
