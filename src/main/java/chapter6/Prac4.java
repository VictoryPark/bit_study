package chapter6;

public class Prac4 {

	public static void main(String[] args) {
		
		ProfileLinkedList profile = new ProfileLinkedList();
		
		profile.insertNewNode("박아란", "01012345678", "A@naver.com");
		profile.insertNewNode("배현정", "01012341111", "B@naver.com");
		profile.insertNewNode("박혜영", "01012342222", "C@naver.com");
		profile.insertNewNode("김혜림", "01012343333", "D@naver.com");
		
		profile.printNode();
		
		ProfileNode target = profile.searchNode("배현정");
		
		profile.deleteNode(target);
		
		System.out.println("---------------------");
		profile.printNode();
		
		ProfileNode target1 = profile.searchNode("김혜림");
		
		profile.deleteNode(target1);
		
		System.out.println("---------------------");
		profile.printNode();
		
	} //main
	
} // end class
