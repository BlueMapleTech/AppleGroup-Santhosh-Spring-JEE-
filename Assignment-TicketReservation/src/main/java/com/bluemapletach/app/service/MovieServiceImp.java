package com.bluemapletach.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluemapletach.app.Dao.MovieDaoInteface;
import com.bluemapletach.app.Dao.MovieHasTimingDaoInterface;
import com.bluemapletach.app.Dao.TicketRateDaoInterface;
import com.bluemapletach.app.model.MovieDetail;

@Service
public class MovieServiceImp implements MovieServiceInterface {
	@Autowired
	MovieDaoInteface dao;
	@Autowired
	MovieHasTimingDaoInterface dao1;
	@Autowired
	TicketRateDaoInterface dao2;

	public void movieListInsert(MovieDetail movieDetail, String[] a) {

		MovieDetail movie = new MovieDetail();

		String name = movieDetail.getMoviename();
		String rate = movieDetail.getTicket_rate();
		String rate1 = movieDetail.getTicket_rate1();
		dao.movieListInsert(movieDetail);
		System.out.println("service method to find id");
		int movieid = dao.findMovieID(name);
		for (int i = 0; i < a.length; i++) {
			System.out.println("insert movihastiming dao");
			System.out.println(a[i]);
			int timingid = Integer.parseInt(a[i]);
			movie.setMovie_id(movieid);
			movie.setTimingid(timingid);

			dao1.movieHasTiming(movie);

		}
		movie.setTicket_rate(rate);
		movie.setMovie_id(movieid);
		movie.setTickettypeid(1);
		dao2.insert(movie);
		movie.setTicket_rate(rate1);
		movie.setMovie_id(movieid);
		movie.setTickettypeid(2);
		dao2.insert(movie);

	}

	public MovieDetail detail(int movie_id) {
		return dao.detail(movie_id);
	}

}
