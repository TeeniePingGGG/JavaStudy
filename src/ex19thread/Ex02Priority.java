package ex19thread;

/*
 쓰레드의 우선순위
 	setPriority(우선순위): 쓰레드의 우선순위를 지정
 	getPriority(): 지정된 우선순위를 반환
 */
class MessageSendingThread extends Thread{
	String message; 

	public MessageSendingThread(String str) {
		message = str; //생성자1: 이름만 지정
	}
	
	public MessageSendingThread(String str, int pri) {
		message = str;  //생성자2: 이름과 우선순위까지 지정
		setPriority(pri);
	}
	
	public void run() {
		for(int i=0; i<=1000; i++) {
			//멤버변수와 우선순위를 출력
			System.out.println(message + i+"("+getPriority()+")");
			/*
			 기본적으로 우선순위가 높은 쓰레드가 먼저 실행되지만
			 sleep()을 호출하면 실행 준 잠깐씩 블럭상태로 전화되어
			 우선순위가 낮은 쓰레드도 실행될 기회가 생긴다.
			 */
			try {
				sleep(1);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
}
public class Ex02Priority {

	public static void main(String[] args) {
		/*
		 1단계 실행
		 : 우선순위를 부여하지 않은 상태로 쓰레드를 생성한다.
		  이때는 우선순위 5를 부여받게 된다. 모든 우선순위가 동일하므로
		  CPU가 작업을 분배한다
		 */
//		MessageSendingThread tr1= new MessageSendingThread("첫번쨰");
//		MessageSendingThread tr2= new MessageSendingThread("두번쨰");
//		MessageSendingThread tr3 = new MessageSendingThread("세번쨰");
//		
		MessageSendingThread tr1= new MessageSendingThread("첫번쨰",Thread.MAX_PRIORITY);
		MessageSendingThread tr2= new MessageSendingThread("두번쨰",Thread.NORM_PRIORITY);
		MessageSendingThread tr3 = new MessageSendingThread("세번쨰",Thread.MIN_PRIORITY);
		
		tr1.start();
		tr2.start();
		tr3.start();
	}

}
