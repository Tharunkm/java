package lab_practice;
import java.util.Scanner;
import java.io.*;

 public class P2_Factorial {

	public static void main(String[] args) {
		int a,result=1;
		System.out.println("Enter a  number : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		for( a=a ; a>0 ; a--)
			result *= a;
		
		System.out.println(result);

	}
 }


