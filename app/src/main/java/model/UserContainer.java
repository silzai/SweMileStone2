package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class UserContainer {
	public static List<User> Users = new ArrayList<User>();

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
		List<User> listOfUsers = loadData();
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
	public static void storeData() {
		ObjectOutputStream out;
		try {
			out = new ObjectOutputStream(new FileOutputStream("data/authorDetailsContainer.dat"));
			out.writeObject(Users);
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static List<User> loadData() {
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream("data/authorDetailsContainer.dat"));
			Users = (List<User>) in.readObject();
			in.close();
			return Users;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
