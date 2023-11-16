package model;
public class User {
	private String username="", password="";
	private String id;
	private String firstName;
	private String lastName;
	private boolean isLogged=false;

	public User(String firstName, String lastName, String id) {
		if (UserContainer.find(username)==null) {//check if Account exists
			this.firstName = firstName;
			this.lastName = lastName;
			this.id = id;
			this.generateCredentials(firstName, lastName, id);
			UserContainer.addUser(this);//automatically added to container
		}
		else
			System.err.println("Error: Username already exists.");
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setUsername(String username) {
		this.username = username;
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
		if (elements[1].getClassName().equals("model.UserContainer"))//only the container is allowed to set isLogged
			this.isLogged = true;
	}

	public void changePassword(String oldPassword, String newPassword) {
		if (this.password.equals(oldPassword))
			this.password = newPassword;
	}
	public boolean isValid(String username, String password) {
	   return this.username.equalsIgnoreCase(username) && this.password.equals(password);
	}
	
	public void generateCredentials(String firstName, String lastName, String id) {
		this.username = firstName + id;
		this.password = lastName + id;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", isLogged=" + isLogged + "]";
	}

	
	
	
}
