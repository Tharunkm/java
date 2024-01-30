package lab_practice;
import java.util.Scanner;

public class P10_Factorial {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		long factorial = calculateFactorial(num);
		System.out.println(factorial);
	}
	public static long calculateFactorial(int n) {
		if(n==0||n==1) {
			return 1;
		}
		else {
			return n*calculateFactorial(n-1);
		}
	}

}
