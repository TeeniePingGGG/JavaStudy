package test250320;

//Animal 클래스정의 
//동물의 일반적인 특성을 표현하는 클래스를 정의하시오.
//멤버변수 : 
//	동물의 종류(포유류, 어류, 조류 등)->species
//	나이->age
//	성별->gender
//멤버메소드 : 
//	showAnimal() : 멤버변수를 출력하는 용도
//인자생성자 : 
//	멤버변수 3개 모두를 초기화할수 있도록 정의

//클래스 생성
public class Animal {
	
	//멤버 변수 생성(species, age, gender)(속성)
	String species; 
	int age;
	String gender;
	
	//생성자
	public Animal(String species, int age, String gender) {
		//객체 생성시 초기화될 값들 작성
		super();
		this.species = species;
		this.age = age;
		this.gender = gender;
	}
	
	//동작
	public void showAnimal() {
		System.out.println("동물의 종류:"+species);
		System.out.println("나이:"+age);
		System.out.println("성별"+gender);
	}
	
	
}
