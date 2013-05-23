package com.friendLocator.db.model;

import java.util.Date;

public class GroupDetails {

	private String groupId;
	private User owner;
	private Integer noOfParticipants;
	private Boolean defaultOn;
	private Date createdAt;
	private Date updatedAt;
	private Location location;
	private Integer noOfUsersCheckedIn;

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public Integer getNoOfParticipants() {
		return noOfParticipants;
	}

	public void setNoOfParticipants(Integer noOfParticipants) {
		this.noOfParticipants = noOfParticipants;
	}

	public Boolean getDefaultOn() {
		return defaultOn;
	}

	public void setDefaultOn(Boolean defaultOn) {
		this.defaultOn = defaultOn;
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

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Integer getNoOfUsersCheckedIn() {
		return noOfUsersCheckedIn;
	}

	public void setNoOfUsersCheckedIn(Integer noOfUsersCheckedIn) {
		this.noOfUsersCheckedIn = noOfUsersCheckedIn;
	}

}
