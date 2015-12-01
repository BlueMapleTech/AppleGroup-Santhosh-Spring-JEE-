package com.bluemapletach.app.Dao;

import java.util.List;

import com.bluemapletach.app.model.MovieDetail;

public interface MovieDaoInteface {
	public MovieDetail movieListInsert(MovieDetail movieDetail);

	public MovieDetail detail(int movie_id);

}
