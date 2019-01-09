package chapter5;

public class OperateMatrix {

	private int rownumB;
	private int colnumB;
	private int valnum;
	private int[][] matrixA;

	
	public TransposeMatrix TransposeSM(SparseMatrix SM) {
		this.rownumB = SM.getColnum();
		this.colnumB = SM.getRownum();
		this.valnum = SM.getValnum();
		//System.out.println(valnum);
		this.matrixA = SM.getMatrix();
		
		TransposeMatrix B = new TransposeMatrix(SM);
		if(valnum > 0) {
			for(int i=0; i<rownumB; i++) {
				for(int j=1; j<=valnum; j++) {
//					System.out.println("i: " + i);
//					System.out.println("j: " + j);
					B.setMatrixValue(i, j, matrixA[j][i]);						
				} //전치된 행렬의 1열 부터 0이 아닌 원소 수만큼 for문 
			} // 전치된 행렬의 행의 수대로 for문
		}
		
		return B;
	}//TransposeSM
} //end class
