package businesslogic;
import java.util.regex.*;

public class RegistrationValidation{
	public boolean checkUserDetails(String email, String password, String confirmPassword) {
		validPassword(password,confirmPassword);
		validEmail(email);
		return true;
	}
	
	// for checking the password
	
	private boolean validPassword(String password, String confirmPassword) {
		if(password==confirmPassword) {
			Pattern pattern=Pattern.compile("^[(A-B){1,}+(a-b){1,}+[1-9]{1,}]{8,20}$");
			Matcher match=pattern.matcher(password);
			return match.find();
		}
		else 
			return false;
	}
	// for checking the mail
	private boolean validEmail(String email) {
		Pattern pattern=Pattern.compile(" ^[A-Za-z0-9+_.-]+@(.+)$");
		Matcher match=pattern.matcher(email);
		return match.find();
	}
}