package com.bluemapletach.app.Dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bluemapletach.app.model.MovieDetail;
import com.bluemapletach.app.model.UserDetails;

@Repository
public class UserDaoImp implements UserDaoInterfaces {
	public UserDetails userDetails;
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	private JdbcTemplate getJdbcTemplate() {

		return jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public UserDetails insert(UserDetails userDetails) {
		// inserting the value into database
		System.out.println("dao method");
		String sql = "INSERT INTO user "
				+ "(username,password,email,firstname,lastname,address,createdby,updatedby,createddate,updateddate,role_roleid) VALUES (?, ?, ?,?,?,?,?,?,?,?,?)";

		jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(sql,
				new Object[] { userDetails.getUsername(), userDetails.getPassword(), userDetails.getEmail(),
						userDetails.getFirstname(), userDetails.getLastname(), userDetails.getAddress(),
						userDetails.getUsername(), userDetails.getUsername(), userDetails.getDate(),
						userDetails.getDate(), userDetails.getRoleid() });

		return userDetails;

	}

	public UserDetails checklog(String name1) throws Exception {
		System.out.println("dao log checking");
		String sql = "SELECT * FROM user WHERE username = ?";
		UserDetails userDetails1 = (UserDetails) getJdbcTemplate().queryForObject(sql, new Object[] { name1 },
				new UserRowMapper());
		// UserDetails userDetail2=new UserDetails()
		int role = userDetails1.getRoleid1();
		String name = userDetails1.getUsername();
		System.out.println(name);
		String pass = userDetails1.getPassword();
		userDetails1.setRoleid1(role);
		userDetails1.setUsername(name);
		userDetails1.setPassword(pass);
		return userDetails1;

	}

	public int findUserId(String name) {
		String sql = "SELECT * FROM user WHERE username = ?";

		UserDetails userDetails1 = (UserDetails) getJdbcTemplate().queryForObject(sql, new Object[] { name },
				new UserRowMapper());
		int id = userDetails1.getUserid();
		System.out.println(id);
		return id;
	}

}
