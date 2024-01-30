package lab_practice;
import java.util.Scanner;

public class P10_MinMaxArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in array : ");
		int n = sc.nextInt();
		int[]arr=new int[n];
		System.out.println("Enter elements of array : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		if(n==0) {
			System.out.println("Array is empty");
			return;
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("max: "+max+" , min: "+min);
	}
}
