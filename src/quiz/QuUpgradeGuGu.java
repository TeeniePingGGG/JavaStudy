package quiz;

//실행결과]
//2 x 1 = 2
//2 X 2 = 4
//2 X 2 X 2 = 8
//2 X 2 X 2 X 2 = 16
//2 X 2 X 2 X 2 X 2 = 32
//2 X 2 X 2 X 2 X 2 X 2 = 64
//2 X 2 X 2 X 2 X 2 X 2 X 2 = 128
//2 X 2 X 2 X 2 X 2 X 2 X 2 X 2 = 256
//2 X 2 X 2 X 2 X 2 X 2 X 2 X 2 X 2 = 512
//3 X 1 = 3
//3 X 3 = 9
//3 X 3 X 3= 27
//………중간 생략………
//9 X 9 X 9 X 9 X 9 X 9 X 9 X 9 = 43046721
//9 X 9 X 9 X 9 X 9 X 9 X 9 X 9 X 9 = 3874204892



public class QuUpgradeGuGu {

	public static void main(String[] args) {
		
		int result;
		
		for(int x=2; x<10; x++) {
			result = x*1;
			System.out.printf("%d x 1=%d\n",x,result);
			
			for(int y=2; y<10; y++) {
				result = x;
				System.out.printf("%d",x);
				
				for(int z=2; z<=y; z++) {
					
					result *= x;
					System.out.printf("X %d",x);
					
				}
				System.out.printf("=%d",result);
				System.out.println();
			}
		}
	}

}
