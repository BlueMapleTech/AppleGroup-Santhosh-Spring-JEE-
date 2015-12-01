package com.bluemapletach.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluemapletach.app.Dao.TicketRateDaoInterface;
import com.bluemapletach.app.model.TicketRateDetails;
@Service
public class TicketRateServiceImp implements TicketRateServiceInterface {
	@Autowired
	TicketRateDaoInterface dao;
	 public TicketRateDetails ticketRateInsert(TicketRateDetails rateDetail) {
       return dao.ticketRateInsert(rateDetail);
	}
}
