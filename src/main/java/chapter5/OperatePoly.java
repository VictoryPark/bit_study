package chapter5;

public class OperatePoly {

	private int degreeA = 0;
	private int degreeB = 0;
	private int degreeC = 0;
	private int indexA = 0;
	private int indexB = 0;
	private int indexC = 0;
	private int expoA;
	private int expoB;
	private float coefA;
	private float coefB;
	private float coefC;
	
	public Polynomial addPoly(Polynomial A, Polynomial B) {
		degreeA = A.getDegree();
		degreeB = B.getDegree();
		
		//degreeA = 3, degreeB = 4
		expoA = degreeA;
		expoB = degreeB;
		
		//A 와 B의 차수를 비교하여서 큰 차수를 C의 차수로 설정한다.
		if(degreeA >= degreeB) {
			degreeC = degreeA;
		} else {
			degreeC = degreeB;
		}
		
		Polynomial C = new Polynomial(degreeC);
		
		//index 에 ++값을 줘서 차수보다 높아지면 while문을 멈춘다.
		while(indexA <= degreeA && indexB <= degreeB) {
			
			//while문 도는동안 A의 차수(--하기 때문에 줄어듬)와 B의 차수를 비교한다.
			//A와 B를 더해서 만들어지는 C 라는 다항식을 만든다.
			if(expoA > expoB) {
				C.setCoef(indexC++, A.getCoef(indexA++));
				expoA--;
			} else if(expoA == expoB) {
				C.setCoef(indexC++, A.getCoef(indexA++)+B.getCoef(indexB++));
				expoA--;
				expoB--;
			} else {
				C.setCoef(indexC++, B.getCoef(indexB++));
				expoB--;
			}
		} //while
		return C;
	}
} //end class
