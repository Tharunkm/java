package lab_practice;
import java.util.*;

public class P24_UniqueNumbers { 
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in); 
		 HashSet<Integer> uniqueNumbers = new HashSet<>(); 
		 while (uniqueNumbers.size() < 5) { 
			 System.out.print("Enter a number between 10 and 100: "); 
			 int number = scanner.nextInt(); 
			 if (number >= 10 && number <= 100) { 
				 if (uniqueNumbers.contains(number)) {
					 System.out.println(number + " is a duplicate number."); 
				 } else { 
					 uniqueNumbers.add(number); 
					 System.out.println("Unique values: " + uniqueNumbers); 
					 } 
				 } else { 
					 System.out.println("Invalid number. Enter a number between 10 and 100."); 
				}
		 } 
	 } 
} 