package chapter5;

public class TransposeMatrix {

	private int rownum;
	private int colnum;
	private int valnum;
	private int[][] matrix;
	
	
	TransposeMatrix(SparseMatrix SM){
		this.rownum = SM.getColnum();
		this.colnum = SM.getRownum();
		this.valnum = SM.getValnum();
		System.out.println("rownumB: "+rownum);
		System.out.println("colnumB: "+colnum);
		this.matrix = new int[rownum][colnum];
		
		matrix[0][0] = SM.getMatrix()[0][0];
		matrix[1][0] = SM.getMatrix()[0][1];
		matrix[2][0] = SM.getMatrix()[0][2];
		//printMatrix();
	}

	public void setMatrixValue(int rowIndex, int colIndex, int val) {
		this.matrix[rowIndex][colIndex] = val;
	}
	
	public void printMatrix() {
		for(int i=0;i<rownum;i++) {
			System.out.print("| ");
			for(int j=0;j<colnum;j++) {
				System.out.printf(" %d ", matrix[i][j]);
			}
			System.out.println(" |");
		}
		
	} //print

} //end class
