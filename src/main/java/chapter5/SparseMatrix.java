package chapter5;

public class SparseMatrix {
	//행 개수
	private int rownum;
	//열 개수
	private int colnum;
	// 0이 아닌 원소의 개수
	private int valnum;
	//2차원 배열
	private int[][] matrix;
	
	SparseMatrix(int[][] matrix){
		this.matrix = matrix;
		this.valnum = matrix[0][2];
		this.rownum = valnum+1;
		this.colnum = 3;
		printMatrix();
	} //생성자
	
	public int getRownum() {
		return rownum;
	}

	public int getColnum() {
		return colnum;
	}

	public int getValnum() {
		return valnum;
	}

	public int[][] getMatrix() {
		return matrix;
	}

//	public void setMatrixValue(int rowIndex, int colIndex, int val) {
//		this.matrix[rowIndex][colIndex] = val;
//	}
	
	public void printMatrix() {
		for(int i=0;i<rownum;i++) {
			System.out.print("| ");
			for(int j=0;j<colnum;j++) {
//				System.out.println("i :" +i);
//				System.out.println("j :" +j);
				System.out.printf(" %d ", matrix[i][j]);
			}
			System.out.println(" |");
		}
		
	} //print
	
	
	
} //end class

