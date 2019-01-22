package chapter11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prac1 {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int count = Integer.parseInt(scan.nextLine());
		
		if(count%2==1 && count>=1 && count <= 500000) {
			int[] positive = new int[4001]; // 4000이 최대 값이니까..0부터 하면..4000인덱스에 4000이 담기려면..개수는 4001개여야 한다..
			int[] negative = new int[4001];
			for(int i=0; i<count; i++) {
				int input = Integer.parseInt(scan.nextLine());
				if(input < 0) {
					negative[-input] ++;
				} else {
					positive[input] ++;
				}
			}		
			calculate(positive, negative, count);
		} // count 가 홀수일때 실행..
		
	} //main

	private static void calculate(int[] positive, int[] negative, int count) {
//		System.out.println("nega" + Arrays.toString(negative));
//		System.out.println("posi" + Arrays.toString(positive));
		int sum = 0;
		int mostFreq = 1;
		List<Integer> freqList = new ArrayList<>();
		int[] inputArr = new int[count];
		int index = 0;
		//음수 배열에 값들이 담겼을때 실행..
		if(negative.length != 0) {
			//오름차순으로 inputArr에 담아야 하기 때문에 4000~0 까지 돌린다.. -를 붙이면 크기가 반대기 때문에~
			for(int i=negative.length-1; i >= 0; i--) {
				//positive에 들어가있는 원소 중에 0이 아닌 것만 거른다..
				if(negative[i] != 0) {
					 //System.out.println("반복??" + i);
					if(mostFreq < negative[i]) {
						//음수 배열에서 더 큰 빈도수가 있는 인덱스가 나왔을때 최대 빈도수 업뎃 한다~~
						mostFreq = i;
						//빈도수가 더 큰 인덱스가 나왔을 경우 list를 비우고 빈 list에 인덱스 값(input된 숫자)을 넣는다..
						freqList.clear();
						freqList.add(-i);
					} else if(mostFreq == negative[i]) {
						//빈도수가 같은 인덱스 값을 list에 넣는다..
						freqList.add(-i);
					}
					
					//빈도수 만큼 저장되어있으니까 빈도수가 0이 되기 전까지 inputArr에는 빈도수만큼 넣어줘야 한다..그래서 반복 돌린다.
					while(negative[i] != 0) {
						//합은 인덱스에서 -를 붙인 상태로 더해서 구한다..
						sum += (-i);
						//input 된 숫자들을 오름차순으로 배열에 담는다..
						inputArr[index++] = -i; 		
						//negative에 있는 빈도수를 1씩 줄여서 0되기전까지 inputArr에 담는다.
						negative[i]--;
					}
				}
			}
		} 
		//양수 배열에 값들이 담겼을때 실행~~
		if(positive.length != 0) {
			for(int j=0; j<positive.length; j++) {
				//positive에 들어가있는 원소 중에 0이 아닌 것만 거른다..
				if(positive[j] != 0) {
					//System.out.println("반복??" + j);
					if(mostFreq < positive[j]) {
						mostFreq = j;
						//빈도수가 더 큰 인덱스가 나왔을 경우 list를 비우고 빈 list에 인덱스 값(input된 숫자)을 넣는다..
						freqList.clear();
						freqList.add(j);
					} else if(mostFreq == positive[j]) {
						//빈도수가 같은 인덱스 값을 list에 넣는다..
						freqList.add(j);
					}
					
					//inputArr에 
					while(positive[j] != 0) {
						sum += j;
						inputArr[index++] = j;
						positive[j] --;
					}
				}
			} //for
		} //positive 원소 있을때..
		
//		System.out.println(Arrays.toString(inputArr));
//		System.out.println(freqList.toString());
//		System.out.println("sum : " +sum);
		//평균..
		System.out.println(Math.round((float)sum/count));			
		//중앙값!!
		System.out.println(inputArr[count/2]);
		//최빈값!!!!!
		if(freqList.size() == 1) {
			System.out.println(freqList.get(0));
		} else {
			System.out.println(freqList.get(1));
		}
		//범위
		System.out.println(inputArr[count-1] - inputArr[0]);
	} // calculate
	
	
} //end class
