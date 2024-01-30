package lab_practice;
import java.util.*;

public class P15_First2Letters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String inputString = sc.nextLine() ;
        String result = repeatFirstTwoLetters(inputString);
        System.out.println(result);
	}

    public static String repeatFirstTwoLetters(String str) {
        if (str.length() >= 2) {
            String firstTwoLetters = str.substring(0, 2);
            int n = str.length();
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < n; i++) {
                result.append(firstTwoLetters);
            }
            return result.toString();
        }
        else {
        	return str;
        }
	}
}