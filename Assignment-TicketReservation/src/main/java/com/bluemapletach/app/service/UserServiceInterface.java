package com.bluemapletach.app.service;

import com.bluemapletach.app.model.UserDetails;

public interface UserServiceInterface {

	public UserDetails insert(UserDetails userDetails);

	public UserDetails checklog(UserDetails userDetails) throws Exception;

}
