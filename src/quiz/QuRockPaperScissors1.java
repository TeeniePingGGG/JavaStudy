package quiz;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;



public class QuRockPaperScissors1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int gameCount = 0;
		
		while(true) {
			//난수생성
			int com = random.nextInt(10000)%3+1; //1~3사이의 난수
			System.out.println("컴퓨터:"+com);
			
			//사용자 입력
			int user = 0;
			System.out.println("가위바위보를 입력하세요.");
			System.out.println("가위(1) 바위(2) 보(3) => ");
			user = scanner.nextInt();
			
			//승부판단
			if(!(user<1 || user>3)) {
				if(com==1&&user==1)	System.out.print("사용자:가위,컴퓨터:가위\n비겼습니다.\n");
				if(com==1&&user==2) System.out.print("사용자:바위,컴퓨터:가위\n이겼습니다.\n");
				if(com==1&&user==3) System.out.print("사용자:보,컴퓨터:가위\n졌습니다.\n");
				if(com==2&&user==1) System.out.print("사용자:가위,컴퓨터:바위\n졌습니다.\n");
				if(com==2&&user==2) System.out.print("사용자:바위,컴퓨터:바위\n비겼습니다.\n");
				if(com==2&&user==3) System.out.print("사용자:보,컴퓨터:바위\n이겼습니다.\n");
				if(com==3&&user==1) System.out.print("사용자:가위,컴퓨터:보\n이겼습니다.\n");
				if(com==3&&user==2) System.out.print("사용자:바위,컴퓨터:보\n졌습니다.\n");
				if(com==3&&user==3) System.out.print("사용자:보,컴퓨터:보\n비겼습니다.\n");
				
				gameCount++; //게임카운트 증가
			}else {
				System.out.println("가위바위보 할줄 모름? ㅋ");
			}
			
			//게임재시작 여부 확인
			if(gameCount>=5) {
				System.out.println("게임재시작(1) 종료(0)");
				int result = scanner.nextInt();
				
				if(result==0) {
					break;
				}else {
					System.out.println("게임재시작 ^^");
					gameCount=0;
				}
			}
		}
	
	}
}

