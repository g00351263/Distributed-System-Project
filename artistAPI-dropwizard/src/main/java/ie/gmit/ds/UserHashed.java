package ie.gmit.ds;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserHashed {
	
 	public UserHashed(int userId, String userName, String email, String password, String hashed, String salted) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.hashed = hashed;
		this.salted = salted;
	}
 	
 	public UserHashed() {}
 	
	@JsonProperty
	public int getUserId() {
		return userId;
	}
	@JsonProperty
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@JsonProperty
	public String getUserName() {
		return userName;
	}
	@JsonProperty
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@JsonProperty
	public String getEmail() {
		return email;
	}
	@JsonProperty
	public void setEmail(String email) {
		this.email = email;
	}
	@JsonProperty
	public String getPassword() {
		return password;
	}
	@JsonProperty
	public void setPassword(String password) {
		this.password = password;
	}
	@JsonProperty
	public String getHashed() {
		return hashed;
	}
	@JsonProperty
	public void setHashed(String hashed) {
		this.hashed = hashed;
	}
	@JsonProperty
	public String getSalted() {
		return salted;
	}
	@JsonProperty
	public void setSalted(String salted) {
		this.salted = salted;
	}
	
	private int userId;
    private String userName;
    private String email;
    private String password;
    private String hashed;
    private String salted;
    
    
}
