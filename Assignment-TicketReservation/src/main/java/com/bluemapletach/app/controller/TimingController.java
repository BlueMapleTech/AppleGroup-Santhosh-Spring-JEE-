package com.bluemapletach.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bluemapletach.app.model.TimeDetails;
import com.bluemapletach.app.service.TimingServiceInterface;

@Controller
public class TimingController {
	@Autowired
	TimingServiceInterface service;

	@RequestMapping(value = "/edittime")
	public ModelAndView movieTiming(@RequestParam("id") int timing_id) {
		int msg = timing_id;
		return new ModelAndView("timelist", "msg", msg);
	}
	@RequestMapping(value = "/ltime", method = RequestMethod.POST)
	public ModelAndView movieTime(@ModelAttribute TimeDetails timeDetails) {
		System.out.println("detail");
		service.movieTime(timeDetails);
		ModelAndView model = new ModelAndView();
		model.setViewName("detail1");
		return model;
	}

}
