package com.users.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
public class User {

	@Id
	private String username;
	private String password;
	
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password +"]";
	}
}
