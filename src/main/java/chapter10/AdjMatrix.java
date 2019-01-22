package chapter10;

public class AdjMatrix {

	private int matrix[][] = new int[10][10];
	//정점의 개수..즉, 행과 열의 길이..
	private int totalV = 0;
	
	public void insertVertex(int v) {
		totalV++;
	} //insertVertex
	
	public void insertEdge(int v1, int v2) {
		//간선을 연결하려는 정점이 행과 열의 길이와 같거나 크다는 것은..인덱스 값에서 벗어난 것이다..
		if(v1 >= totalV || v2 >= totalV) {
			System.out.println("그래프에 없는 정점입니다.");
		} else {
			//1 은 v1 와 v2 가 간선으로 연결되어있다는 뜻..0은 연결 안되어있다는 뜻..행렬에 저장..
			matrix[v1][v2] = 1;
		}
	} //insertEdge
	
	public void printMatrix() {
		for(int i=0; i<totalV; i++) {
			System.out.printf("\n\t\t");
			for(int j=0; j<totalV; j++) {
				System.out.printf("%2d", matrix[i][j]);
			}
		}
	} //print
 } //end class
