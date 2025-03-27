package ex15usefulclass;



class MyFriends extends Object{
	String myName;

	public MyFriends(String name) {
		super();
		myName = name;
	}
	@Override
	public String toString() {
		return "이름:"+myName;
	}
 }
//toString() 메서드를 오버라이딩 하지않음
	class YourFriends extends Object{
		String myName;

		public YourFriends(String name) {
			super();
			myName = name;
		}
}

public class E04Object1toString {

	public static void main(String[] args) {
		
		MyFriends fnd1 = new MyFriends("성유겸");
		YourFriends fnd2 = new YourFriends("헬로비너스");
		
		/*
		 toString 메서드
		 - object에 정의된 메서드로 print()문이 문자열을 출력하기 전에
		 자동으로 호출한다.
		 - 인스턴스 변수를 문자열러 변환하여 반환한다
		 - 필요한 경우 클래스 정의시 적절히 오버라이딩하여 재정의하는것이
		 좋다. 단 필수사항은 아니다.
		 */
		//toString()을 오버라이딩 했으므로 이름이 출력됨
		System.out.println(fnd1);
		//인스턴스의 참조값이 출력된다.
		System.out.println(fnd2);
	}
}

class MyTest{
	int a;
	String b;
	boolean c;
	//멤버변수 정의 후 자동생성 메뉴를 통해 toString 메서드 정의하기
	@Override
	public String toString() {
		return "MyTest [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
}
