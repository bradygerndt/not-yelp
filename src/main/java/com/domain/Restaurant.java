package com.domain;

import java.math.BigDecimal;

public class Restaurant {
	


	private BigDecimal restid;
	private String rname;
	private String phone;
	private String email;
	private String hours;
	private String diningtype;
	private BigDecimal streetno;
	private String streetname;
	private String city;
	private String state;
	private BigDecimal zip;
	private String pricerange;
	private String deliveryflag;
	private String outdoorseating;
	
	public Restaurant() {
		
	}

	public Restaurant (BigDecimal restid, String rname, String phone, String email, String hours, String diningtype, BigDecimal streetno, String streetname, String city, String state, BigDecimal zip, String pricerange, String deliveryflag, String outdoorseating ) {
		super();
		this.restid = restid;
		this.rname = rname;
		this.phone = phone;
		this.email = email;
		this.hours = hours;
		this.diningtype = diningtype;
		this.streetno = streetno;
		this.streetname = streetname;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.pricerange = pricerange;
		this.deliveryflag = deliveryflag;
		this.outdoorseating = outdoorseating;
	}

	public BigDecimal getRestid() {
		return restid;
	}

	public void setRestid(BigDecimal restid) {
		this.restid = restid;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHours() {
		return hours;
	}

	public void setHours(String hours) {
		this.hours = hours;
	}

	public String getDiningtype() {
		return diningtype;
	}

	public void setDiningtype(String diningtype) {
		this.diningtype = diningtype;
	}

	public BigDecimal getStreetno() {
		return streetno;
	}

	public void setStreetno(BigDecimal streetno) {
		this.streetno = streetno;
	}

	public String getStreetname() {
		return streetname;
	}

	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public BigDecimal getZip() {
		return zip;
	}

	public void setZip(BigDecimal zip) {
		this.zip = zip;
	}

	public String getPricerange() {
		return pricerange;
	}

	public void setPricerange(String pricerange) {
		this.pricerange = pricerange;
	}

	public String getDeliveryflag() {
		return deliveryflag;
	}

	public void setDeliveryflag(String deliveryflag) {
		this.deliveryflag = deliveryflag;
	}

	public String getOutdoorseating() {
		return outdoorseating;
	}

	public void setOutdoorseating(String outdoorseating) {
		this.outdoorseating = outdoorseating;
	}

}
