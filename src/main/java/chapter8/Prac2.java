package chapter8;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Prac2 {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int count = Integer.parseInt(scan.nextLine());
		for(int i=0;i<count;i++) {
			setup(scan.nextLine());
		} //for 
	} //main
	
	public static void setup(String command) {
		// N개 의 문서와 프린트 원하는 index 자리를 쪼갬..
		String[] setting = command.split(" ");
		int size = Integer.parseInt(setting[0]);
		
		if(size <= 100) {
			int targetIndex = Integer.parseInt(setting[1]);
			if(targetIndex>=0 && targetIndex <size) {
				execute(targetIndex);
			}
		}
	
	} //setup
	
	public static void execute(int targetIndex) {
		String[] priority = scan.nextLine().split(" ");
		Queue<Integer> Q = new LinkedList<>();
		//각 인덱스에 우선순위를 매긴다..
		for(int i=0; i<priority.length; i++) {
			Q.add(Integer.parseInt(priority[i]));
		}

		int target = targetIndex;
		int answer = 1;

		while(!Q.isEmpty()) {
			int max = 0;
			//최대값 찾는 for 문...
			for(int value : Q) {
				if(max < value) max = value;
			}
			//System.out.println("max : " + max);
			
			//최댓값이 앞으로 올때까지 순서 뒤로 돌림..
			if(Q.peek() != max) {
				Q.offer(Q.poll());
				target--;
				if(target<0) {
					target = Q.size() -1;
				}
			//최댓값이 앞으로 오면???
			} else {
				if(target==0) {
					System.out.println(answer);
					return;
				} else {
					Q.remove();
					target--;
					answer++;
				}
			}
		} //while
		
		//print(Q);
	} //execute
	
} //end class
