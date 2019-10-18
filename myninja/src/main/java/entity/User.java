package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.NotNull;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	@NotNull
	@Column(name = "USER_ID")
	String userId;
	
	@NotNull
	@Column(name = "PASSWORD")
	String password;
	
	@NotNull
	@Column(name = "IS_ADMIN")
	String isAdmin;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
