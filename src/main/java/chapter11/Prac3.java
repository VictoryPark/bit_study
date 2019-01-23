package chapter11;

import java.util.Arrays;

public class Prac3 {
	
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		solution(array, commands);
	} //main
	
	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int answerIndex = 0;
		
		//주어진 명령어 하나씩 돌린다..
		for(int[] comm : commands) {
			//명령어 1 인덱스와 0인덱스를 빼고 1 을 더해야 추출해내는 배열의 크기가 나온다..
			int endIndex = comm[1]-1;
			int beginIndex = comm[0]-1;
			int targetIndex = comm[2]-1;
			int[] temp = new int[endIndex - beginIndex + 1];
			int index = 0;
			
			
			//주어진 범위만큼 잘라서 temp 배열에 넣는다.
			for(int i=beginIndex; i<=endIndex; i++) {
				temp[index++] = array[i];
			}
			
			int place = 0;
			int min = 0;
			//temp를 오름차순으로 배열한다..
			for(int i=0; i<temp.length; i++) {
				min = i;
				for(int j=i+1; j<temp.length; j++) {
					if(temp[min] > temp[j]) {
						min = j;
					}					
				}
				place = temp[min];
				temp[min] = temp[i];
				temp[i] = place;
			} // 선택정렬...
						
			answer[answerIndex++] = temp[targetIndex];
		} // 큰 for..
		System.out.println(Arrays.toString(answer));

        return answer;
	} //solution
} //end class
