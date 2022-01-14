package com.easylearning.model;

public class Password {

	private int id;
	private String specialCharacter;
	private String tokenNo;

	public Password() {
		// TODO Auto-generated constructor stub
	}

	public Password(int id, String specialCharacter, String tokenNo) {
		super();
		this.id = id;
		this.specialCharacter = specialCharacter;
		this.tokenNo = tokenNo;
	}

	@Override
	public String toString() {
		return "Password [id=" + id + ", specialCharacter=" + specialCharacter + ", tokenNo=" + tokenNo + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSpecialCharacter() {
		return specialCharacter;
	}

	public void setSpecialCharacter(String specialCharacter) {
		this.specialCharacter = specialCharacter;
	}

	public String getTokenNo() {
		return tokenNo;
	}

	public void setTokenNo(String tokenNo) {
		this.tokenNo = tokenNo;
	}

}
