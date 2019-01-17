package chapter9;

public class BinarySearchTree {

	private TreeNode root = new TreeNode();
	
	public TreeNode insertKey(TreeNode root, char x) {
		TreeNode p = root;
		TreeNode newNode = new TreeNode();
		newNode.dataChar = x;
		newNode.left = null;
		newNode.right = null;
		
		if(p == null) {	//루트 노드가 없었으면 newNode가 새로 루트노드가 된다.
			return newNode; 
		} else if(newNode.dataChar < p.dataChar) {	//루트노드보다 작으면 왼쪽 서브트리로 ㄱ
			p.left = insertKey(p.left, x);
			return p;
		} else if(newNode.dataChar > p.dataChar) {	//루트노드보다 크면 오른쪽 서브트리로 ㄱ
			p.right = insertKey(p.right, x);
			return p;
		} else {	//newNode 와 root 가 같으면 p를 return..
			return p;
		}
		
	} //insertKey
	
	public void insertBST(char x) {
		//System.out.println("root : " +root);
		root = insertKey(root, x);
	} // insertBST
	
	public TreeNode searchBST(char x) {
		TreeNode p = root;
		while(p != null) {
			if(x < p.dataChar) {
				p = p.left;
			} else if(x > p.dataChar) {
				p = p.right;
			} else return p;
		}
		return p;
	} //searchBST
	
	public void inorder(TreeNode root) {
		if(root != null) {
			inorder(root.left);
			System.out.printf(" %c", root.dataChar);
			inorder(root.right);
		}
	} //inorder
	
	public void printBST() {
		inorder(root);
		System.out.println();
	}
} //end class
