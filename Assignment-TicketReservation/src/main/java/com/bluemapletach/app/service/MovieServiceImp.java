package com.bluemapletach.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluemapletach.app.Dao.MovieDaoInteface;
import com.bluemapletach.app.model.MovieDetail;

@Service
public class MovieServiceImp implements MovieServiceInterface {
	@Autowired
	MovieDaoInteface dao;

	public MovieDetail movieListInsert(MovieDetail movieDetail) {
		dao.movieListInsert(movieDetail);
		return movieDetail;

	}

	public MovieDetail detail(int movie_id) {
		return dao.detail(movie_id);
	}

}
