package lab_practice;
import java.util.Scanner;

public class P5_FibonacciSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int a=0,n;
		int b=1;
		int sum=0;
		n=sc.nextInt();
		System.out.println("series: ");
		while(sum<=n)
		{
			System.out.print(sum+" ");
			a=b;
			b=sum;
			sum=a+b;
		}

	}

}
