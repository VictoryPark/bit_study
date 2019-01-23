package chapter12;

import java.util.Arrays;
import java.util.Scanner;
/*N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.
 * 
 * 
입력
첫째 줄에 자연수 N(1≤N≤100,000)이 주어진다. 다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다. 다음 줄에는 M(1≤M≤100,000)이 주어진다. 다음 줄에는 M개의 수들이 주어지는데, 이 수들이 A안에 존재하는지 알아내면 된다. 모든 정수들의 범위는 int 로 한다.

출력
M개의 줄에 답을 출력한다. 존재하면 1을, 존재하지 않으면 0을 출력한다.

예제 입력 1 
5
4 1 5 2 3
5
1 3 7 9 5
예제 출력 1 
1
1
0
0
1
 */

public class Prac1 {

	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr = new int[Integer.parseInt(scan.nextLine())];
		String[] input = scan.nextLine().split(" ");
		for(int i=0; i<input.length; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		int[] key = new int[Integer.parseInt(scan.nextLine())];
		input = scan.nextLine().split(" ");
		for(int i=0; i<key.length; i++) {
			key[i] = Integer.parseInt(input[i]);
		}
		//처음 주어진 배열은 정렬한다.
		Arrays.sort(arr);
		
		int[] answerArr = new int[key.length];
		for(int i=0; i<key.length; i++) {
			int answer = binarySearch(arr, 0, arr.length-1, key[i]);
			answerArr[i] = answer;
		}
		
		for(int ans : answerArr) {
			System.out.println(ans);
		}
	} //main

	private static int binarySearch(int[] arr, int begin, int end, int key) {
		//if(begin > end) return 0;
		int middle = (begin+end)/2;
		
		if(key == arr[middle]) {
			return 1;
		} else if(key < arr[middle]) {
			if(binarySearch(arr, begin, middle-1, key)==1) return 1;
		} else if(key > arr[middle]) {
			if(middle == arr.length-1) return 0;
			if(binarySearch(arr, middle+1, end, key)==1) return 1;
		} else return 0;
		
		return 0;
	} //solution
} //end class
