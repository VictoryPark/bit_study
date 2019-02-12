package coding_test;

public class codility_1 {

	public int solution(IntList L) {
		IntList temp = L;
		int count = 1;
		if(temp.next == null) return count;
		else {
			while(temp.next != null) {
				temp = temp.next;
				count++;
			}
			return count;			
		}
	}
	
} //end class

class IntList {
	public int value;
	public IntList next;
}
