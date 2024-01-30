package lab_practice;
import java.util.*;

public class P30_ArratList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		 ArrayList<Integer> arrayList= new ArrayList<Integer>(); 
		 System.out.println("Enter ArrayList length: "); 
		 int num=sc.nextInt(); 
		 for(int i=1;i<=num;i++){ 
			 arrayList.add(i); 
		 } 
		 System.out.println("ArrayList printing by using Iterator: "); 
		 Iterator<Integer> itr = arrayList.iterator(); 
		 while(itr.hasNext()){ 
		 System.out.println(itr.next()); 
		 }
	}
}