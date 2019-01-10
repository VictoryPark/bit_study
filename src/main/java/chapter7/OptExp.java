package chapter7;

public class OptExp {

	private String exp;
	private int expSize;
	private char testCh, openPair;
	
	//수식에서 괄호의 짝이 맞는 판단하는 메소드..
	public boolean testPair(String exp) {
		this.exp = exp;
		LinkedStack S = new LinkedStack();
		expSize = this.exp.length();
		
		for(int i = 0; i<expSize; i++) {
			testCh = this.exp.charAt(i);
			switch(testCh) {
				case '(' :
				case '{' :
				case '[' :
					//열린 부호일때는 스택에 push  한다..
					S.push(testCh); 
					 break;
				case ')' :
				case '}' :
				case ']' :
					//닫힌 부호일때는 여러 조건으로 맞춰본다..
					if(S.isEmpty()) {
						//닫힌 부호가 있는데 스택은 비어있으면 false..짝이 안맞는것.. 
						return false;
					} else {
						openPair = S.pop();
						//pop한 char 가 짝이 맞는지 확인..
						if((openPair == '(' && testCh !=')') || 
						   (openPair == '{' && testCh !='}') ||
						   (openPair == '[' && testCh !=']')) {
							return false;
						} else {
							//저 조건이 아닐 경우에는 그냥 break???
							break;
						} //if-else
					} //if-else
					
			} //switch
		} //for
		if(S.isEmpty()) {
			return true;
		} else {
			return false;
		}
	} //testPair
	
	//중위 표기식을 후위 표기 식으로 바꾸는 메소드!!
	public char[] toPostfix(String infix) {
		char testCh;
		exp = infix;
		int expSize = 10;
		int j = 0;
		char postfix[] = new char[expSize];
		LinkedStack S = new LinkedStack();
		
		for(int i=0; i<=expSize; i++) {
			testCh = this.exp.charAt(i);
			switch(testCh) {
				case '0' :
				case '1' :
				case '2' :
				case '3' :
				case '4' :
				case '5' :
				case '6' :
				case '7' :
				case '8' :
				case '9' :
					postfix[j++] = testCh;
					break;
				case '+' :
				case '-' :
				case '*' :
				case '/' :
					S.push(testCh);
					break;
				case ')' :
					postfix[j++] = S.pop();
					break;
				default :
			} //switch
		} //for
		postfix[j] = S.pop();
		return postfix;
	} //toPostfix
	
} //end class
