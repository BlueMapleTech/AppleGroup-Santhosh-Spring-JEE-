package com.bluemapletach.app.service;

import java.util.List;

import com.bluemapletach.app.model.MovieHasTimingDetail;
import com.bluemapletach.app.model.ReservationDetail;
import com.bluemapletach.app.model.TimeDetails;

public interface ReservationServiceInterface {

	
	List<MovieHasTimingDetail> listOfMovieTiming(MovieHasTimingDetail timing);

	String getTiming(TimeDetails detail);

	void insertReservationDetail(ReservationDetail detail);

}
