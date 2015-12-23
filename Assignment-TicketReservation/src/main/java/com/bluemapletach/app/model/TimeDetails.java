package com.bluemapletach.app.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeDetails {
	private String timing;
		private int timing_id;
		

	public String getTiming() {
			return timing;
		}

		public void setTiming(String timing) {
			this.timing = timing;
		}

	public int getTiming_id() {
		return timing_id;
	}

	public void setTiming_id(int timing_id) {
		this.timing_id = timing_id;
	}

	@Override
	public String toString() {
		return "TimeDetails [timing=" + timing + ", timing_id=" + timing_id + "]";
	}

	
	
}
