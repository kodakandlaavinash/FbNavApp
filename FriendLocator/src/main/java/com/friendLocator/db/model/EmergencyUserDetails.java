package com.friendLocator.db.model;

public class EmergencyUserDetails {

	private User user;
	private User emergencyUser;
	private String emergencyMobileNumber;
	private String emergencyEmailAddress;
	private String address;
	private Integer smsEmailNotificationFlag;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getEmergencyUser() {
		return emergencyUser;
	}

	public void setEmergencyUser(User emergencyUser) {
		this.emergencyUser = emergencyUser;
	}

	public String getEmergencyMobileNumber() {
		return emergencyMobileNumber;
	}

	public void setEmergencyMobileNumber(String emergencyMobileNumber) {
		this.emergencyMobileNumber = emergencyMobileNumber;
	}

	public String getEmergencyEmailAddress() {
		return emergencyEmailAddress;
	}

	public void setEmergencyEmailAddress(String emergencyEmailAddress) {
		this.emergencyEmailAddress = emergencyEmailAddress;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getSmsEmailNotificationFlag() {
		return smsEmailNotificationFlag;
	}

	public void setSmsEmailNotificationFlag(Integer smsEmailNotificationFlag) {
		this.smsEmailNotificationFlag = smsEmailNotificationFlag;
	}

}
