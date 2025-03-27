package ex12inheritance;

//문제4) QuRingMake.java
//다음 Point클래스를 이용하여 다음 문제를 해결하시오. 
//해당 문제는 상속(Inheritance)을 통해 구현하는것이 아니라
//구성(Composition)관계를 이용하여 해결한다. 
//Point 클래스를 기반으로 원을 의미하는 Circle클래스를 정의하자. 
//그리고 Circle클래스를 기반으로 Ring클래스를 정의하자.


class Point {
	
   	int xDot, yDot;
   	
   	public Point(int x, int y) {
 		xDot=x;
 		yDot=y;
   	}
   	public void showPointInfo() {
         System.out.println("[x좌표:"+xDot+", y좌표"+yDot+"]");
   	}
}

class Circle{	

	int radian;
	Point center;

	public Circle(int radian, int x, int y) {
		this.radian = radian; 
		center = new Point(x, y);
	}
	public void showCircleInfo() {
		center.showPointInfo();
		System.out.println("반지름:"+ this.radian);
	}
}
class Ring{
	Circle innerCircle;
	Circle outerCircle;
	//생성자 
	public Ring(int inX, int inY, int inRad, 
			int outX, int outY, int outRad) {
		
		innerCircle = new Circle(inRad, inX, inY);
		outerCircle = new Circle(outRad, outX, outY);
	}
	public void showRingInfo() {
		System.out.println("안쪽원의 정보:");
		innerCircle.showCircleInfo();
		System.out.println("바깥쪽원의 정보:");
		outerCircle.showCircleInfo();
	}
}

public class QuRingMake {
	public static void main(String[] args) {
		/*
		출력결과]
		안쪽원의 정보 :
		반지름 : 3	
		[x좌표:1, y좌표1]
		바깥쪽원의 정보 :
		반지름 : 9
		[x좌표:2, y좌표2] 
		*/
		Ring c = new Ring(1,1,3,2,2,9);
		c.showRingInfo();
	}
}


