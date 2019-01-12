package chapter7;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Prac2 {

	private static List<Integer> bracketList = new ArrayList<>();
	private static List<Integer> laserList = new ArrayList<>();
	private static String arrangement;
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		arrangement = scan.nextLine();
		
		System.out.println(solution(arrangement));
	} //main
	
	public static int solution(String arrangement) {
		int answer = 0;
		
		//주어진 괄호 순서 만큼 반복..
		for(int i = 0; i<arrangement.length(); i++) {
			char test = arrangement.charAt(i);
			
			switch(test) {
				case '(' :
					bracketList.add(i);
					break;
				case ')' : 
					// 닫는 괄호가 들어왔을 경우에는..레이저 위치와 막대위치를 판단하는 if을 준다..
					if(arrangement.charAt(i-1) == '(') {
						laserList.add(i-1);
						bracketList.remove(bracketList.size()-1);
					} else {
						int lazercount = 0;
						for(int lazerIndex : laserList) {
							if(lazerIndex > bracketList.get(bracketList.size()-1)
									&& lazerIndex < i) {
								lazercount++;
							} //막대기 사이에 있는 레이저 개수 count
						} // lazer 위치가 있는 리스트를 반복 돌림..
						//우리가 원하는 답은 레이저 수보다 하나 더 많다~~
						answer += lazercount + 1;
						//이미 레이저로 잘린 막대기는 list 에서 뺀다.
						bracketList.remove(bracketList.size()-1);
					}
					
			} //switch 
		} // for
		
		return answer;
	} //solution
} //end class
