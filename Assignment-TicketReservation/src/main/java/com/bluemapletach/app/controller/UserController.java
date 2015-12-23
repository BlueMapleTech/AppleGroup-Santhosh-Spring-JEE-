package com.bluemapletach.app.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bluemapletach.app.model.MovieDetail;
import com.bluemapletach.app.model.UserDetails;
import com.bluemapletach.app.service.LogServiceInterface;
//import com.bluemapletach.app.service.ServiceInterface;
import com.bluemapletach.app.service.UserServiceInterface;

@Controller
public class UserController {
	@Autowired
	UserServiceInterface service;

	/**
	 * This method forwarding controller to the Registration page.
	 * 
	 * @author SanthoshPC
	 * @return ModelAndView object into view page
	 */

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public ModelAndView registration() {
		System.out.println("Registration");
		ModelAndView model = new ModelAndView();
		model.setViewName("insert");
		return model;

	}

	/**
	 * send the Model class object userDetails into UserServiceInterface
	 * @param userDetails
	 * @return home page
	 */

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView insert(@ModelAttribute UserDetails userDetails) {
		System.out.println("insert Controller");
		service.insert(userDetails);
		String msg = "Registration sucessfully Completed";
		return new ModelAndView("home", "msg", msg);

	}
	/**
	 * 
	 * @param name
	 * @param pass
	 * @return
	 * @throws Exception
	 */

	@RequestMapping(value = "/loging", method = RequestMethod.POST)
	public ModelAndView checklog(@RequestParam("username") String name, @RequestParam("password") String pass)
			throws Exception {

		UserDetails userDetails = new UserDetails();
		userDetails.setUsername(name);
		userDetails.setPassword(pass);
		service.checklog(userDetails);
		String msg = userDetails.getMsg();
		if (msg.equals("adminrole")) {
			ModelAndView model = new ModelAndView();
			model.setViewName("detail1");
			return model;

		} else if (msg.equals("userrole")) {

			return new ModelAndView("ReservationStatus", "name", name);
		} else if (msg.equals("invalid")) {
			String msg1 = "username and password does not matched";
			return new ModelAndView("home", "msg", msg1);
		} else {

		}

		return null;

	}

	@RequestMapping(value = "/statusbooking")
	public ModelAndView registration1(@RequestParam("name") String name, @RequestParam("id") int id1) {
		int id = service.findUserId(name);

		Date today = Calendar.getInstance().getTime();
		System.out.println(today);
		List<MovieDetail> details = service.movieList(id);
		ModelAndView model = new ModelAndView();
		model.addObject("details", details);
		model.addObject("id", id);
		model.addObject("statusid", id1);
		model.setViewName("listofmovie");

		return model;

	}
}