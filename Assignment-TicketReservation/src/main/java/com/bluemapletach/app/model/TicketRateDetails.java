package com.bluemapletach.app.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TicketRateDetails {
	private String name="santhosh";
	private String createddate;
	private String updateddate;
	private String createdby;
	private String updatedby;
	private int ticket_rate_id;
	private int ticket_type_ticket_type_id;
	private int movie_movie_id;
	private int ticket_rate;
	private String movie;
	private String ticket_type;
	

public String getTicket_type() {
		return ticket_type;
	}

	public void setTicket_type(String ticket_type) {
		this.ticket_type = ticket_type;
	}

public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

public int getTicket_rate() {
		return ticket_rate;
	}

	public void setTicket_rate(int ticket_rate) {
		this.ticket_rate = ticket_rate;
	}

public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getTicket_rate_id() {
		return ticket_rate_id;
	}

	public void setTicket_rate_id(int ticket_rate_id) {
		this.ticket_rate_id = ticket_rate_id;
	}

	public int getTicket_type_ticket_type_id() {
		return ticket_type_ticket_type_id;
	}

	public void setTicket_type_ticket_type_id(int ticket_type_ticket_type_id) {
		this.ticket_type_ticket_type_id = ticket_type_ticket_type_id;
	}

	public int getMovie_movie_id() {
		return movie_movie_id;
	}

	public void setMovie_movie_id(int movie_movie_id) {
		this.movie_movie_id = movie_movie_id;
	}

Date today = Calendar.getInstance().getTime();
SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-hh.mm.ss");
private String date = formatter.format(today);

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

@Override
public String toString() {
	return "TicketRateDetails [ticket_rate_id=" + ticket_rate_id + ", ticket_type_ticket_type_id="
			+ ticket_type_ticket_type_id + ", movie_movie_id=" + movie_movie_id + ", ticket_rate=" + ticket_rate + "]";
}

}
