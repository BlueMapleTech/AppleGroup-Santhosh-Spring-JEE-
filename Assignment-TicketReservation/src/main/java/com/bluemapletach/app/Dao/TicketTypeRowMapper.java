package com.bluemapletach.app.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bluemapletach.app.model.MovieDetail;
import com.bluemapletach.app.model.TicketCountDetails;

public class TicketTypeRowMapper implements RowMapper {
	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		TicketCountDetails ticketDetails = new TicketCountDetails();
		ticketDetails.setTicket_type_id(rs.getInt("ticket_type_id"));
		ticketDetails.setTicket_type(rs.getString("ticket_type"));
		ticketDetails.setTicket_type_count(rs.getInt("ticket_type_count"));
		return ticketDetails;
	
		
	}

}
