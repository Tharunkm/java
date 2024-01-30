package lab_practice;
import java.util.Scanner;

public class P9_GCD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 numbers : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int gcd = findGCD(n1,n2);
		System.out.println("Gcd : "+gcd);
	}
	public static int findGCD(int num1,int num2) {
		if(num2==0) {
			return num1;
		}
		else {
			return findGCD(num2,num1%num2);
		}
	}

}
