package project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DrivingLTest {

	@Test
	void ageverifiSuccessTest() {
		
		DrivingL l= new DrivingL("lalit", 20, 0, 0);
		String actual = l.ageverifi();
		String expected = "test successfull";
		assertEquals(expected, actual);
	}

}
