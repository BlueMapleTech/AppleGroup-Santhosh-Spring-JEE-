package com.bluemapletach.app.Dao;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bluemapletach.app.model.MovieDetail;
import com.bluemapletach.app.model.UserDetails;

@Repository
public class MovieDaoImp implements MovieDaoInteface {

	public UserDetails userDetails;
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	private JdbcTemplate getJdbcTemplate() {

		return jdbcTemplate = new JdbcTemplate(dataSource);
	}

	DateFormat formatter = null;
	Date convertedDate = null;

	public MovieDetail movieListInsert(final MovieDetail movieDetail) {

		String ddMMyyyy = movieDetail.getRelease_date();
		formatter = new SimpleDateFormat("ddMMyyyy");
		try {
			convertedDate = (Date) formatter.parse(ddMMyyyy);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		movieDetail.setDate1(convertedDate);
		System.out.println("Date from ddMMyyyy String in Java : " + convertedDate);
		int movie_id = movieDetail.getMovie_id();
		if (movie_id == 0) {
			String sql = "INSERT INTO movie "
					+ "(moviename,release_date,no_of_show,createddate,updateddate,createdby,updatedby) VALUES (?, ?, ?,?,?,?,?)";

			jdbcTemplate = new JdbcTemplate(dataSource);

			jdbcTemplate.update(sql,
					new Object[] { movieDetail.getMoviename(), movieDetail.getDate1(), movieDetail.getNo_of_show(),
							movieDetail.getDate(), movieDetail.getDate(), movieDetail.getName(),
							movieDetail.getName() });

		} else if (movie_id > 0) {
	
			String sql = "UPDATE  movie SET moviename=?,release_date=?,no_of_show=?,updateddate=? WHERE movie_id=?";
			jdbcTemplate = new JdbcTemplate(dataSource);

			jdbcTemplate.update(sql, movieDetail.getMoviename(), movieDetail.getDate1(),
					movieDetail.getNo_of_show(), movieDetail.getDate(), movieDetail.getMovie_id());

		}
		return movieDetail;
	}

	public MovieDetail detail(int movie_id) {
		String sql = "SELECT * FROM movie WHERE movie_id = ?";
		MovieDetail userDetails1 = (MovieDetail) getJdbcTemplate().queryForObject(sql, new Object[] { movie_id },
				new MovieRowMapper());
		int id = userDetails1.getMovie_id();
		MovieDetail movie = new MovieDetail();
		String name = userDetails1.getMoviename();
		String release = userDetails1.getRelease_date();
		String no = userDetails1.getNo_of_show();
		movie.setMovie_id(id);
		movie.setMoviename(name);
		movie.setRelease_date(release);
		movie.setNo_of_show(no);

		return movie;

	}

	public int findMovieID(String name) {

		String sql = "SELECT * FROM movie WHERE moviename = ?";
		MovieDetail userDetails1 = (MovieDetail) getJdbcTemplate().queryForObject(sql, new Object[] { name },
				new MovieRowMapper());
		int id = userDetails1.getMovie_id();
		return id;

	}

	public List<MovieDetail> movieList(int id) {
		Date today1 = Calendar.getInstance().getTime();

		System.out.println("dao method");
		
		String sql = "SELECT * FROM movie WHERE release_date >= CURRENT_DATE()";
		List<MovieDetail> movieDetail = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(MovieDetail.class));
		System.out.println(movieDetail);
		return movieDetail;

	}

}
