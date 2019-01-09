package chapter7;

public class ArrayStack implements Stack{

	private int top;
	private int stackSize;
	private char itemArray[];
	
	public ArrayStack(int stackSize) {
		top = -1;
		this.stackSize = stackSize;
		itemArray = new char[this.stackSize];
	} //생성자
	
	public boolean isEmpty() {
		return (top == -1);
	} //isEmpty
	
	public boolean isFull() {
		return (top == this.stackSize-1);
	}

	public void push(char item) {
		if(isFull()) {
			System.out.println("Inserting fail! Array Stack is full!!");
		} else {
			itemArray[++top] = item;
			System.out.println("Inserted Item : " + item);
		}
	} // push

	public char pop() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Array Stack is empty!!!");
			return 0;
		} else {
			return itemArray[top--];
		}
	} //pop

	public void delete() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Array Stack is empty!!!");
		} else {
			top--;
		}
	} //delete

	public char peek() {
		if(isEmpty()) {
			System.out.println("Peeking fail! Array Stack is empty!!!");
			return 0;
		} else {
			return itemArray[top];
		}

	} //peek
	
	public void printStack() {
		if(isEmpty()) {
			System.out.println("Array Stack is empty !! \n \n");
		} else {
			System.out.printf("Array Stack>> ");
			//top 값은 Stacksize 보다 -1 이겠지..???
			for(int i=0; i<=top; i++) {
				// %c 는 char 값을 나타내는 건가...???
				System.out.printf("%c ", itemArray[i]);
			}
			System.out.println();
			System.out.println();
		} //if-else
	} //printStack
	
} //end class
