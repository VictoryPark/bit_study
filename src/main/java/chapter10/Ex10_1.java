package chapter10;

public class Ex10_1 {

	public static void main(String[] args) {
		AdjMatrix MGI = new AdjMatrix();
		for(int i=0; i<4; i++) {
			MGI.insertVertex(i);
		}
		//무방향이라서 행렬에 중간 대각선을 중심으로 두고 대칭을 이룬다..
		MGI.insertEdge(0,3); // A, D
		MGI.insertEdge(0,1); // A, B
		MGI.insertEdge(1,3); // B, D
		MGI.insertEdge(1,2); // B, C
		MGI.insertEdge(1,0); // B, A
		MGI.insertEdge(2,3); // C, D
		MGI.insertEdge(2,1); // C, B
		MGI.insertEdge(3,2); // D, C
		MGI.insertEdge(3,1); // D, B
		MGI.insertEdge(3,0); // D, A
		System.out.printf("\n그래프 G1의 인접행렬 : ");
		MGI.printMatrix();
		System.out.println();
		
		AdjList LGI = new AdjList();
		for(int i=0; i<4; i++) {
			LGI.insertVertex(i);
		}
		//
		LGI.insertEdge(0,3);
		LGI.insertEdge(0,1);
		LGI.insertEdge(1,3);
		LGI.insertEdge(1,2);
		LGI.insertEdge(1,0);
		LGI.insertEdge(2,3);
		LGI.insertEdge(2,1);
		LGI.insertEdge(3,2);
		LGI.insertEdge(3,1);
		LGI.insertEdge(3,0);
		System.out.printf("\n그래프 G1의 인접그래프 : ");
		LGI.printAdjList();
		System.out.println();
	} // main
} //end class
