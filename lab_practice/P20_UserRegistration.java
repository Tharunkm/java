package lab_practice;

public class P20_UserRegistration
{
	static void registerUser(String userName,String userCountry)throws P20_InvalidCountry{
		if(!userCountry.equals("India")) {
			throw new P20_InvalidCountry("User out of india");
		}
		else {
			System.out.println("User registered");
		}
	}
	public static void main(String args[]) {
		P20_UserRegistration userRegister = new P20_UserRegistration();
		try {
			P20_UserRegistration.registerUser("Tharun","India");
		}catch(P20_InvalidCountry f){
			System.out.println("Excetion:  "+f.getMessage());
		}
	}

}
