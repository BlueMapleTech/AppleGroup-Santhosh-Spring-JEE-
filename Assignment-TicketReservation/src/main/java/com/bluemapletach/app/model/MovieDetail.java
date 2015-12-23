package com.bluemapletach.app.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MovieDetail {

	private String name = "santhosh";
	private String moviename;
	private String release_date;
	private String no_of_show;
	private int movie_id;
	private String createddate;
	private String updateddate;
	private String createdby;
	private String updatedby;
	private String count[];
	private String ticket_rate;
	private String ticket_rate1;
	private int timingid;
	private int tickettypeid;
    private Date date1;
    private int id;
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTicket_rate1() {
		return ticket_rate1;
	}

	public void setTicket_rate1(String ticket_rate1) {
		this.ticket_rate1 = ticket_rate1;
	}

	public Date getDate1() {
		return date1;
	}

	public void setDate1(Date date1) {
		this.date1 = date1;
	}

	public int getTickettypeid() {
		return tickettypeid;
	}

	public void setTickettypeid(int tickettypeid) {
		this.tickettypeid = tickettypeid;
	}

	public int getTimingid() {
		return timingid;
	}

	public void setTimingid(int timingid) {
		this.timingid = timingid;
	}

	public String getTicket_rate() {
		return ticket_rate;
	}

	public void setTicket_rate(String ticket_rate) {
		this.ticket_rate = ticket_rate;
	}

	public String[] getCount() {
		return count;
	}

	public void setCount(String[] count) {
		this.count = count;
	}

	public int getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
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

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public String getRelease_date() {
		return release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	public String getNo_of_show() {
		return no_of_show;
	}

	public void setNo_of_show(String no_of_show) {
		this.no_of_show = no_of_show;
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
		return "MovieDetail [moviename=" + moviename + ", release_date=" + release_date + ", no_of_show=" + no_of_show
				+ ", movie_id=" + movie_id + ", createddate=" + createddate + ", updateddate=" + updateddate
				+ ", createdby=" + createdby + ", updatedby=" + updatedby + "]";
	}

}
