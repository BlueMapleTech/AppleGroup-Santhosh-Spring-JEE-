package com.bluemapletach.app.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TicketCountDetails {
	private int ticket_type_id;
	private String ticket_type;
	private int ticket_type_count;
	private String name = "santhosh";
	private String createddate;
	private String updateddate;
	private String createdby;
	private String updatedby;
	Date today = Calendar.getInstance().getTime();
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-hh.mm.ss");
	private String date = formatter.format(today);

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getTicket_type_id() {
		return ticket_type_id;
	}

	public void setTicket_type_id(int Ticket_type_id) {
		this.ticket_type_id = Ticket_type_id;
	}

	public String getTicket_type() {
		return ticket_type;
	}

	public void setTicket_type(String ticket_type) {
		this.ticket_type = ticket_type;
	}

	public int getTicket_type_count() {
		return ticket_type_count;
	}

	public void setTicket_type_count(int ticket_type_count) {
		this.ticket_type_count = ticket_type_count;
	}

	public String getCreateddate() {
		return createddate;
	}

	public void setCreateddate(String createddate) {
		this.createddate = createddate;
	}

	public String getUpdateddate() {
		return updateddate;
	}

	public void setUpdateddate(String updateddate) {
		this.updateddate = updateddate;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public String getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "TicketCountDetails [ticket_type_id=" + ticket_type_id + ", ticket_type=" + ticket_type
				+ ", ticket_type_count=" + ticket_type_count + ", createddate=" + createddate + ", updateddate="
				+ updateddate + ", createdby=" + createdby + ", updatedby=" + updatedby + "]";
	}

	

}
