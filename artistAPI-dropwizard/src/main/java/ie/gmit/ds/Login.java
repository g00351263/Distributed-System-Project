package ie.gmit.ds;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Login {
	String password;
	int userId;
	
	public Login() {}
	
	public Login(String password, int userId) {
		super();
		this.password = password;
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public int getUserId() {
		return userId;
	}
	

	
}
