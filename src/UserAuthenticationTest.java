import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserAuthenticationTest {
	
	
	UserAuthentication ua;
	@BeforeEach
	void objectCreation() {
		
		ua= new UserAuthentication();
	}
	
	@AfterEach
	void afterEach() {
		
		System.out.println("inside after each");
	}
	
	@BeforeAll
	static void beforeAll() {
		
		System.out.println("inside before all");
	}

	@AfterAll
	static void afterAll() {
		
		System.out.println("inside after all");
	}
	@Test
	void loginUserSuccessTest() {
		String actual = ua.loginuser("Akarsh", "Akarsh009");
		String expected = "Successfully Logged In";
		assertEquals(expected, actual);
	}
	
	void loginUserFailureTest() {
		assertThrows(RuntimeException.class,()->ua.loginuser("", "Akarsh009"));
	}
}
