package com.bluemapletach.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluemapletach.app.Dao.LogDaoInterface;
import com.bluemapletach.app.model.MovieDetail;
import com.bluemapletach.app.model.ReservationStatusDetail;
import com.bluemapletach.app.model.TicketCountDetails;
import com.bluemapletach.app.model.TicketRateDetails;
import com.bluemapletach.app.model.TimeDetails;
import com.bluemapletach.app.model.UserDetails;
@Service
public class LogServiceImp implements LogServiceInterface {
@Autowired
	LogDaoInterface dao;
		public List<MovieDetail> listOfmovie()
	{
		System.out.println("service");
		return dao.listOfmovie();
	}
	
	public List<ReservationStatusDetail> listOfStatus()
	{
		return dao.listOfStatus();
	}
	public List<TicketCountDetails> listOfTicketTypeAndCount()
	{
		return dao.listOfTicketTypeAndCount();
	}
	public List<TimeDetails> timeList()
	{
		return dao.timeList();
	}
	public List<TicketRateDetails> rateList()
	{
		return dao.rateList();
	}
}
