package coding_test;

import java.util.Arrays;

public class EstSoft_3 {

	static String[] B= {"..X...", "......", "....X.", ".X....", "..X.X.", "...O.."};
 	public static void main(String[] args) {
		solution(B);
	}
	
	public static void solution(String[] B) {
		String[][] board = new String[B.length][B.length];
		
		//자파(O)가 있는 row, column 인덱스 저장할 변수..
		int jRow = 0;
		int jCol = 0;
		
		//2차원 배열 만들기..
		for(int i=0; i<B.length; i++) {
			for(int j=0; j<B.length; j++) {
				board[i][j] = String.valueOf(B[i].charAt(j));
				if(String.valueOf(B[i].charAt(j)).equalsIgnoreCase("O")) {
					jRow = i;
					jCol = j;
				}
			} // 열 for
		} // 행 for
		//System.out.println(Arrays.deepToString(board));
		
		
	} //end solution
} //end class
