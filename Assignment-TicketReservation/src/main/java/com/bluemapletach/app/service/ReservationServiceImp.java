package com.bluemapletach.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluemapletach.app.Dao.MovieHasTimingDaoInterface;
import com.bluemapletach.app.Dao.ReservationdaoInterface;
import com.bluemapletach.app.Dao.TimingDaoInterface;
import com.bluemapletach.app.model.MovieHasTimingDetail;
import com.bluemapletach.app.model.ReservationDetail;
import com.bluemapletach.app.model.TimeDetails;
@Service
public class ReservationServiceImp implements ReservationServiceInterface{
	@Autowired
	MovieHasTimingDaoInterface dao;
	@Autowired
	TimingDaoInterface dao1;
	@Autowired
	ReservationdaoInterface dao2;
	
	public List<MovieHasTimingDetail> listOfMovieTiming(MovieHasTimingDetail timing)
	{
		
		
		return dao.listOfMovieTiming(timing);
		
		
	}
	public String getTiming(TimeDetails detail)

	{
		return dao1.getTiming(detail);
	}
	public void insertReservationDetail(ReservationDetail detail)
	
	{
		dao2.insertReservationDetail(detail);
	}

}
