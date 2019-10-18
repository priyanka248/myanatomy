package entity;

public class UserDto {
	
	Long id;
	
	String userId;
	
	String password;
	
	String isAdmin;
	
	String user_type;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}	

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getAdmin() {
		return isAdmin;
	}	

	public void setAdmin(String isAdmin) {
		this.password = isAdmin;
	}
	

}
