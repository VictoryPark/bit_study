package chapter6;

public class LinkedList {

	//List 에서 첫번째 노드를 가리키는 주소값을 가진 head변수
	private ListNode head;
	
	public LinkedList() {
		head = null;
	} // 생성자
	
	public void insertMiddleNode(ListNode pre, String data) {
		ListNode newNode = new ListNode(data);
		newNode.link = pre.link;
		pre.link = newNode;
	} //insertMiddle
	
	public void insertLastNode(String data) {
		ListNode newNode = new ListNode(data);
		
		if(head == null) {
			// data가 "월" 인 노드를 가리키는 주소가 head에 들어가게 된다.
			this.head = newNode;
		} else {
			ListNode temp = head;
			
			while(temp.link != null) {
				temp = temp.link;
			} //temp.link의 값이 null인 것을 찾는 반복문..
			
			temp.link = newNode;
		}
	} //insertLast
	
	public void deleteLastNode() {
		ListNode pre;
		ListNode temp;
		//노드가 없으면 메소드는 끝..
		if(head == null) return;
		
		if(head.link == null) {
			//연결리스트에 노드가 하나밖에 없을경우는 head에 null을 줘서 0으로 만든다.
			head = null;
		} else {
			//지울 노드의 앞 노드
			pre = head;
			//지울 노드
			temp = head.link;
			
			//노드의 링크 필드가 null이 될때까지 반복..
			while(temp.link != null) {
				//null이 아니면 다음 노드들로 넘어간다..
				pre = temp;
				temp = temp.link;
			}
			
			//앞 노드의 link를 null로 하면 뒷 노드가 연결 안됨..
			pre.link = null;
		}
		
	} // deleteLast
	
	public ListNode searchNode(String data) {
		ListNode temp = this.head;
		
		//temp가 null일때까지 반복..
		while(temp != null) {
			if(data == temp.getData()) {
				return temp;
			} else {
				temp = temp.link;
			}
			
		} //while
		
		return temp;
	} // searchNode
	
	public void reverseList() {
		ListNode next = head;
		ListNode current = null;
		ListNode pre = null;
		
		while(next != null) {
			pre = current;
			current = next;
			next = next.link;
			//current.link 에 pre를 주면 거꾸로 바라보게 해준다.
			current.link = pre;
		}
		
		//마지막 node를 가리키던 주소값이 head로 온다.
		head = current;
		
	} //reverseList
	
	public void printList() {
		ListNode temp = this.head;
		System.out.printf("L = (");
		
		while(temp != null) {
			System.out.printf(temp.getData());
			temp = temp.link;
			
			if(temp != null) {
				System.out.printf(", ");
			}
		} //while
		System.out.println(")");
	}
} //end class
