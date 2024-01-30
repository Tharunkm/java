package lab_practice;
import java.util.Scanner;
import java.io.*;

public class P1_Max_Of_3 {
	public static void main(String args[]) {
		int a,b,c;
		System.out.println("Enter 3 numbers : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a>b && a>c)
			System.out.println(a);
		else if(b>c && b>a)
			System.out.println(b);
		else
			System.out.println(c);
	}

}
