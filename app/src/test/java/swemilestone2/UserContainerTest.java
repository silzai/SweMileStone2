package swemilestone2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.User;
import model.UserContainer;

class UserContainerTest {

	User user = new User("ahmed", "ali", "1");
	
	@Test
	void testLoginNotNull() {
		assertNotNull(UserContainer.login(user.getUsername(), user.getPassword()));
	}
	
	@Test 
	void testLoginNull() {
		assertNull(UserContainer.login(null, null));
	}

	@Test
	void testFind() {
		assertNotNull(UserContainer.find(user.getUsername()));
	}
	
	@Test
	void testFindNull() {
		assertNull(UserContainer.find(null));
	}
	
}

