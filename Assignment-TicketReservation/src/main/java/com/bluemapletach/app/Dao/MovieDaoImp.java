package com.bluemapletach.app.Dao;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.bluemapletach.app.model.MovieDetail;
import com.bluemapletach.app.model.UserDetails;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

@Repository
public class MovieDaoImp implements MovieDaoInteface {

	public UserDetails userDetails;
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	private JdbcTemplate getJdbcTemplate() {

		return jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public MovieDetail movieListInsert(final MovieDetail movieDetail) {
		System.out.println("id" + movieDetail.getMovie_id());
		int movie_id = movieDetail.getMovie_id();
		if (movie_id == 0) {
			String sql = "INSERT INTO movie "
					+ "(moviename,release_date,no_of_show,createddate,updateddate,createdby,updatedby) VALUES (?, ?, ?,?,?,?,?)";

			jdbcTemplate = new JdbcTemplate(dataSource);

			jdbcTemplate.update(sql,
					new Object[] { movieDetail.getMoviename(), movieDetail.getRelease_date(),
							movieDetail.getNo_of_show(), movieDetail.getDate(), movieDetail.getDate(),
							movieDetail.getName(), movieDetail.getName() });

			/*
			 * long result = 0; final String SQL = "INSERT INTO movie " +
			 * "(moviename,release_date,no_of_show,createddate,updateddate,createdby,updatedby) VALUES (?, ?, ?,?,?,?,?)"
			 * ; KeyHolder keyHolder = new GeneratedKeyHolder(); int row =
			 * this.jdbcTemplate.update(new PreparedStatementCreator() { public
			 * PreparedStatement createPreparedStatement(Connection connection)
			 * throws SQLException { PreparedStatement ps = (PreparedStatement)
			 * connection.prepareStatement(SQL); ps.setString(1,
			 * movieDetail.getMoviename());
			 * ps.setString(2,movieDetail.getRelease_date()); ps.setString(3,
			 * movieDetail.getNo_of_show()); ps.setString(4,
			 * movieDetail.getDate()); ps.setString(5, movieDetail.getDate());
			 * ps.setString(6, movieDetail.getName()); ps.setString(7,
			 * movieDetail.getName()); return ps; } }, keyHolder);
			 * System.out.println(keyHolder.getKey().longValue()); if (row > 0)
			 * result = keyHolder.getKey().longValue();
			 */} else if (movie_id > 0) {
			String sql = "UPDATE  movie SET moviename=?,release_date=?,no_of_show=?,updateddate=? WHERE movie_id=?";
			jdbcTemplate = new JdbcTemplate(dataSource);

			jdbcTemplate.update(sql, movieDetail.getMoviename(), movieDetail.getRelease_date(),
					movieDetail.getNo_of_show(), movieDetail.getDate(), movieDetail.getMovie_id());

		}
		return movieDetail;
	}

	public MovieDetail detail(int movie_id) {

		System.out.println(movie_id);
		String sql = "SELECT * FROM movie WHERE movie_id = ?";
		MovieDetail userDetails1 = (MovieDetail) getJdbcTemplate().queryForObject(sql, new Object[] { movie_id },
				new MovieRowMapper());
		int id = userDetails1.getMovie_id();
		System.out.println(id);
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
}
