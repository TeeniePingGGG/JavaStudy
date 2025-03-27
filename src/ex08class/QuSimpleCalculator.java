package ex08class;

//문제1) 파일명 : QuSimpleCalculator.java (난이도:하)
//기본 4칙연산을 할때마다 연산의 결과와 몇번 수행되었는지를 출력하는 
//계산기 클래스를 정의해보자.
//아래 main함수에 부합하는 CalculatorEx 클래스를 정의하면되고 
//해당 수치는 임의로 바꿔도 된다.
//init() 멤버메소드에서는 계산의 결과를 카운트하는 멤버변수를 0으로 초기화 한다.

class CalculatorEx{
	//멤버변수 : 연산의 횟수 카운트
	int addCount;
	int minCount;
	int mulCount;
	int divCount;
	
	//다폴트 생성자
	public CalculatorEx() {}
	
	//초기화 메서드
	void init() {
		addCount = 0;
		minCount = 0;
		mulCount = 0;
		divCount = 0;
	}
	
	//덧셈연산
	double add(double n1, double n2) {
		addCount++; //연산횟수 1증가
		return n1+n2;
	}
	
	double min(double n1, double n2) {
		minCount++;
		return n1-n2;
	}
	
	double mul(double n1, double n2) {
		mulCount++;
		return n1*n2;
	}
	
	double div(double n1, double n2) {
		divCount++;
		return n1/n2;
	}
	
	void showOpCount() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n덧셈횟수:"+addCount);
		sb.append("\n뺄셈횟수:"+minCount);
		sb.append("\n곱셈횟수:"+mulCount);
		sb.append("\n나눗셈 횟수:"+divCount);
	}
}


public class QuSimpleCalculator {

	public static void main(String[] args){
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1.1 + 2.1 = " +  cal.add(1.1 , 2.1));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();
	}


}
