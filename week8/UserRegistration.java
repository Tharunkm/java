package week8;
public class UserRegistration {
    void registerUser(String userName, String userCountry) throws InvalidCountryException {
        if (!userCountry.equals("India")) {
            throw new InvalidCountryException("User outside India cannot be registered");
        } else {
            System.out.println("User registration done successfully");
        }
    }

    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();

        try {
            userRegistration.registerUser("Tharun", "India");
        } catch (InvalidCountryException f) {
            System.out.println("Exception: " + f.getMessage());
        }
        try {
        	userRegistration.registerUser("Peater", "Germony");
        } catch (InvalidCountryException e) {
        	System.out.println("Exception: "+ e.getMessage());
        }
        
    }
}
