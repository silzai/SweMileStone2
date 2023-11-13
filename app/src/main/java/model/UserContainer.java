package model;

import java.util.ArrayList;
import java.util.List;

public class UserContainer {
	private static List<User> Users = new ArrayList<User>();

	public static void addUser(User user) {
		if (user!=null)
			Users.add(user);
	}
	
	public static User find(String username) {
		for (User user : Users) 
			if(user.getUsername().equals(username))
				return user;
		
		return null;
	}
	
	public static User login(String username, String password) {
		User tempUser = find(username);
		if (tempUser!=null && tempUser.isValid(username, password))
		{
			tempUser.login();
			return tempUser;
		}
		return null;
	}
	public static void logout(User user) {
		if(user.isLogged())
			user.logout();
	}
}
