package com.bluemapletach.app.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
public class MovieController extends HttpServlet {
	@Autowired
	MovieServiceInterface service;
	ModelAndView model = new ModelAndView();

	/**
	 * send the controller to home page 
	 * @author SanthoshPC
	 * @return
	 */
	@RequestMapping(value = "/home")
	public ModelAndView display() {
		model.setViewName("home");
		return model;

	}
/**
 * movie_id value into movielist page for the purpose of editing
 * @param movie_id
 * @author SanthoshPC
 * @return id value to page
 */
	@RequestMapping(value = "/edit")
	public ModelAndView detail(@RequestParam("name") int movie_id) {
		MovieDetail movie = service.detail(movie_id);
		int id = movie.getMovie_id();
		return new ModelAndView("movielist", "name", id);
	}
	/**
	 * this method is used for inserting the movie details 
	 * @author SanthoshPC
	 * @return id value to page
	 */

	@RequestMapping(value = "/edit1")
	public ModelAndView detail() {
		int id = 0;
		return new ModelAndView("movielist", "name", id);

	}
/**
 * send movie detail and timing detail and ticket rate detail to service
 * @param request
 * @param response
 * @return
 */
	@RequestMapping(value = "/mlist", method = RequestMethod.POST)
	public ModelAndView movieListInsert(HttpServletRequest request, HttpServletResponse response) {

		int id;
		id = Integer.parseInt(request.getParameter("movie_id"));
		System.out.println("id is" + id);
		String name = request.getParameter("moviename");
		String releasedate = request.getParameter("release_date");
		String show = request.getParameter("no_of_show");
		String a[] = request.getParameterValues("count");
		for (int i = 0; i < a.length; i++) {
			System.out.println("id" + "   " + a[i]);

		}

		String rate = request.getParameter("rate");
		String rate1 = request.getParameter("rate1");
		MovieDetail movieDetail = new MovieDetail();
		movieDetail.setMovie_id(id);
		movieDetail.setMoviename(name);
		movieDetail.setRelease_date(releasedate);
		movieDetail.setNo_of_show(show);
		movieDetail.setCount(a);
		movieDetail.setTicket_rate(rate);
		movieDetail.setTicket_rate1(rate1);
		service.movieListInsert(movieDetail, a);
		ModelAndView model = new ModelAndView();
		model.setViewName("detail1");
		return model;
	}

}
