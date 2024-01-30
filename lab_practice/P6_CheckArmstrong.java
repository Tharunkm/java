package lab_practice;
import java.util.Scanner;

public class P6_CheckArmstrong {
	public static void main(String args[]) {
		int c,rem,arm=0,num;
		System.out.println("enter number : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		c=num;
		while(num>0)
		{
			rem=num%10;
			arm=(rem*rem*rem)+arm;
			num=num/10;
			
		}
		if(arm==c)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
