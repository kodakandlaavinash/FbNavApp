package com.friendLocator.db.dao;

import com.friendLocator.db.model.User;

public interface UserDao {

	public String createUser();
	
	public User getUser();
	
	public String deleteUser();
	
	public String editUser();
	
}
