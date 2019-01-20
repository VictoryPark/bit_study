package chapter9;

import java.util.Arrays;
import java.util.Scanner;

public class Prac2_Heap {

	private int[] scoville;
	private int size = 0;
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Prac2_Heap obj = new Prac2_Heap();
		String[] input = scan.nextLine().split(" ");
//		String[] result = Arrays.copyOf(input, input.length+1);
//		System.out.println(Arrays.toString(result));
		int[] scoville = new int[input.length+1];
		for(String item : input) {
			scoville = obj.insertItem(scoville, Integer.parseInt(item));
		}
		//System.out.println(Arrays.toString(input));
		scoville = Arrays.copyOfRange(scoville, 1, scoville.length);
		int answer = obj.solution(scoville, Integer.parseInt(scan.nextLine()));
		System.out.println("answer : " +answer);
	} //main
	
	public int solution(int[] scoville, int K) {
        int answer = 0;
        int[] result = Arrays.copyOf(scoville, (scoville.length)+1);
        Arrays.sort(result);
        this.scoville = result;
        System.out.println(Arrays.toString(this.scoville));
        
        while(this.scoville.length != 2) {
        	int sum = deleteItem() + deleteItem()*2;
        	answer++;
        	//System.out.println("삭제 후 :" +Arrays.toString(this.scoville));
        	this.scoville = insertItem(this.scoville, sum);
        	if(this.scoville[1] >= K) {
        		break;
        	}
        	//System.out.println("scoville :" +Arrays.toString(this.scoville));
        }
        if(this.scoville[1] < K) {
        	answer = -1;
        }
        return answer;
    } //solution
	
	public int[] insertItem(int[] scoville, int item) {
		int index = ++size;
		
		//계속 부모 노드랑만 비교하는 while 문..
		while((index != 1) && (item < scoville[index/2])) {
			scoville[index] = scoville[index/2];
			index /=2;
		}
		//부모 노드랑 비교해서 정해진 index 값으로 item을 삽입한다..
		scoville[index] = item;
		return scoville;
	} //insert
	
	public int deleteItem() {
		//지워서 내보낼 원소 값..
		int item = scoville[1];
		System.out.println("item : " +item);
		
		//맨 마지막에 있는 원소를 꺼내놓는다..
		int temp = scoville[size--];
		System.out.println("temp : " +temp);
		
		int parent = 1;
		int child = 2;
		
		while(child <= size) {
			// 자식 노드 왼쪽과 오른쪽의 크기를 비교하여 작으면 작은 index 값을 저장..
			if((child < size) && 
					(scoville[child] > scoville[child+1])) {
				child++;
			}
			
			//저장된 자식노드 인덱스(작은 값) 보다 작으면 parent 값 그대로 갖고 나온다. 
			if(temp <= scoville[child]) {
				break;
			}
			
			//temp 보다 작은 값을 가지던 자식 노드의 원소를 부모 자리에 넣는다..
			scoville[parent] = scoville[child];
			parent = child;
			child *= 2;
		}
		scoville[parent] = temp;
		System.out.println("scoville :" +Arrays.toString(this.scoville));
		return item;
	} // delete
} //end class
