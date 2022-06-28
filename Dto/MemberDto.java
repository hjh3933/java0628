package org.java.Dto;

public class MemberDto {
	private String userId;
	private String userPw;
	private int userAge;
	private String userName;

	public MemberDto(String userId, String userPw, int userAge, String userName) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userAge = userAge;
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getuserName() {
		return userName;
	}

	public void setuserName(String userName) {
		this.userName = userName;
	}

}
