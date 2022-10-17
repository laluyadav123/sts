import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MainClass {
	static Log logger = LogFactory.getLog(MainClass.class );

	public static void main(String[] args) {
		
		UserAuthentication user = new UserAuthentication();
		 logger.info("user is loging in");
       user.loginuser("","hf");
      
	}

}
