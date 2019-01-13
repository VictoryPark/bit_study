package chapter8;

public class ArrayQueue implements Queue{
	
	private int front;
	private int rear;
	private int queueSize;
	private char itemArray[];

	public ArrayQueue(int queueSize) {
		front = -1;
		rear = -1;
		this.queueSize = queueSize;
		itemArray = new char[this.queueSize];
	} //생성자
	
	@Override
	public boolean isEmpty() {
		return (front == rear);
	}
	
	public boolean isFull() {
		return (rear == queueSize-1);
	}

	@Override
	public void enQueue(char item) {
		if(isFull()) {
			System.out.println("Inserting fail! Array Queue is full!!");
		} else {
			itemArray[++rear] = item;
			System.out.println("Inserted Item : " + item);
		}
	}

	@Override
	public char deQueue() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Array Queue is empty!!");
			return 0;
		} else {
			return itemArray[++front];
		}
	}

	@Override
	public void delete() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Array Queue is empty!!");
		} else {
			++front;
		}
	}

	@Override
	public char peek() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Array Queue is empty!!");
			return 0;
		} else {
			return itemArray[front+1];
		}

	} //peek
	
	public void printQueue() {
		if(isEmpty()) {
			System.out.printf("Array Queue is empty!! \n\n");
		} else {
			System.out.printf("Array Queue >> ");
			for(int i=front+1; i<=rear; i++) {
				System.out.printf("%c ", itemArray[i]);
			}
			System.out.println();
			System.out.println();
		}
	} //printQueue

} //end class
