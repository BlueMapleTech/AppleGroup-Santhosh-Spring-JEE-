package com.bluemapletach.app.Dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bluemapletach.app.model.MovieDetail;
import com.bluemapletach.app.model.ReservationStatusDetail;
import com.bluemapletach.app.model.TicketCountDetails;
import com.bluemapletach.app.model.TicketRateDetails;
import com.bluemapletach.app.model.TimeDetails;
import com.bluemapletach.app.model.UserDetails;
@Repository
public class LogDaoImp implements LogDaoInterface{
	public UserDetails userDetails;
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	private JdbcTemplate getJdbcTemplate() {

		return jdbcTemplate = new JdbcTemplate(dataSource);
	}


	
		public List<MovieDetail> listOfmovie() {
		System.out.println("dao method");
		String sql = "select * from movie";
		List<MovieDetail> movieDetail = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(MovieDetail.class));
             MovieDetail userDetails=new MovieDetail();
             //System.out.println(userDetails.getNo_of_show());
		System.out.println(movieDetail);

		return movieDetail;

	}
	public List<ReservationStatusDetail> listOfStatus() {

		String sql = "select * from reservation_status";
		List<ReservationStatusDetail> details = getJdbcTemplate().query(sql,
				new BeanPropertyRowMapper(ReservationStatusDetail.class));

		return details;

	}
	public List<TicketCountDetails> listOfTicketTypeAndCount()
	{
		String sql = "select * from ticket_type";
		List<TicketCountDetails> tickettypeDetail = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(TicketCountDetails.class));

		//System.out.println(movieDetail);

		return tickettypeDetail;

		
	}
	public List<TimeDetails> timeList() {

		System.out.println("dao method");
		String sql = "select * from timing";
		List<TimeDetails> timeDetails = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(TimeDetails.class));

		System.out.println(timeDetails);

		return timeDetails;

	}
	public List<TicketRateDetails> rateList()
	{
		String sql = "SELECT * FROM ticket_rate";
		
		List<TicketRateDetails> rateList  = getJdbcTemplate().query(sql,
				new BeanPropertyRowMapper(TicketRateDetails.class));
			
		return rateList;
	}

}
