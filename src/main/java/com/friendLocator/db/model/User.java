package com.friendLocator.db.model;

import java.util.Date;
import java.util.Set;

import com.friendLocator.utils.constants.UserRole;

public class User {

	private String userId;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String mobileNumber;
	private String alternateMobileNumber;
	private String loginSource;
	private Date createdAt;
	private Date updatedAt;
	private String userName;
	private Date lastLoginDate;
	private String lastUserLatitude;
	private String lastUserLongitude;
	private UserRole userRole;
	private Boolean isActive;
	private Boolean isOnline;

	private Set<EmergencyUserDetails> userEmergencyDetails;
	private Set<Location> userLocationHistory;
	private Set<GroupDetails> userGroups;
	private Set<Friend> userFriends;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAlternateMobileNumber() {
		return alternateMobileNumber;
	}

	public void setAlternateMobileNumber(String alternateMobileNumber) {
		this.alternateMobileNumber = alternateMobileNumber;
	}

	public String getLoginSource() {
		return loginSource;
	}

	public void setLoginSource(String loginSource) {
		this.loginSource = loginSource;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public String getLastUserLatitude() {
		return lastUserLatitude;
	}

	public void setLastUserLatitude(String lastUserLatitude) {
		this.lastUserLatitude = lastUserLatitude;
	}

	public String getLastUserLongitude() {
		return lastUserLongitude;
	}

	public void setLastUserLongitude(String lastUserLongitude) {
		this.lastUserLongitude = lastUserLongitude;
	}

	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsOnline() {
		return isOnline;
	}

	public void setIsOnline(Boolean isOnline) {
		this.isOnline = isOnline;
	}

	public Set<EmergencyUserDetails> getUserEmergencyDetails() {
		return userEmergencyDetails;
	}

	public void setUserEmergencyDetails(
			Set<EmergencyUserDetails> userEmergencyDetails) {
		this.userEmergencyDetails = userEmergencyDetails;
	}

	public Set<Location> getUserLocationHistory() {
		return userLocationHistory;
	}

	public void setUserLocationHistory(Set<Location> userLocationHistory) {
		this.userLocationHistory = userLocationHistory;
	}

	public Set<GroupDetails> getUserGroups() {
		return userGroups;
	}

	public void setUserGroups(Set<GroupDetails> userGroups) {
		this.userGroups = userGroups;
	}

	public Set<Friend> getUserFriends() {
		return userFriends;
	}

	public void setUserFriends(Set<Friend> userFriends) {
		this.userFriends = userFriends;
	}

}
