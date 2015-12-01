package com.bluemapletach.app.Dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class RoleDaoImp implements RoleDaoInterface{
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	private JdbcTemplate getJdbcTemplate() {

		return jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public String checkRole(int role)
	{
		System.out.println(role);
		String sql = "SELECT role FROM role WHERE roleid = ?";
		 
		String roletype  = (String)getJdbcTemplate().queryForObject(
				sql, new Object[] { role }, String.class);
		
		
		return roletype;
		
	}

}
