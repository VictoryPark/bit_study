package chapter7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JungOlMain {
	
	private static Scanner scan = new Scanner(System.in);
	private static int top=-1;
	private static List<Integer> stack = new ArrayList<>();
	private static List<String> answerList = new ArrayList<>();

	public static void main(String[] args) {
		int count = Integer.parseInt(scan.nextLine());
		if(count>=1 && count<=100) {
			for(int i=0; i<count;i++) {
				input(scan.nextLine());
			} // for				
		} // count 범위 지정
		
		for(String answer : answerList) {
			System.out.println(answer);
		}
	
	} //main
	
	private static void input(String order) {	
			//System.out.println(order);
			char start = order.charAt(0);
			int number = 0;
			
			switch(start) {
				case 'i' :
					//System.out.println(order.substring("i ".length()));
					number = Integer.parseInt(order.substring("i ".length()));
					if(number>0 && number <=10000) {
						push(number);						
						break;
					} else {
						return;
					}
				case 'c' : 
					count();
					break;
				case 'o' :
					pop();
					break;
				default : return;
			} //switch

	} //input
	
	
	public static void push(int item) {
			stack.add(item);
			top++;
	} //push
	
	public static void pop() {
		if(top==-1) {
			//pop 하면 empty 값이 answer에 들어간다..
			answerList.add("empty");
		} else {
			answerList.add(String.valueOf(stack.get(top)));
			stack.remove(top--);
		}
		
	} //pop;
	
	public static void count() {
		answerList.add(String.valueOf(stack.size()));
	} //count
} //end class
