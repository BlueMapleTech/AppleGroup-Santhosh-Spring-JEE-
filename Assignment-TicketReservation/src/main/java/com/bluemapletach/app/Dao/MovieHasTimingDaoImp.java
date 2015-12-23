package com.bluemapletach.app.Dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bluemapletach.app.model.MovieDetail;
import com.bluemapletach.app.model.MovieHasTimingDetail;

@Repository
public class MovieHasTimingDaoImp implements MovieHasTimingDaoInterface {

	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	private JdbcTemplate getJdbcTemplate() {

		return jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void movieHasTiming(MovieDetail movie) {
		System.out.println("dao method");

		String sql = "INSERT INTO movie_has_timing " + "(movie_movie_id,timing_timing_id) VALUES (?, ?)";

		jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(sql, new Object[] { movie.getMovie_id(), movie.getTimingid() });

		System.out.println("inserted sucessfully");

	}

	public List<MovieHasTimingDetail> listOfMovieTiming(MovieHasTimingDetail timing) {
		int id = timing.getMovieid();
		String sql = "select * from movie_has_timing Where movie_movie_id='" + timing.getMovieid() + "'";
		List<MovieHasTimingDetail> timing1 = getJdbcTemplate().query(sql,
				new BeanPropertyRowMapper(MovieHasTimingDetail.class));
		System.out.println(timing1);

		return timing1;

	}

}
