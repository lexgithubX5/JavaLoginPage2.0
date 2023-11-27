package intro_to_programming;
import java.util.HashMap;

public class AWTT {
	public static void main(String [] args) {
	//this runs the IDandPasswords Class which contains the HashMap
	IDandPasswords idandPasswords = new IDandPasswords();
	
	//this runs loginPage
	Project1 loginPage = new Project1(idandPasswords.getLoginInfo());
		
	}
}

