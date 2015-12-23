package com.bluemapletach.app.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bluemapletach.app.model.MovieDetail;
import com.bluemapletach.app.model.MovieHasTimingDetail;
import com.bluemapletach.app.model.ReservationDetail;
import com.bluemapletach.app.model.TimeDetails;
import com.bluemapletach.app.service.ReservationServiceInterface;

@Controller
public class ReservationController {
	@Autowired
	ReservationServiceInterface service;

	@RequestMapping(value = "/book")
	public ModelAndView reservationPage(@RequestParam("id1") int movieid, @RequestParam("id") int userid,
			@RequestParam("statusid") int statusid, @RequestParam("date") String date) {
		ModelAndView model = new ModelAndView();

		System.out.println(userid + " " + movieid);
		MovieHasTimingDetail timing = new MovieHasTimingDetail();
		timing.setMovieid(movieid);

		List<MovieHasTimingDetail> details = service.listOfMovieTiming(timing);
		Iterator<MovieHasTimingDetail> iterator = details.iterator();
		int i = 0;
		while (iterator.hasNext()) {

			MovieHasTimingDetail detail1 = iterator.next();
			int id = detail1.getTiming_timing_id();
			System.out.println(i);

			System.out.println(id);
			if (i == 0) {

				TimeDetails detail = new TimeDetails();
				detail.setTiming_id(id);
				System.out.println("get timing");
				String a = service.getTiming(detail);
				model.addObject("timeid1", a);
			}
			if (i == 1) {
				TimeDetails detail = new TimeDetails();
				detail.setTiming_id(id);
				System.out.println("get timing");
				String a = service.getTiming(detail);
				model.addObject("timeid2", a);
			}
			if (i == 2) {
				TimeDetails detail = new TimeDetails();
				detail.setTiming_id(id);
				System.out.println("get timing");
				String a = service.getTiming(detail);
				model.addObject("timeid3", a);
			}
			if (i == 3) {
				TimeDetails detail = new TimeDetails();
				detail.setTiming_id(id);
				System.out.println("get timing");
				String a = service.getTiming(detail);
				model.addObject("timeid4", a);
			}

			i++;
		}
		model.addObject("userid", userid);
		model.addObject("movieid", movieid);
		model.addObject("reservationdate", date);
		model.addObject("statusid", statusid);
		model.setViewName("ticketbooking");

		return model;

	}

	@RequestMapping(value = "/ticketbooking")
	public ModelAndView insertReservationDetail(@ModelAttribute ReservationDetail detail) {
        ModelAndView model=new ModelAndView();
		service.insertReservationDetail(detail);
        int count=detail.getTicketcount();
        System.out.println(count);
		model.addObject("count",count);
		model.setViewName("ticketsheet");
        return model;

	}
}
