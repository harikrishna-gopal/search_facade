package com.search.search_maven.models;
import org.springframework.data.annotation.Id;
public class Users {

	public Users() {}
	
	public Users(String id, String user, String workStation) {
		this.id = id;
		this.user = user;
		this.workStation = workStation;
	}
	
	@Id 
	private String id;
	private String user;
	private String workStation;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getWorkstation() {
		return workStation;
	}
	public void setWorkstation(String workstation) {
		this.workStation = workstation;
	}

}
