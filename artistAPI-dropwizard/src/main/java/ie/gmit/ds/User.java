package ie.gmit.ds;

import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@XmlType(propOrder = { "userId", "userName", "email", "password" })
@JsonPropertyOrder({ "userId", "userName", "email", "password" })
public class User {

	 	private int userId;
	    private String userName;
	    private String email;
	    private String password;


	    public User() {
	        // Needed for Jackson deserialisation
	    }


		public User(int userId, String userName, String email, String password) {
			super();
			this.userId = userId;
			this.userName = userName;
			this.email = email;
			this.password = password;
		}
		@JsonProperty
		public void setUserName(String userName) {
			this.userName = userName;
		}

		@JsonProperty
		public void setEmail(String email) {
			this.email = email;
		}

		@JsonProperty
		public void setPassword(String password) {
			this.password = password;
		}


		@JsonProperty
		public int getUserId() {
			return userId;
		}

		@JsonProperty
		public void setUserId(int userId) {
			this.userId = userId ;
		}

		@JsonProperty
		public String getUserName() {
			return userName;
		}



		@JsonProperty
		public String getEmail() {
			return email;
		}



		@JsonProperty
		public String getPassword() {
			return password;
		}

	}
