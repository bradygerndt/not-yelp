package com.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Review {

	private BigDecimal reviewid;
	private String custemail;
	private BigDecimal restid;
	private String reviewtitle;
	private String reviewdescr;
	private Date reviewdate;
	private BigDecimal rating;
	
	
	public Review(BigDecimal reviewid, String custemail, BigDecimal restid, String reviewtitle, String reviewdescr, Date reviewdate, BigDecimal rating) {
		this.reviewid = reviewid;
		this.custemail = custemail;
		this.restid = restid;
		this.reviewtitle = reviewtitle;
		this.reviewdescr = reviewdescr;
		this.reviewdate = reviewdate;
		this.rating = rating;
	}


	public BigDecimal getReviewid() {
		return reviewid;
	}


	public void setReviewid(BigDecimal reviewid) {
		this.reviewid = reviewid;
	}


	public String getCustemail() {
		return custemail;
	}


	public void setCustemail(String custemail) {
		this.custemail = custemail;
	}


	public BigDecimal getRestid() {
		return restid;
	}


	public void setRestid(BigDecimal restid) {
		this.restid = restid;
	}


	public String getReviewtitle() {
		return reviewtitle;
	}


	public void setReviewtitle(String reviewtitle) {
		this.reviewtitle = reviewtitle;
	}


	public String getReviewdescr() {
		return reviewdescr;
	}


	public void setReviewdescr(String reviewdescr) {
		this.reviewdescr = reviewdescr;
	}


	public Date getReviewdate() {
		return reviewdate;
	}


	public void setReviewdate(Date reviewdate) {
		this.reviewdate = reviewdate;
	}


	public BigDecimal getRating() {
		return rating;
	}


	public void setRating(BigDecimal rating) {
		this.rating = rating;
	}
	

}
