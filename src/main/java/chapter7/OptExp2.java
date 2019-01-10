package chapter7;

public class OptExp2 {

	private String exp;
	
	public int evalPostfix(String postfix) {
		LinkedStack S = new LinkedStack();
		exp = postfix;
		int opr1, opr2, value;
		char testCh;
		
		for(int i=0;i<7;i++) {
			testCh = exp.charAt(i);
			if(testCh != '+' && testCh != '-' && testCh !='*' && testCh != '/') {
				//int = char - char
				value = testCh - '0'; 
				S.push(value);
			} else {
				opr2 = S.pop2();
				opr1 = S.pop2();
				
				//연산하고 나면 다시 스택에 삽입..
				switch(testCh) {
					case '+' : S.push(opr1 + opr2);
								break;
					case '-' : S.push(opr1 - opr2);
								break;
					case '*' : S.push(opr1 * opr2);
								break;
					case '/' : S.push(opr1 / opr2);
								break;
					
				}
			}
		}//for
		
		//스택에 남아있는 것은 최종 연산 결과..
		return S.pop2();
	} //evalPostfix
} //end class
