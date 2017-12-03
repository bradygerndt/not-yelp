package com.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
	
	private BigDecimal ono;
	private Date orderdate;
	private String custemail;
	private String dineinflag;
	private String deliveryflag;
	private String pickupflag;
	private Date pickupdate;
	private Date deliverydate;
	private Date receiveddate;
	
	
	public Order() {
		
	}


	public BigDecimal getOno() {
		return ono;
	}


	public void setOno(BigDecimal ono) {
		this.ono = ono;
	}


	public Date getOrderdate() {
		return orderdate;
	}


	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}


	public String getCustemail() {
		return custemail;
	}


	public void setCustemail(String custemail) {
		this.custemail = custemail;
	}


	public String getDineinflag() {
		return dineinflag;
	}


	public void setDineinflag(String dineinflag) {
		this.dineinflag = dineinflag;
	}


	public String getDeliveryflag() {
		return deliveryflag;
	}


	public void setDeliveryflag(String deliveryflag) {
		this.deliveryflag = deliveryflag;
	}


	public String getPickupflag() {
		return pickupflag;
	}


	public void setPickupflag(String pickupflag) {
		this.pickupflag = pickupflag;
	}


	public Date getPickupdate() {
		return pickupdate;
	}


	public void setPickupdate(Date pickupdate) {
		this.pickupdate = pickupdate;
	}


	public Date getDeliverydate() {
		return deliverydate;
	}


	public void setDeliverydate(Date deliverydate) {
		this.deliverydate = deliverydate;
	}


	public Date getReceiveddate() {
		return receiveddate;
	}


	public void setReceiveddate(Date receiveddate) {
		this.receiveddate = receiveddate;
	}
	
	

}
