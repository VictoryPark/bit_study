package chapter8;

public class Ex8_3 {

	public static void main(String[] args) {
		char deletedItem;
		LinkedQueue LQ = new LinkedQueue();
		
		LQ.enQueue('A');
		LQ.printQueue();
		
		LQ.enQueue('B');
		LQ.printQueue();
		
		deletedItem = LQ.deQueue();
		if(deletedItem != 0) {
			System.out.println("deletedItem : " +deletedItem);
		}
		LQ.printQueue();
		
		LQ.enQueue('C');
		LQ.printQueue();
		
		deletedItem = LQ.deQueue();
		if(deletedItem != 0) {
			System.out.println("deletedItem : " +deletedItem);
		}
		LQ.printQueue();
		
		deletedItem = LQ.deQueue();
		if(deletedItem != 0) {
			System.out.println("deletedItem : " +deletedItem);
		}
		LQ.printQueue();
		
		deletedItem = LQ.deQueue();
		if(deletedItem != 0) {
			System.out.println("deletedItem : " +deletedItem);
		}
		LQ.printQueue();
	} //main
} //end class
