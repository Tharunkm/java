package lab_practice;
import java.util.Scanner;

public class P16_EvenOddString {
	
	public static void main(String[] args) {
			System.out.println("Enter a string:");
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			
			String stri = getFirstHalf(str);
			System.out.println(stri);
		}

	private static String getFirstHalf(String str) {
			if(str.length()%2==0) {
				return str.substring(0,str.length()/2);
			}
			else {
				return null;
			}
	}	
}


