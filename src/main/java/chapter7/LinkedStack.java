package chapter7;

public class LinkedStack implements Stack{

	private StackNode top;
	
	
	public boolean isEmpty() {
		return (top == null);
	} //isEmpty

	public void push(char item) {
		StackNode newNode = new StackNode();
		
		newNode.data = item;
		newNode.link = top;
		top = newNode;
		System.out.println("Inserted Item : " +item);
	} //push

	public char pop() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!!!");
			return 0;
		} else {
			char item = top.data;
			//top의 링크는 먼저 들어간 노드의 주소값으로 되어있다.
			top = top.link;
			//top에 있던 노드의 data 값을 반환한다...
			return item;
		}
	} //pop

	public void delete() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!!!");
		} else {
			top = top.link;
		}
	} //delete

	public char peek() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!!!");
			return 0;
		} else {
			return top.data;
		}
	} //peek
	
	public void printStack() {
		if(isEmpty()) {
			System.out.printf("Linked Stack is empty !! \n \n");
		} else {
			StackNode temp = top;
			System.out.println("Linked Stack>> ");
			while(temp != null) {
				System.out.printf("\t %c \n", temp.data);
				temp = temp.link;
			}
			System.out.println();
		} //if-else
	} //printStack

} //end class
