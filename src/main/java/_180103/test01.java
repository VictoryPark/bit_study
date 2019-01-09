package _180103;

import java.util.Scanner;

public class test01 {

	static char[] openingArr = new char[] {'(', '{', '['};
	static char[] closingArr = new char[] {')', '}', ']'};
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.println("입력 값?");
		String input = sc.nextLine();
		char[] inputArr = input.toCharArray();
		int arrIndex = 0;
		
		for(int i=0; i<openingArr.length; i++) {
			if(inputArr[0] == openingArr[i]) {
				arrIndex = i;
				
			}
		}
		System.out.println("arrIndex : " + arrIndex);
		
		
		
		
	} // main method
	
	
} //end class
