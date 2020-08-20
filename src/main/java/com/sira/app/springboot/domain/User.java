package com.sira.app.springboot.domain;

public class User {

	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}
