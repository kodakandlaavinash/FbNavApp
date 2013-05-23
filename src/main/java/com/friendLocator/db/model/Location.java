package com.friendLocator.db.model;

import java.util.Date;

public class Location {

	private String locationId;
	private String latitude;
	private String longitude;
	private Date createdAt;
	private Date updatedAt;
	private String locationName;
	private String isUserFavourite;

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
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

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getIsUserFavourite() {
		return isUserFavourite;
	}

	public void setIsUserFavourite(String isUserFavourite) {
		this.isUserFavourite = isUserFavourite;
	}

}
