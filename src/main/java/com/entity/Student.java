package com.entity;

import java.io.Serializable;
public class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Student [user=" + user + "]";
	}
}
