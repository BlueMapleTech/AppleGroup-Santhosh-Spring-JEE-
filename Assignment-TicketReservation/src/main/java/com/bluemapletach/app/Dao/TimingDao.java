package com.bluemapletach.app.Dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bluemapletach.app.model.TimeDetails;
import com.bluemapletach.app.model.UserDetails;

@Repository
public class TimingDao implements TimingDaoInterface {
	public UserDetails userDetails;
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	private JdbcTemplate getJdbcTemplate() {

		return jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public TimeDetails movieTime(TimeDetails timeDetails) {

		System.out.println(timeDetails.getTiming_id());
		int timing_id = timeDetails.getTiming_id();
		if (timing_id == 0) {

			String sql = "INSERT INTO timing "
					+ "(timing,createddate,updateddate,createdby,updatedby) VALUES (?, ?, ?,?,?)";

			jdbcTemplate = new JdbcTemplate(dataSource);

			jdbcTemplate.update(sql, new Object[] { timeDetails.getTiming(), timeDetails.getDate(),
					timeDetails.getDate(), timeDetails.getName(), timeDetails.getName() });

		} else if (timing_id > 0) {
			String sql = "UPDATE  timing SET timing=?,updateddate=? WHERE timing_id=?";
			jdbcTemplate = new JdbcTemplate(dataSource);

			jdbcTemplate.update(sql, timeDetails.getTiming(), timeDetails.getDate(), timeDetails.getTiming_id());

		}
		return timeDetails;
	}

}
