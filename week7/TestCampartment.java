package week7;
import java.util.Random;
public class TestCampartment{
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        Random random = new Random();
        for (int i = 0; i < compartments.length; i++) {
        	
            int compartmentType = random.nextInt(4) + 1
            		;

            switch (compartmentType) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        }

        for (Compartment compartment : compartments) {
            System.out.println(compartment.notice());
        }
    }
}