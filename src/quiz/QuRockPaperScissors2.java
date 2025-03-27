package quiz;

import java.util.Random;
import java.util.Scanner;

public class QuRockPaperScissors2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int gameCount = 0;
		
		while(true) {
			//난수 생성
			int com = random.nextInt(10000)%3+1;
			System.out.println("컴퓨터:"+com);
			
			//사용자 입력
			int user = 0;
			System.out.println("가위바위보를 입력하세요");
			System.out.println("가위(1) 바위(2) 보(3)");
			user = scanner.nextInt();
			
			//승부판단
			if(!(user<1 || user>3)) {
				System.out.printf("사용자:%s, 컴퓨터:%d",
						displayRPS(user),displayRPS(com));
				switch(user - com) {
				case 0:
					System.out.println("비겼습니다"); break;
				case 1: case -2:
					System.out.println("이겼습니다"); break;
				case 2: case -1:
					System.out.println("졌습니다"); break;
				
				}
				gameCount++;
			
			}else {
				System.out.println("가위바위보 할 줄 모름? ㅋ");
			}
			
			if(gameCount>=5) {
				System.out.println("게임재시작(1) 종료(0)");
				int restart = scanner.nextInt();
				if(restart==0) {
					break;
				}else {
					System.out.println("게임재시작 ^^");
					gameCount = 0;
				}
			}
		}
	}
	
	public static String displayRPS(int n) {
		String str = "";
		switch(n) {
		case 1: str="가위(1)"; break;
		case 2: str="바위(2)"; break;
		case 3: str="보(3)"; break;
		}
		return str;
	}
}
