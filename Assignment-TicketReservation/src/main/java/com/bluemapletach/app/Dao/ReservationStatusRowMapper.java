package com.bluemapletach.app.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bluemapletach.app.model.ReservationStatusDetail;
import com.bluemapletach.app.model.UserDetails;

public class ReservationStatusRowMapper implements RowMapper {
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		System.out.println("this is row mapper");
		ReservationStatusDetail details = new ReservationStatusDetail();
		details.setReservation_status_id(rs.getInt("reservation_status_id"));
		details.setReservation_status(rs.getString("reservation_status"));

		return details;

	}
}
