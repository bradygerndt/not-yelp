package com.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
	
	private BigDecimal RestId;
	private String FoodName;
	private BigDecimal Price;

	public Order() {

	}

	public Order(BigDecimal RestId, String FoodName, BigDecimal Price) {
		this.RestId = RestId;
		this.FoodName = FoodName;
		this.Price = Price;
	}


	public BigDecimal getRestId() {

		return this.RestId;
	}

	public void setRestId(BigDecimal restId) {
		this.RestId = restId;
	}

	public String getFoodName() {
		return this.FoodName;
	}

	public void setFoodName(String foodName) {
		this.FoodName = foodName;
	}

	public BigDecimal getPrice() {
		return this.Price;
	}

	public void setPrice(BigDecimal price) {
		this.Price = Price;
	}





}
