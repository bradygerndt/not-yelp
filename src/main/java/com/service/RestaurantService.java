package com.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.dao.RestaurantDAO;
import com.domain.Restaurant;

public class RestaurantService {

	public RestaurantService() {
	
	}
	public List<Restaurant> getRestList(){
		List<Restaurant> restList = new ArrayList<Restaurant>();
		RestaurantDAO restDao = new RestaurantDAO();
		restList = restDao.getRestaurants();
		return restList;
	}
	
	public Restaurant getRestById(BigDecimal restid) {
		Restaurant rest = new Restaurant();
		RestaurantDAO restDao = new RestaurantDAO();
		rest = restDao.getRestaurantById(restid);
		
		return rest;
	}

}
