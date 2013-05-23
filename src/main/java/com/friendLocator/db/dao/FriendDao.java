package com.friendLocator.db.dao;

import java.util.Set;

import com.friendLocator.db.model.User;

public interface FriendDao {

	public Set<User> getUserFriends();
	
	public void deleteUserFriends();

}
