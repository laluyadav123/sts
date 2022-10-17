package project;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DrivingL {

	Log logger = LogFactory.getLog(DrivingL.class);
	private String name;
	private int age;
	private int policeVerificatin;
	private int mediCheck;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPoliceVerificatin() {
		return policeVerificatin;
	}

	public void setPoliceVerificatin(int policeVerificatin) {
		this.policeVerificatin = policeVerificatin;
	}

	public int getMediCheck() {
		return mediCheck;
	}

	public void setMediCheck(int mediCheck) {
		this.mediCheck = mediCheck;
	}

	public DrivingL(String name, int age, int policeVerificatin, int mediCheck) {
		super();
		this.name = name;
		this.age = age;
		this.policeVerificatin = policeVerificatin;
		this.mediCheck = mediCheck;
	}

	@Override
	public String toString() {
		return "DrivingL [name=" + name + ", age=" + age + ", policeVerificatin=" + policeVerificatin + ", mediCheck="
				+ mediCheck + "]";
	}

	public String ageverifi() {

		if (age > 18) {
			System.out.println("you are eligible for DL");

		} else {
			System.out.println("you are not eligible for DL");
			logger.info("your age not 18");
			throw new RuntimeException("your are not eligible");
		}
		return "test successfull";
	}

	public void policeVarifi() {

		if (policeVerificatin == 0) {
			System.out.println("police verification done");
		} else {
			System.out.println("you are not verified");
			logger.info("your age not verified");
			throw new RuntimeException("your are not eligible");
		}

	}

	public void medicalCheck() {

		if (mediCheck == 0) {
			System.out.println("medi chack done");
		} else {
			System.out.println("you are not fit for DL");

			logger.info("your are not fit");
			throw new RuntimeException("your are not eligible");
		}

	}

	public void checkall() {
		ageverifi();
		policeVarifi();
		medicalCheck();
		DlDatabase dl = new DlDatabase();
		dl.saveData(this.name,this.age);
	}
	
	
	
	
	
	
	
	

}
