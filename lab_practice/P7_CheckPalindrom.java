 package lab_practice;
import java.util.*;

public class P7_CheckPalindrom {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number : ");
		int n = sc.nextInt();
		int n1=n;
		int s=0;
		while(n>0)
		{
			int d =n%10;
			s = s*10+d;
			n = n/10;
		}
		if(n1==s)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
