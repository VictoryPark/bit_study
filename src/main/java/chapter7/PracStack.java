package chapter7;

import java.util.ArrayList;
import java.util.List;

public class PracStack implements Stack2{

	private int top;
	private int stackSize;
	private int[] resultArray;
	private List<String> answer = new ArrayList<String>();
	
	public PracStack(int stackSize) {
		this.top = -1;
		this.stackSize = stackSize;
		this.resultArray = new int[stackSize];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == stackSize-1);
	}
	
	public void push(int item) {
		if(isFull()) {
			System.out.println("스택이 꽉 찼음...");
		} else {
			resultArray[++top] = item;
		}
	} //push

	public void pop() {
		if(isEmpty()) {
			//pop 하면 empty 값이 answer에 들어간다..
			answer.add("empty");
		} else {
			answer.add(String.valueOf(resultArray[top--]));
		}
		
	} //pop;


	public void count() {
		answer.add(String.valueOf(top+1));
	} //count

	public void printStack() {
		for(int i=0;i<answer.size();i++) {
			System.out.printf("%s \n", answer.get(i));
		}
	} //printStack
	
}//end class
