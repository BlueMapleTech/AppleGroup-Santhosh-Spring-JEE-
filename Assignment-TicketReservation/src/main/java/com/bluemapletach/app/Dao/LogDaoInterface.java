package com.bluemapletach.app.Dao;

import java.util.List;

import com.bluemapletach.app.model.MovieDetail;
import com.bluemapletach.app.model.ReservationStatusDetail;
import com.bluemapletach.app.model.TicketCountDetails;
import com.bluemapletach.app.model.TicketRateDetails;
import com.bluemapletach.app.model.TimeDetails;
import com.bluemapletach.app.model.UserDetails;

public interface LogDaoInterface {
	public List<MovieDetail> listOfmovie();
	List<ReservationStatusDetail> listOfStatus();
	public List<TicketCountDetails> listOfTicketTypeAndCount();
	public List<TimeDetails> timeList();
	public List<TicketRateDetails> rateList();

}
