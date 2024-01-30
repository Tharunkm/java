package lab_practice;

public class P23_OddThread extends Thread {
	public void run() {
		for(int i=1;i<=20;i=i+2) {
			System.out.println(i);
		}
	}
}
