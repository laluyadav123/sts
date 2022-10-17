import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class UserAuthentication {
	
	public String loginuser(String username ,String password) {
		Log logger = LogFactory.getLog(UserAuthentication.class );
		if(username.isBlank()) {
			logger.error("user is blank");
			throw new RuntimeException("user invalid");
		}
		return "Successfully Logged In";
	}

}
