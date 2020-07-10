package com.sira.app.springbootrestapi.domain;

public class Address {

	private String strret1;
	private String strret2;
	private String city;
	private String state;
	private String zipCode;
	private String coutry;

	public String getStrret1() {
		return strret1;
	}

	public void setStrret1(String strret1) {
		this.strret1 = strret1;
	}

	public String getStrret2() {
		return strret2;
	}

	public void setStrret2(String strret2) {
		this.strret2 = strret2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCoutry() {
		return coutry;
	}

	public void setCoutry(String coutry) {
		this.coutry = coutry;
	}

	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}
