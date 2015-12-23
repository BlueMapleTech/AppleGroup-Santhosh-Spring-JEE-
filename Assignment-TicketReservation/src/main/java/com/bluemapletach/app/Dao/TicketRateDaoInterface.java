package com.bluemapletach.app.Dao;

import com.bluemapletach.app.model.MovieDetail;
import com.bluemapletach.app.model.TicketRateDetails;

public interface TicketRateDaoInterface {

	TicketRateDetails ticketRateInsert(TicketRateDetails rateDetail);

	void insert(MovieDetail movie);

}
