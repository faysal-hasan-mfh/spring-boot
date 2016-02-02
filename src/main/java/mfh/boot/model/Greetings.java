package mfh.boot.model;

import java.math.BigInteger;

public class Greetings {

	private String userID;
	private String userName;
	private String userAddress;
	public Greetings(){}
	
	private BigInteger id;
	private String text;
	
	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	

	public Greetings(BigInteger id, String text) {
		super();
		this.id = id;
		this.text = text;
	}

	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
}
