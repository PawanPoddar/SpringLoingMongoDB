package com.login.demo.model;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="user_login")
public class User {
	
	@Id
	private Long id;
	@Field
	@NotNull
	private String email;
	@NotNull
	private String password;
	@NotNull
	private String name;
	
	
	
	
	public User() {
	}
	public User(Long id, @NotNull String email, @NotNull String password, @NotNull String name) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
