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
import com.bluemapletach.app.model.TicketCountDetails;
import com.bluemapletach.app.service.TicketTypeAndCountServiceInterface;

@Controller
public class TicketTypeAndCount {
	@Autowired
	TicketTypeAndCountServiceInterface service;
	ModelAndView model = new ModelAndView();

	@RequestMapping(value = "/edittickettype", method = RequestMethod.GET)
	public ModelAndView display(@RequestParam("id") int id) {
		return new ModelAndView("tickettype", "id", id);

	}

	@RequestMapping(value = "/tickettypecount", method = RequestMethod.POST)
	public ModelAndView ticketTypeCount(@ModelAttribute TicketCountDetails ticketDetails) {
		service.ticketTypeCount(ticketDetails);
		model.setViewName("detail1");
		return model;
	}

}
