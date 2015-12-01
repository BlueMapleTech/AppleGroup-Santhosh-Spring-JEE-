package com.bluemapletach.app.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ReservationStatusDetail {
	private String createddate;
	private String updateddate;
	private String createdby;
	private String updatedby;
	private String name = "santhosh";
	private int reservation_status_id;
	private String reservation_status;
	Date today = Calendar.getInstance().getTime();
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-hh.mm.ss");
	private String date = formatter.format(today);

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
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

	public int getReservation_status_id() {
		return reservation_status_id;
	}

	public void setReservation_status_id(int reservation_status_id) {
		this.reservation_status_id = reservation_status_id;
	}

	public String getReservation_status() {
		return reservation_status;
	}

	public void setReservation_status(String reservation_status) {
		this.reservation_status = reservation_status;
	}

	@Override
	public String toString() {
		return "ReservationStatusDetail [createddate=" + createddate + ", updateddate=" + updateddate + ", createdby="
				+ createdby + ", updatedby=" + updatedby + ", reservation_status_id=" + reservation_status_id
				+ ", reservation_status=" + reservation_status + "]";
	}

}
