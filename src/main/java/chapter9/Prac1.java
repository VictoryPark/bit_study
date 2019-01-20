package chapter9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Prac1 {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int depth = Integer.parseInt(scan.nextLine());
		
		execute(depth, scan.nextLine());
	} //main
	
	private static void execute(int depth, String command) {
		int nodeCnt = (int) (Math.pow(2,depth) - 1);
		String[] sequence = command.split(" ");
		List<String> list = new ArrayList<>();
		int top = 1;
		
		for(String item : sequence) {
			list.add(item);
		} // list 에 
		
		String[] answer = new String[nodeCnt+1];
		//System.out.print(Arrays.toString(answer));
		//list에서 가장 중간에 있는 수가 레벨 0에 있는 root노드의 원소다
		String root = list.remove((int)Math.ceil(nodeCnt/2));
		answer[top] = root;
		//System.out.print(Arrays.toString(answer));
		
		int left = answer.length / 2; // 4
		int parent = left / 2; // 2
		int right = left + 1; // 5
		while(list.size() != 0) {
			if(parent == top) {
				parent = top*2 +1;
				left = parent *2;
			} else {
				answer[left] = list.remove(0);
				answer[parent/=2] = list.remove(0);
				answer[right] = list.remove(0);
				
			}
		} //while
		
	} //execute
} //end class
