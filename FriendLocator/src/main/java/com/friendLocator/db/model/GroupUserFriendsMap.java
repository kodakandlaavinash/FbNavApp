package com.friendLocator.db.model;

import java.util.Date;

public class GroupUserFriendsMap {
	private User owner;
	private Friend friend;
	private Date invitedAt;
	private Date updatedAt;
	private Location eventLocation;
	private Location friendLocation;
	private Boolean isActive;
	private Boolean checkedIn;

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public Friend getFriend() {
		return friend;
	}

	public void setFriend(Friend friend) {
		this.friend = friend;
	}

	public Date getInvitedAt() {
		return invitedAt;
	}

	public void setInvitedAt(Date invitedAt) {
		this.invitedAt = invitedAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Location getEventLocation() {
		return eventLocation;
	}

	public void setEventLocation(Location eventLocation) {
		this.eventLocation = eventLocation;
	}

	public Location getFriendLocation() {
		return friendLocation;
	}

	public void setFriendLocation(Location friendLocation) {
		this.friendLocation = friendLocation;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(Boolean checkedIn) {
		this.checkedIn = checkedIn;
	}

}
