package com.bluemapletach.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bluemapletach.app.model.MovieDetail;
import com.bluemapletach.app.model.TicketRateDetails;
import com.bluemapletach.app.service.TicketRateServiceInterface;

@Controller
public class TicketRateController {
	@Autowired
	TicketRateServiceInterface service;
	@RequestMapping(value="/ticketrate")
	public ModelAndView insert()
	{
		int id=0;
		return new ModelAndView("ticketrates","id",id);
	}
	@RequestMapping(value="/editticketrate")
	public ModelAndView edit(@RequestParam("id")int id)
	{
		
		return new ModelAndView("ticketrates","id",id);
	}
	
	@RequestMapping(value = "/ratedetails", method = RequestMethod.POST)
	public ModelAndView movieListInsert(@ModelAttribute TicketRateDetails rateDetail) {
		System.out.println("detail");
		service.ticketRateInsert(rateDetail);
		String msg = "edited sucessfully";
		return new ModelAndView("detail1", msg, msg);
	}

}
