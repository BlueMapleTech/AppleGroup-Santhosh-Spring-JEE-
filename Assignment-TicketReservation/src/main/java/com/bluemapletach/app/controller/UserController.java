package com.bluemapletach.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bluemapletach.app.model.UserDetails;
//import com.bluemapletach.app.service.ServiceInterface;
import com.bluemapletach.app.service.UserServiceInterface;

@Controller
public class UserController {
	@Autowired
	UserServiceInterface service;

	/*
	 * 
	 * 
	 * 
	 */
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public ModelAndView registration() {
		System.out.println("Registration");
		ModelAndView model = new ModelAndView();
		model.setViewName("insert");
		return model;

	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView insert(@ModelAttribute UserDetails userDetails) {
		System.out.println("insert Controller");
		service.insert(userDetails);
		String msg = "Registration sucessfully Completed";
		return new ModelAndView("home", "msg", msg);

	}

	@RequestMapping(value = "/loging", method = RequestMethod.POST)
	public ModelAndView checklog(@RequestParam("username") String name, @RequestParam("password") String pass)
			throws Exception {

		UserDetails userDetails = new UserDetails();
		userDetails.setUsername(name);
		userDetails.setPassword(pass);
		service.checklog(userDetails);
		String msg = userDetails.getMsg();
		if (msg.equals("adminrole")) {

			return new ModelAndView("detail1", "name", name);

		} else if (msg.equals("userrole")) {

		} else if (msg.equals("invalid")) {
			String msg1 = "username and password does not matched";
			return new ModelAndView("home", "msg", msg1);
		} else {

		}

		return null;

	}

}
