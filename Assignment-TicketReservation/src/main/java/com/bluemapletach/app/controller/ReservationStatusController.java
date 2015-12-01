package com.bluemapletach.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bluemapletach.app.model.MovieDetail;
import com.bluemapletach.app.model.ReservationStatusDetail;
import com.bluemapletach.app.service.ReservationStatusInterface;
import com.bluemapletach.app.service.ReservationStatusServiceImp;

@Controller
public class ReservationStatusController {
	@Autowired
	ReservationStatusInterface service;

	@RequestMapping(value = "/editstatus")
	public ModelAndView view(@RequestParam("id") int id) {
		return new ModelAndView("status", "id", id);
	}

	@RequestMapping(value = "/reservationstatus")
	public ModelAndView reservationStatus(@ModelAttribute ReservationStatusDetail details) {

		service.reservationStatus(details);
		ModelAndView model = new ModelAndView();
		model.setViewName("detail1");
		return model;

	}

}
