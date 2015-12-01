package com.bluemapletach.app.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bluemapletach.app.model.MovieDetail;
import com.bluemapletach.app.model.ReservationStatusDetail;
import com.bluemapletach.app.model.TicketCountDetails;
import com.bluemapletach.app.model.TicketRateDetails;
import com.bluemapletach.app.model.TimeDetails;
import com.bluemapletach.app.model.UserDetails;
import com.bluemapletach.app.service.LogServiceInterface;

@Controller
public class LogController {
	@Autowired
	LogServiceInterface service;


	@RequestMapping(value = "/adminpage")
	public ModelAndView display() {

		List<MovieDetail> details = service.listOfmovie();

		System.out.println(details);
		List<ReservationStatusDetail> details1 = service.listOfStatus();
		List<TicketCountDetails> details2 = service.listOfTicketTypeAndCount();
		List<TimeDetails> details3 = service.timeList();
		List<TicketRateDetails> details4 = service.rateList();
		Map<String, Object> myModel = new HashMap<String, Object>();
		List<Map> data = new ArrayList<Map>();
		Map testData = new HashMap();
		testData.put("details", details);
		testData.put("reservationdetails", details1);
		testData.put("ticket", details2);
		testData.put("timel", details3);
		testData.put("ticketrate", details4);
		data.add(testData);
		myModel.put("data", data);
		return new ModelAndView("detail", "model", myModel);

	}

}
