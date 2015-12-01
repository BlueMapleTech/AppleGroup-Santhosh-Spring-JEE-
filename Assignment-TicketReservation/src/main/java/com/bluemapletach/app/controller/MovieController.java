package com.bluemapletach.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bluemapletach.app.model.MovieDetail;
import com.bluemapletach.app.service.MovieServiceInterface;
@Controller
public class MovieController {
	@Autowired
	MovieServiceInterface service;

	@RequestMapping(value = "/hom")
	public ModelAndView display() {
		String msg = "welcome back....";
		return new ModelAndView("home", "msg", msg);

	}

	
	@RequestMapping(value = "/edit")
	public ModelAndView detail(@RequestParam("name") int movie_id) {

		System.out.println(movie_id);
		MovieDetail movie = service.detail(movie_id);

		int id = movie.getMovie_id();
		// System.out.println(id);
		return new ModelAndView("movielist", "name", id);

	}

	@RequestMapping(value = "/edit1")
	public ModelAndView detail() {

		// System.out.println(movie_id);
		// MovieDetail movie=service.detail(movie_id);

		int id = 0;
		// System.out.println(id);
		return new ModelAndView("movielist", "name", id);

	}

	@RequestMapping(value = "/mlist", method = RequestMethod.POST)
	public ModelAndView movieListInsert(@ModelAttribute MovieDetail movieDetail) {
		System.out.println("detail");
		service.movieListInsert(movieDetail);
		String msg = "edited sucessfully";
		return new ModelAndView("detail1", msg, msg);
	}

	



}
