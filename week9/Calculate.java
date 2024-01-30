package week9;
import java.util.Scanner;
public class Calculate {
    public static void main(String[] args) {
    	int x,y;
    	System.out.println("Enter the values of x and y: ");
    	Scanner  sc =new Scanner(System.in);
    	x=sc.nextInt();
    	y=sc.nextInt();
        ArithmeticOperations calculator = new ArithmeticOperations();
        System.out.println("Addition: " + calculator.addition(x, y));
        System.out.println("Subtraction: " + calculator.subtraction(x, y));
        System.out.println("Multiplication: " + calculator.multiplication(x, y));
        System.out.println("Division: " + calculator.division(x, y));
    }
}
