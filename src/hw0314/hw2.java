package hw0314;

public class hw2 {

	public static void main(String[] args) {
		//while문으로 밑의 출력결과 출력
		/*
		 출력결과]
		 *
		 **
		 ***
		 ****
		 *****
		 
		풀이]
		행 5개 출력 -> i
		열 5개 출력 -> j
		규칙]
		1행 1
		2행 2
		3행 3
		4행 4
		5행 5
		i는 1부터 5까지 반복하며 증가
		j는 1부터 i까지 출력
		 */
		int i =1;
		int j= 1;
		while(i<=5) {
			while(j<=i) {
				System.out.print("*");
			}
			 i++;
		}
		
	}

}
