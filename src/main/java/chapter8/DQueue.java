package chapter8;

public class DQueue {

	DQNode front;
	DQNode rear;
	
	public DQueue() {
		front = null;
		rear = null;
	} //DQueue
	
	public boolean isEmpty() {
		return front == null;
	}
	
	public void insertFront(char item) {
		DQNode newNode = new DQNode();
		newNode.data = item;
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
			newNode.rlink = null;
			newNode.llink = null;
		} else {
			front.llink = newNode;
			newNode.rlink = front;
			newNode.llink = null;
			//앞의 주소값이 새로운 노드로 바뀜..
			front = newNode;
		}
		System.out.println("Front Inserted Item : " + item);
	} //insertFront
	
	public void insertRear(char item) {
		DQNode newNode = new DQNode();
		newNode.data = item;
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
			newNode.llink = null;
			newNode.rlink = null;
		} else {
			rear.rlink = newNode;
			newNode.llink = rear;
			newNode.rlink = null;
			rear = newNode;
		}
		System.out.println("Rear Inserted Item : " + item);
	} //insertRear
	
	public char deleteFront() {
		if(isEmpty()) {
			System.out.println("Front Deleting fail! DQueue is empty!!");
			return 0;
		} else {
			char item = front.data;
			//노드 하나였을 경우..
			if(front.rlink == null) {
				front = null;
				rear = null;
			} else {
				front = front.rlink;
				front.llink = null;
			}
			return item;
		}
	} //deleteFront
	
	public char deleteRear() {
		if(isEmpty()) {
			System.out.println("Front Deleting fail! DQueue is empty!!");
			return 0;
		} else {
			char item = rear.data;
			if(rear.llink == null) {
				rear = null;
				front = null;
			} else {
				rear = rear.llink;
				rear.rlink = null;
			}
			return item;
		}
	} //deleteRear
	
	public void removeFront() {
		if(isEmpty()) {
			System.out.println("Front Removing fail! DQueue is empty!!");
		} else {
			if(front.rlink == null) {
				front = null;
				rear = null;
			} else {
				front = front.rlink;
				front.llink = null;
			}
		}
	} //removeFront
	
	public void removeRear() {
		if(isEmpty()) {
			System.out.println("Rear Removing fail! DQueue is empty!!");
		} else {
			if(rear.llink == null) {
				rear = null;
				front = null;
			} else {
				rear = rear.llink;
				rear.rlink = null;
			}
		}
	} // removeRear
	
	public char peekFront() {
		if(isEmpty()) {
			System.out.println("Front Peeking fail! DQueue is empty!!");
			return 0;
		} else {
			return front.data;
		}
	}
	
	public char peekRear() {
		if(isEmpty()) {
			System.out.println("Rear Peeking fail! DQueue is empty!!");
			return 0;
		} else {
			return rear.data;
		}
	}
	
	public void printDQueue() {
		if(isEmpty()) {
			System.out.printf("DQueue is empty!! \n \n");
		} else {
			DQNode temp = front;
			System.out.printf("Linked Queue >>");
			while(temp != null) {
				System.out.printf("%c ",temp.data);
				temp = temp.rlink;
			}
		System.out.println();
		System.out.println();
		}
	} //print
} //end class
