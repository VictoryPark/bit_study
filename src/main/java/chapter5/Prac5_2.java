package chapter5;

public class Prac5_2 {

	public static void main(String[] args) {
		
		int[][] A = new int[][] {{7,4,4},{0,3,9},{1,1,1},
								{3,2,7},{5,0,3}};
								
		SparseMatrix matrixA = new SparseMatrix(A);
		
		OperateMatrix opt = new OperateMatrix();
		TransposeMatrix B = opt.TransposeSM(matrixA);
		
		B.printMatrix();
		
	} //main
} //end class
