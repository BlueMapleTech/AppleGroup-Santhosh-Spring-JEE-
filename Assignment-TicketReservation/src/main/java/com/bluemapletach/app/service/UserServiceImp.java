package com.bluemapletach.app.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluemapletach.app.Dao.MovieDaoInteface;
import com.bluemapletach.app.Dao.RoleDaoInterface;
import com.bluemapletach.app.Dao.UserDaoImp;
//import com.bluemapletach.app.Dao.DaoInterface;
import com.bluemapletach.app.Dao.UserDaoInterfaces;
import com.bluemapletach.app.model.MovieDetail;
import com.bluemapletach.app.model.UserDetails;
@Service
public class UserServiceImp implements UserServiceInterface{
	@Autowired
	UserDaoInterfaces dao;
	@Autowired
	RoleDaoInterface dao1;
	@Autowired
	MovieDaoInteface dao2;
	@Override
	
	/**
	 * 
	 *
	 */
	public UserDetails insert(UserDetails userDetails) {

		System.out.println("insert method");
		dao.insert(userDetails);
		return userDetails;

	}

	public UserDetails checklog(UserDetails userDetails) throws Exception {
		String name1 = userDetails.getUsername();
		String pass1 = userDetails.getPassword();
		UserDetails userDetails1=dao.checklog(name1);
		int role = userDetails1.getRoleid1();
		String roletype=dao1.checkRole(role);
		System.out.println("role"+roletype);
		String name = userDetails1.getUsername();
		String pass = userDetails1.getPassword();
		if ((name1.equals(name)) && (pass1.equals(pass)) && (roletype.equals("admin"))) {
			System.out.println("admin role");
			String msg = "adminrole";
			userDetails.setMsg(msg);
		} else if ((name1.equals(name)) && (pass1.equals(pass)) && (roletype.equals("user"))) {
			System.out.println("userrole");
			String msg = "userrole";
			userDetails.setMsg(msg);
		} else {
			String msg = "invalid";
			userDetails.setMsg(msg);
		}

		return userDetails;
	}

	public List<MovieDetail> movieList(int id)
	{
		return dao2.movieList(id);
		
	}

	public int findUserId(String name)
	{
		return dao.findUserId(name);
	}

}
