package lab_practice;
import java.util.*;

public class P28_HashMap {
	public static void main(String[] args) {
		Map<String,Integer>studentAges=new HashMap<>();
		studentAges.put("Alice", 20);
		studentAges.put("Bob", 22);
		studentAges.put("Charlie", 21);
		System.out.println("Student ages: "+studentAges);
	}
}
