package PentaSecurity;

public class Test {

	private static int lo, maxLen;
	
	public static void main(String[] args) {
		A("안안녕하세요ㅋㅋㅋㅋ");
	}
	
	public static String A(String s) {
		int len = s.length();
		if(len<2) return s;
		
		for(int i=0;i<len-1;i++) {
			B(s,i,i);
			B(s,i,i+1);
		}
		System.out.println(s.substring(lo, lo+maxLen));
		return s.substring(lo, lo+maxLen);
	} //A
	
	public static void B(String s, int j, int k) {
		while(j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
			j--;
			k++;
		}
		if(maxLen < k-j-1) {
			lo = j+1;
			maxLen = k-j-1;
		}
	} //B
} //end class
