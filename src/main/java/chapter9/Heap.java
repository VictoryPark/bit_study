package chapter9;

public class Heap {

	private int heapSize;
	private int itemHeap[];
	
	public Heap() {
		heapSize = 0;
		itemHeap = new int[50];
	}
	
	public void insertHeap(int item) {
		//현재 사이즈에서 하나 더 올려서 그곳에 임시 저장하게 한다..
		int i = ++heapSize;
		//힙 사이즈가 2보다 크고 부모노드 원소보다 삽입 원소가 클때..
		while((i != 1) && (item > itemHeap[i/2])) {
			//삽입원소가 부모원소로 위치하게 되고 부모노드로 포커스를 옮긴다..
			itemHeap[i] = itemHeap[i/2];
			i/=2;
		} //while
		//확정된 인덱스에 원소를 넣는다.
		itemHeap[i] = item;
	} //insertHeap
	
	public int getHeapSize() {
		return this.heapSize;
	} //getHeapSize
	
	public int deleteHeap() {
		int parent, child;
		int item = itemHeap[1];
		//heapSize 에 있는 원소를 temp에 저장해놓고 -1을 한다..
		int temp = itemHeap[heapSize--];
		parent = 1;
		child = 2;
		
		//자식노드가 힙 사이즈보다 같을때까지 비교..
		while(child <= heapSize) {
			//현재 노드의 왼쪽 오른쪽 노드의 원소 크기 비교..
			if((child < heapSize) && 
					(itemHeap[child] < itemHeap[child+1])) {
				child++;
			}
			//만약 temp에 저장된 원소가 자식노드중에 제일 큰수보다 크면..그냥 그대로 부모 노드된다.
			if(temp >= itemHeap[child]) break;
			
			//temp가 더 작다면 현재 노드와 자식노드를 바꾼다.
			itemHeap[parent] = itemHeap[child];
			//포커스를 자식 노드 위치로 바꾼다.
			parent = child;
			//자식노드는 포커스를 바꾼 노드의 자식으로 위치를 바꾼다..
			child *= 2;
		}
		itemHeap[parent] = temp;
		//삭제한 루트 노드의 값을 반환한다.
		return item;
	} //deleteHeap
	
	public void printHeap() {
		System.out.printf("\nHeap >>> ");
		for(int i=1;i<heapSize;i++) {
			System.out.printf("[%d] ", itemHeap[i]);
		}
	} //printHeap
} // end class
