package com.bluemapletach.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluemapletach.app.Dao.ReservationStatusDaoInterface;
import com.bluemapletach.app.model.ReservationStatusDetail;

@Service
public class ReservationStatusServiceImp implements ReservationStatusInterface {
	@Autowired
	ReservationStatusDaoInterface dao;

	public ReservationStatusDetail reservationStatus(ReservationStatusDetail details) {
		return dao.reservationStatus(details);
	}

}
