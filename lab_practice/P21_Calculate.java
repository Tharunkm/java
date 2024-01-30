package lab_practice;
import java.util.Scanner;
import lab_practice.P21_ArthmeticOperations;

public class P21_Calculate {

	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter the values of a and b: ");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		P21_ArthmeticOperations ao = new P21_ArthmeticOperations();
		System.out.println("Addition : "+ao.addition(a, b));
		System.out.println("Substraction: "+ao.substraction(a, b));
		System.out.println("Multiplaction: "+ao.multiplaction(a,b));
		System.out.println("Division: "+ao.division(a, b));
	}
}
