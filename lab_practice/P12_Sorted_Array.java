package lab_practice;

public class P12_Sorted_Array {

	public static void main(String[] args) {
		int[] numbers = {5,3,9,4,6};
		for(int i = 0;i<numbers.length-1;i++)
			for(int j = 0;j <numbers.length-1; j++) 
				if(numbers[j]>numbers[j+1]) {
					int temp = numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1] = temp;
				}	
		System.out.println("Sorted order : ");
		for(int number : numbers) {
			System.out.print(number+" ");
		}		
	}
}
