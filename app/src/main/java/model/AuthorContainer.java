package model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AuthorContainer {
	public static List<Author> Authors = new ArrayList<>();

	public static void addUser(User user) {
		if (user!=null)
			Authors.add((Author) user);
	}
	
	public static User find(String username) throws IOException {
		
		if (Authors == null || Authors.size() == 0) {
			DataBuffer.loadAuthors();
			Authors = DataBuffer.authors;
		}
		
		for (User user : Authors) 
			if(user.getUsername().equals(username))
				return user;
		
		return null;
	}
	
	public static User login(String username, String password) throws IOException {
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

