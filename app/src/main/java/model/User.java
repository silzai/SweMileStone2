package model;
public class User {
	private String username="", password="";
	private boolean isLogged=false;

	public User(String username, String password) {
		if (UserContainer.find(username)==null) {//check if Account exists
			this.username = username;
			this.password = password;
			UserContainer.addUser(this);//automatically added to container
		}
		else
			System.err.println("Error: Username already exists.");
	}

	public String getUsername() {
		return username;
	}

	public boolean isLogged() {
		return isLogged;
	}

	public void logout() {
		final StackTraceElement[] elements = new Throwable().getStackTrace();
		if (elements[1].getClassName().equals("model.UserAccountContainer"))//only the container is allowed to set isLogged
			this.isLogged = false;
	}

	public void login() {
		final StackTraceElement[] elements = new Throwable().getStackTrace();
		if (elements[1].getClassName().equals("model.UserAccountContainer"))//only the container is allowed to set isLogged
			this.isLogged = true;
	}

	public void changePassword(String oldPassword, String newPassword) {
		if (this.password.equals(oldPassword))
			this.password = newPassword;
	}
	public boolean isValid(String username, String password) {
	   return this.username.equalsIgnoreCase(username) && this.password.equals(password);
	}
	
	public void generateCredentials(String username, String password) {
		UserContainer.addUser(new User(username, password));
	}
}
