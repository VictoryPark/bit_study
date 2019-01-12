package chapter7;

import java.util.Scanner;

public class Prac1 {

	private static Scanner scan = new Scanner(System.in);
	private static PracStack stack;
	
	public static void main(String[] args) {
		int count = Integer.parseInt(scan.nextLine());
		stack = new PracStack(count);
		if(count>=1 && count<=100) {
			for(int i=1; i<=count;i++) {
				input(scan.nextLine());
			} // for				
		} // count 범위 지정
		
		stack.printStack();
	
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
						stack.push(number);						
					}
					break;
				case 'c' : 
					stack.count();
					break;
				case 'o' :
					stack.pop();
					break;
			} //switch

	} //input
	
	
} //end class
