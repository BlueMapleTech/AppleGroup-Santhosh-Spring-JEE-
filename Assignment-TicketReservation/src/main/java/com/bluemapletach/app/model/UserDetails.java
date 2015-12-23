package com.bluemapletach.app.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UserDetails {
	private int userid;
	private String username;
	private String password;
	private String email;
	private String firstname;
	private String lastname;
	private String address;
	private String createdby;
	private String updateby;
	private int roleid = 1;
	private int roleid1;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getRoleid1() {
		return roleid1;
	}

	public void setRoleid1(int roleid1) {
		this.roleid1 = roleid1;
	}

	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public String getUpdateby() {
		return updateby;
	}

	public void setUpdateby(String updateby) {
		this.updateby = updateby;
	}

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public Date getToday() {
		return today;
	}

	public void setToday(Date today) {
		this.today = today;
	}

	public SimpleDateFormat getFormatter() {
		return formatter;
	}

	public void setFormatter(SimpleDateFormat formatter) {
		this.formatter = formatter;
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

	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "UserDetails [userid=" + userid + ", username=" + username + ", password=" + password + ", email="
				+ email + ", firstname=" + firstname + ", lastname=" + lastname + ", address=" + address
				+ ", createdby=" + createdby + ", updateby=" + updateby + ", roleid=" + roleid + ", roleid1=" + roleid1
				+ ", date=" + date + ", msg=" + msg + "]";
	}

	
}
