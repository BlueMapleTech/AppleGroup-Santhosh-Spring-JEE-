package com.bluemapletach.app.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TicketCountDetails {
	private int ticket_type_id;
	private String ticket_type;
	private String ticket_count;
	public int getTicket_type_id() {
		return ticket_type_id;
	}
	public void setTicket_type_id(int ticket_type_id) {
		this.ticket_type_id = ticket_type_id;
	}
	public String getTicket_type() {
		return ticket_type;
	}
	public void setTicket_type(String ticket_type) {
		this.ticket_type = ticket_type;
	}
	public String getTicket_count() {
		return ticket_count;
	}
	public void setTicket_count(String ticket_count) {
		this.ticket_count = ticket_count;
	}
	@Override
	public String toString() {
		return "TicketCountDetails [ticket_type_id=" + ticket_type_id + ", ticket_type=" + ticket_type
				+ ", ticket_count=" + ticket_count + "]";
	}
	
	
	
	
}
