package chapter10;

public class AdjList {

	private GraphNode head[] = new GraphNode[10];
	private int totalV = 0;
	
	public void insertVertex(int v) {
		totalV++;
	} //insertV
	
	public void insertEdge(int v1, int v2) {
		if(v1 >= totalV || v2 >= totalV) {
			System.out.println("그래프에 없는 정점입니다.");
		} else {
			GraphNode gNode = new GraphNode();
			gNode.vertex = v2;
			gNode.link = head[v1];
			//덮어써지지 않나....?
			head[v1] = gNode;
		}
	} // insertE
	
	public void printAdjList() {
		GraphNode gNode = new GraphNode();
		for(int i=0; i<totalV; i++) {
			//왜 65를 더하나유....??
			//int를 character 타입으로 표현할려고 아스키 코드인..A=65를 더해서 표현..
			System.out.printf("\n정점 %c의 인접리스트 ", i + 65);
			gNode = head[i];
			while(gNode != null) {
				System.out.printf("-> %c", gNode.vertex+65);
				gNode = gNode.link;
			} //while
		} // for
	} //print
	
} //end class
