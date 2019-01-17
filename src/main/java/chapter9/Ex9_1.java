package chapter9;

public class Ex9_1 {

	public static void main(String[] args) {
		LinkedTree T = new LinkedTree();
		
		//제일 아래 레벨에 잇는 노드들
		TreeNode n7 = T.makeBT(null, 'D', null);
		TreeNode n6 = T.makeBT(null, 'C', null);
		TreeNode n5 = T.makeBT(null, 'B', null);
		TreeNode n4 = T.makeBT(null, 'A', null);
		
		// 두번째 레벨
		TreeNode n3 = T.makeBT(n6, '/', n7);
		TreeNode n2 = T.makeBT(n4, '*', n5);
		
		// 첫번째 레벨
		TreeNode n1 = T.makeBT(n2, '-', n3);
		
		System.out.printf("\n Preorder : ");
		T.preorder(n1);
		
		System.out.printf("\n Inorder : ");
		T.inorder(n1);
		
		System.out.printf("\n Postorder : ");
		T.postorder(n1);
		
	} //main
} //end class
