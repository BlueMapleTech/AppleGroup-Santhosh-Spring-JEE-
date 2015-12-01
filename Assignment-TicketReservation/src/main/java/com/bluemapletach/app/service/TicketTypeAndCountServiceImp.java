package com.bluemapletach.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluemapletach.app.Dao.TicketTypeAndCountDaoInterface;
import com.bluemapletach.app.model.TicketCountDetails;

@Service
public class TicketTypeAndCountServiceImp implements TicketTypeAndCountServiceInterface {
	@Autowired
	TicketTypeAndCountDaoInterface dao;

	public TicketCountDetails ticketTypeCount(TicketCountDetails ticketDetails) {
		return dao.ticketTypeCount(ticketDetails);
	}
}
