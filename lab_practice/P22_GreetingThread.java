package lab_practice;

public class P22_GreetingThread extends Thread{
	private String greeting;
	private int delay;
	public P22_GreetingThread(String greeting,int delay) {
		this.greeting=greeting;
		this.delay=delay;
	}
	public void run() {
		while(true) {
			System.out.println(greeting);
			try {
				Thread.sleep(delay*2000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
