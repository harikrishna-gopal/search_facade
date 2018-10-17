package com.search.search_maven.models;
import org.springframework.data.annotation.Id;

public class Course {
	
	@Id
	private String id;
	private String language;
	private String version;
	private String isJvmBased;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getIsJvmBased() {
		return isJvmBased;
	}
	public void setIsJvmBased(String isJvmBased) {
		this.isJvmBased = isJvmBased;
	}
	
}
