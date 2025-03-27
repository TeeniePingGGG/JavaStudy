package hw0314;

public class hw1 {

	public static void main(String[] args) {
		
		/*
		 1. 1~100까지의 범위 
		 2. 3의 배수 || 7의 배수 
		 -> 조건) 3과 7의 공배수인경우 합에서 제외 (21의 배수)
		 */
		
		//while
		int sum =0;
		int i = 1;
		while(i<=100) {
			if((i%3==0 || i%7==0)&& i%21!=0) {
				System.out.println("i는"+i);
				sum += i;
			}
			i++;
		}System.out.println("합은 "+sum);
		
		//do~while
		int sum1 = 0;
		int i1 = 1;
		
		do {
			if((i1%3==0 || i1%7==0)&& i1%21!=0) {
				System.out.println("i는"+i1);
				sum1+=i1;
			}
			i1++;
		}
		while(i1<=100);
		System.out.println("합은"+sum1);
		
		//for문
		int sum2=0;
		for(int i2=1; i2<=100; i2++) {
			if((i2%3==0 || i2%7==0)&& i2%21!=0) {
				System.out.println("i는"+i2);
				sum2 += i2;
			}
			
		}System.out.println("합은"+sum2);

	}

}
