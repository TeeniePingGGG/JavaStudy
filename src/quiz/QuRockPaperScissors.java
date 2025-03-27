package quiz;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

//난수생성기를 이용하여 1, 2, 3중 하나의 숫자를 생성한다.
//사용자가 가위(1),바위(2),보(3) 중 하나를 낸다.
//승부를 판단하여 출력한다.
//1,2,3 이외의 숫자를 입력하면 잘못된 입력을 알려주고 재입력을 요구한다.
//숫자입력을 잘못한 경우는 게임횟수에 포함하지 않는다.
//게임은 5번 진행하고 5번째 게임을 끝내면 다시할지 물어본다. 재시작(1), 종료(0)
//0, 1 이외의 숫자를 입력하면 재입력을 요구해야 한다.

//실행결과]
//무엇을 내겠습니까?(1: 가위, 2:바위, 3:보) : 1
//사용자 : 가위, 컴퓨터 : 보
//이겼습니다.
//
//무엇을 내겠습니까?(1: 가위, 2:바위, 3:보) : 4
//가위바위보 할줄 모르세요? 제대로 내세요^^;
//
//….게임진행...
//
//5번의 게임이 끝났습니다. 게임을 계속하시겠습니까? 재시작(1), 종료(0) : 1
//
//….게임재시작…
//
//5번의 게임이 끝났습니다. 게임을 계속하시겠습니까? 재시작(1), 종료(0) : 0
//게임이 종료되었습니다. 감사합니다.
//
//….게임종료….
//
//5번의 게임이 끝났습니다. 게임을 계속하시겠습니까? 재시작(1), 종료(0) : 5
//잘못입력하셨습니다. 재시작(1), 종료(0)중에 입력하세요.
//

public class QuRockPaperScissors {

	public static void main(String[] args) {
		
		//난수생성 
		Random r = new Random();  
		Scanner scan = new Scanner(System.in);
		
		int user=-1 ,computer=-1;
		
		System.out.print("무엇을 내겠습니까?(1: 가위, 2:바위, 3:보)");
		user = scan.nextInt();
		computer = r.nextInt(3)+1;
		
		if(computer == 1) 
			System.out.println("컴퓨터: 가위");
		else if(computer == 2)
			System.out.println("컴퓨터: 바위");
		else if(computer == 3)
			System.out.println("컴퓨터: 보");
		
		
		// 사용자가 가위
		if(user == 1) {
			if(computer == 1)
				System.out.println("비김");
			else if(computer == 2)
				System.out.println("졌음");
			else
				System.out.println("이김ㅋ");
		}
		
		//사용자가 바위
		else if(user == 2) {
			if(computer == 1)
				System.out.println("이김");
			else if(computer == 2)
				System.out.println("비김");
			else 
				System.out.println("졌음");
			
		}
		
		//사용자가 보
		else if(user == 3){
			if(computer == 1) 
				System.out.println("졌음");
			else if(computer == 2)
				System.out.println("이김");
			else 
				System.out.println("비김");
			
		}
		
		}
	
	}


