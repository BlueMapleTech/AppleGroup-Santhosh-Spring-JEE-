package com.bluemapletach.app.Dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bluemapletach.app.model.MovieDetail;
import com.bluemapletach.app.model.TicketCountDetails;
import com.bluemapletach.app.model.UserDetails;

@Repository
public class TicketTypeAndCountDaoIm implements TicketTypeAndCountDaoInterface {
	public UserDetails userDetails;
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	private JdbcTemplate getJdbcTemplate() {

		return jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public TicketCountDetails ticketTypeCount(TicketCountDetails ticketDetails) {
		int id = ticketDetails.getTicket_type_id();
		if (id == 0) {
			String sql = "INSERT INTO ticket_type "
					+ "(ticket_type,ticket_type_count,createddate,updateddate,createdby,updatedby) VALUES (?, ?,?,?,?,?)";

			jdbcTemplate = new JdbcTemplate(dataSource);

			jdbcTemplate.update(sql,
					new Object[] { ticketDetails.getTicket_type(), ticketDetails.getTicket_type_count(),
							ticketDetails.getDate(), ticketDetails.getDate(), ticketDetails.getName(),
							ticketDetails.getName() });
		} else if (id > 0) {
			String sql = "UPDATE  ticket_type SET ticket_type=?,ticket_type_count=?,updateddate=? WHERE ticket_type_id=?";
			jdbcTemplate = new JdbcTemplate(dataSource);

			jdbcTemplate.update(sql, ticketDetails.getTicket_type(), ticketDetails.getTicket_type_count(),
					ticketDetails.getDate(), ticketDetails.getTicket_type_id());

		}
		return ticketDetails;

	}

}
