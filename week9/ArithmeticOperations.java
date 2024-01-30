package week9;
public class ArithmeticOperations {

    public int addition(int x, int y) {
        return x + y;
    }

    public int subtraction(int x, int y) {
        return x - y;
    }

    public int multiplication(int x, int y) {
        return x * y;
    }

    public int division(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
    }
}