package com.bluemapletach.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluemapletach.app.Dao.TimingDaoInterface;
import com.bluemapletach.app.model.TimeDetails;

@Service
public class TimingService implements TimingServiceInterface {
	@Autowired
	TimingDaoInterface dao;

	public TimeDetails movieTime(TimeDetails timeDetails) {
		return dao.movieTime(timeDetails);
	}

}
