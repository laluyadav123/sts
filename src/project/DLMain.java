package project;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DLMain {
	static Log logger = LogFactory.getLog(DLMain.class );

	public static void main(String[] args) {
		
		
		DrivingL dl = new DrivingL("Rahul",17, 0, 0);
		
	try {
		

		dl.checkall();
		

		System.out.println(dl);
	} catch (Exception e) {
		logger.error("error occure while allping driving licence for "+dl.getName());
		

	}
		
		DrivingL dl1 = new DrivingL("Lalit",20, 0, 0);
		
		try {
		
	
		dl1.checkall();
		System.out.println(dl1);
		} catch (Exception e) {
			logger.error("error occure while allping driving licence for "+dl1.getName());
			

		}
		
	
			
		
		DrivingL dl2 = new DrivingL("Akarsh",18, 1, 0);
		
		try {
		dl2.checkall();
		System.out.println(dl2);
		} catch (Exception e) {
			logger.error("error occure while allping driving licence for "+dl2.getName());
			

		}
		
		
		DrivingL dl3 = new DrivingL("Lalu",34, 0, 1);
		try {
		
	
		dl3.checkall();
		System.out.println(dl3);
		} catch (Exception e) {
			logger.error("error occure while allping driving licence for "+dl3.getName());
			

		}
		
		
		DrivingL dl4 = new DrivingL("Aryan",24, 0, 0);
		
		try {
		System.out.println(dl4);
		} catch (Exception e) {
			logger.error("error occure while allping driving licence for "+dl4.getName());
			

		}

		
		
		

	}

}
