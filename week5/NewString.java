package week5;
import java.util.Scanner;
public class NewString {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		str.substring(0,2);
		String result = str.substring(0,2);
		System.out.println(result+" "+result);
	}
}
