package com.bluemapletach.app.Dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bluemapletach.app.model.MovieDetail;
import com.bluemapletach.app.model.ReservationStatusDetail;

@Repository
public class ReservationStatusDaoImp implements ReservationStatusDaoInterface {
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	private JdbcTemplate getJdbcTemplate() {

		return jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public ReservationStatusDetail reservationStatus(ReservationStatusDetail details) {
		String sql = "INSERT INTO reservation_status "
				+ "(reservation_status,createddate,updateddate,createdby,updatedby) VALUES (?, ?, ?,?,?)";

		jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(sql, new Object[] { details.getReservation_status(), details.getDate(), details.getDate(),
				details.getName(), details.getName() });
		return details;

	}

}
