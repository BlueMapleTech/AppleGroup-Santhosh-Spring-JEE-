package com.bluemapletach.app.service;

import java.util.Date;
import java.util.List;

import com.bluemapletach.app.model.MovieDetail;
import com.bluemapletach.app.model.UserDetails;

public interface UserServiceInterface {

	public UserDetails insert(UserDetails userDetails);

	public UserDetails checklog(UserDetails userDetails) throws Exception;

	public List<MovieDetail> movieList(int id);

	public int findUserId(String name);

}
