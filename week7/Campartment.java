package week7;
import java.util.Random;
abstract class Compartment {
    public abstract String notice();
}
class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "First Class compartment - Enjoy the luxury!";
    }
}
class Ladies extends Compartment {
    @Override
    public String notice() {
        return "Ladies compartment - Priority for women passengers.";
    }
}
class General extends Compartment {
    @Override
    public String notice() {
        return "General compartment - Standard seating for all.";
    }
}
class Luggage extends Compartment {
    @Override
    public String notice() {
        return "Luggage compartment - Store your belongings securely.";
    }
}


