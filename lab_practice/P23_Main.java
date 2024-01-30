package lab_practice;

public class P23_Main {

	public static void main(String[] args) {
		P23_EvenNumberThread evenThread = new P23_EvenNumberThread();
		P23_OddThread oddThread = new P23_OddThread();
		evenThread.start();
		try {
			evenThread.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		oddThread.start();
	}
}
