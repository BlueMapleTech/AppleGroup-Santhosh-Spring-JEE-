package com.bluemapletach.app.Dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bluemapletach.app.model.MovieDetail;
import com.bluemapletach.app.model.TicketRateDetails;

@Repository
public class TicketRateDaoImp implements TicketRateDaoInterface {
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	private JdbcTemplate getJdbcTemplate() {

		return jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public TicketRateDetails ticketRateInsert(TicketRateDetails rateDetail) {
		int id = rateDetail.getTicket_rate_id();
		System.out.println(id);
		if (id == 0) {
			System.out.println("insert method");
			String sql = "INSERT INTO ticket_rate"
					+ " (ticket_rate,createddate,updateddate,createdby,updatedby,ticket_type_ticket_type_id,movie_movie_id) VALUES ( ?,?,?,?,?,?,?)";
			jdbcTemplate = new JdbcTemplate(dataSource);

			jdbcTemplate.update(sql,
					new Object[] { rateDetail.getTicket_rate(), rateDetail.getDate(), rateDetail.getDate(),
							rateDetail.getName(), rateDetail.getName(), rateDetail.getTicket_type_ticket_type_id(),
							rateDetail.getMovie_movie_id() });

		} else if (id > 0) {
			String sql = "UPDATE  movie SET ticket_rate,updateddate=?,ticket_type_id=?,movie_id=? WHERE ticket_rate_id=?";
			jdbcTemplate = new JdbcTemplate(dataSource);

			jdbcTemplate.update(sql, rateDetail.getTicket_rate(), rateDetail.getDate(),
					rateDetail.getTicket_type_ticket_type_id(), rateDetail.getMovie_movie_id());

		}
		return rateDetail;
	}
	public void insert(MovieDetail movie)
	{
		String sql = "INSERT INTO ticket_rate"
				+ " (ticket_rate,createddate,updateddate,createdby,updatedby,ticket_type_ticket_type_id,movie_movie_id) VALUES ( ?,?,?,?,?,?,?)";
		jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(sql,
				new Object[] { movie.getTicket_rate(), movie.getDate(), movie.getDate(),
						movie.getName(), movie.getName(),movie.getTickettypeid(),
						movie.getMovie_id() });
		
	}
}
