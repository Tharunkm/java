package lab_practice;
import java.util.*;

public class P13_Char_Check {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch = sc.next().charAt(0);
		if((ch>='a' && ch<='z')||(ch>='A'&&ch<='Z'))
			System.out.println("Alpha");
		else if(ch>='0'&&ch<='9')
			System.out.println("dig");
		else
			System.out.println("sp");

	}

}
