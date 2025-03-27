package ex12inheritance;

//동물의 일반적인 특성을 표현하는 클래스를 정의하시오.
//멤버변수 : 
//	동물의 종류(포유류, 어류, 조류 등)->species
//	나이->age
//	성별->gender
//멤버메소드 : 
//	showAnimal() : 멤버변수를 출력하는 용도
//인자생성자 : 
//	멤버변수 3개 모두를 초기화할수 있도록 정의

//
//public class Animal {
//	
//	//private String species;
//	public String species ;
//	public int age;
//	public String gender;
//	
//	public Animal(String species, int age, String gender) {
//		
//		this.species = species;
//		this.age = age;
//		this.gender = gender;
//	}
//	
//	public void showAnimal() {
//		System.out.println("종류:"+species);
//		System.out.println("나이:"+age);
//		System.out.println("성별:"+gender);
//	}
//	
//
//

public class Animal {
	 
	//멤버변수
	//public String species; //종
	private String species; 
	public int age; //나이
	public String gender; //성별
	
	//현재상태 
	public void showAnimal() {
		System.out.println("동물의 종류는:"+ species);
		System.out.println("나이는:"+ age);
		System.out.println("성별은:"+ gender);
	}
	
	//생성자 
	public Animal(String species, int age, String gender) {
		this.species = species;
		this.age = age;
		this.gender = gender;
	}
	
	/*
	getter메서드 
		: private으로 선언된 멤버변수를 클래스 외부로 반환할때 
		사용하는 메서드
		setter: 값을 설정할떄 사용
	 */
	public String getSpecies() {
		return species;
	}
	
	
		
}

