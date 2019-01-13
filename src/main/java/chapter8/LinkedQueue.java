package chapter8;

public class LinkedQueue implements Queue{

	QNode front;
	QNode rear;
	
	public LinkedQueue() {
		front = null;
		rear = null;
	} // 생성자
	
	@Override
	public boolean isEmpty() {
		return front == null;
	}

	@Override
	public void enQueue(char item) {
		QNode newNode = new  QNode();
		newNode.data = item;
		newNode.link = null;
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
		} else {
			rear.link = newNode;
			rear = newNode;
		}
		System.out.println("Inserted Item : " + item);
	} // enQueue

	@Override
	public char deQueue() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Queue is empty!!");
			return 0;
		} else {
			char item = front.data;
			front = front.link;
			if(front==null) {
				rear = null;
			}
			return item;
		}
	} //deQ

	@Override
	public void delete() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Queue is empty!!");
		} else {
			front = front.link;
			if(front == null) {
				rear = null;
			}
		}
	} //delete

	@Override
	public char peek() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Queue is empty!!");
			return 0;
		} else {
			return front.data;
		}
	} //peek
	
	public void printQueue() {
		if(isEmpty()) {
			System.out.printf("Linked Queue is empty!! \n \n");
		} else {
			QNode temp = front;
			System.out.printf("Linked Queue >>");
			while(temp != null) {
				System.out.printf("%c ",temp.data);
				temp = temp.link;
			}
		System.out.println();
		System.out.println();
		}
	} //print
	
	
} //end class
