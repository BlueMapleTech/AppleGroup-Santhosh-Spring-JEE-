package com.bluemapletach.app.Dao;

import com.bluemapletach.app.model.UserDetails;

public interface UserDaoInterfaces {
	public UserDetails insert(UserDetails userDetails);

	public UserDetails checklog(String name1) throws Exception;

	public int findUserId(String name);

}
