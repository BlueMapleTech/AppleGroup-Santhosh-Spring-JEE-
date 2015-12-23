package com.bluemapletach.app.Dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bluemapletach.app.model.ReservationDetail;

@Repository
public class ReservationDaoImp implements ReservationdaoInterface {

	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	private JdbcTemplate getJdbcTemplate() {

		return jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void insertReservationDetail(ReservationDetail detail) {

		String sql = "INSERT INTO reservation "
				+ "(reservation_count,reservation_date,createddate,updateddate,createdby,updatedby,reservation_status_reservation_status_id,user_userid,movie_movie_id,timing_timing_id) VALUES (?, ?, ?,?,?,?,?,?,?,?)";

		jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(sql,
				new Object[] { detail.getTicketcount(), detail.getReservationdate(), detail.getDate(), detail.getDate(),
						detail.getName(), detail.getName(), detail.getStatusid(), detail.getUserid(),
						detail.getMovieid(), detail.getTimingid() });

	}

}
