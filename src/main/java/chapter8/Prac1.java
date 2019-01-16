package chapter8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prac1 {

	private static Scanner scan = new Scanner(System.in);
	private static List<Integer> valueList = new ArrayList<>(); 
	
	public static void main(String[] args) {
		int count = Integer.parseInt(scan.nextLine());
		if(count>=1 && count<=10000) {
			for(int i=0; i<count; i++) {
				input(scan.nextLine());
			} //for	
		} else return;
	} //main
	
	public static void input(String command) {
		int len = command.length();
		
		if(command.contains(" ")) {
			int number = Integer.parseInt(command.substring("push ".length()));
			if(number>=1 && number<=100000) {
				valueList.add(number);				
			} else return;
		} else if(len == 5) {
			//front 명령일 경우...
			if(command.startsWith("f")) {
				if(isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(valueList.get(0));
				}
			// empty 명령어 일경우...
			} else {
				if(isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			}	
		} else if(len == 4) {
			int size = valueList.size();
			//size 를 출력한다..
			if(command.startsWith("s")) {
				System.out.println(size);
			//back : 가장 뒤에 있는 수를 출력..
			} else {
				if(isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(valueList.get(size-1));					
				}
			}
		//pop 일때...
		} else {
			if(isEmpty()) {
				System.out.println(-1);
			} else {
				System.out.println(valueList.get(0));
				valueList.remove(0);				
			}
		}
	} //input
	
	public static boolean isEmpty() {
		return valueList.size() == 0;
	} //isEmpty
	
	
} //end class
