package chapter6;

public class ProfileLinkedList {

	private ProfileNode head;
	
	public ProfileLinkedList() {
		head = null;
	} // 생성자
	
	public void insertNewNode(String name, String phone, String email) {
		ProfileNode newNode = new ProfileNode(name, phone, email);
		
		if(head == null) {
			head = newNode;
		} else {
			ProfileNode temp = head;
			
			while(temp.link != null) {
				temp = temp.link;
			} // while
			
			temp.link = newNode;
		} //if-else
		
	} //insertNewNode
	
	public ProfileNode searchNode(String name) {
		ProfileNode temp = this.head;
		
		while(temp != null) {
			if(temp.getName().equals(name)) {
				return temp;
			} else {
				temp = temp.link;
			}
		} //while
		
		//찾은 노드의 주소값을 넘겨준다..
		return temp; 
	} //searchNode
	
	public void deleteNode(ProfileNode target) {
		ProfileNode pre = head;
		ProfileNode temp = head;
		
		if(head == null) return;
		
		//만약 지우려는 target이 첫 노드일경우 ..
		if(head == target) {
			head = target.link;
			return;
		}
		
		//첫 노드가 아니면 반복문 돌리면서 잡아낸다..
		while(temp != null) {
			if(pre.link == target) {
				//pre 의 링크 값이 target 이면 pre가 지우려는 노드의 앞 노드이다.
				pre.link = target.link;
				return;
			} else {
				pre = temp;
				temp = temp.link;
			} //if-else
		} // while 
	} // deleteNode
	
	
	public void printNode() {
		ProfileNode temp = head;
//		System.out.printf("( ");
		
		while(temp != null) {
			System.out.printf("%s\t%s / %s\n",
							temp.getName(),temp.getPhone(),temp.getEmail());
			temp = temp.link;
		}
		
	} //print
} //end class

