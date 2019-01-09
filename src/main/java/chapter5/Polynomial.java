package chapter5;

public class Polynomial {

	private int degree;
	private float coef[] = new float[20];
	
	Polynomial(int degree, float coef[]) {
		this.degree = degree;
		this.coef = coef;
	} //생성자1
	
	Polynomial(int degree){
		this.degree = degree;
		for(int i=0;i<=degree;i++) {
			this.coef[i] = 0;
		}
	} // 생성자2

	public int getDegree() {
		return degree;
	}

	public float getCoef(int i) {
		return coef[i];
	}

	public void setCoef(int i, float coef) {
		this.coef[i] = coef;
	}
	
	public void printPoly() {
		int temp = this.degree;
		for(int i=0; i<this.degree; i++) {
			//%3.0f 면 float값을 나타낼때 3.0 만큼 빈칸이 float 값 앞에 생긴다.
			System.out.printf("%3.0fx^%d", this.coef[i], temp--);
		}
		
		System.out.println();
	}
	
} // end class
