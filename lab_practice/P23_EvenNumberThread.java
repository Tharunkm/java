package lab_practice;

public class P23_EvenNumberThread extends Thread{
	public void run() {
		for(int i=2;i<=20;i=i+2) {
			System.out.println(i);
		}
	}
}
