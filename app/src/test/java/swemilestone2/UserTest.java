package swemilestone2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.User;

// Testing with only relevant methods (testing getters and setters are omitted)
public class UserTest {
	
	User user = new User("Hassam", "Khaili", "123");
	
	@Test
	void testUser() {
		testFirstName();
		testGenerateCredentials();
	}
	
	@Test
	void testFirstName(){
		assertEquals("Hassam", user.getFirstName());
	}
	
	@Test
	void testGenerateCredentials() {
		assertEquals("Khaili123", user.getPassword());
		assertEquals("Hassam123", user.getUsername());
	}
	
}
