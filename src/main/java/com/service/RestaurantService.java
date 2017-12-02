package com.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.dao.RestaurantDAO;
import com.domain.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;

public class RestaurantService {

	@Autowired
	RestaurantDAO restDao;

	public RestaurantService() {
	
	}
	public List<Restaurant> getRestList(){
		List<Restaurant> restList = new ArrayList<Restaurant>();;
		restList = restDao.getRestaurants();
		return restList;
	}
	
	public Restaurant getRestById(BigDecimal restid) {
		Restaurant rest = new Restaurant();
		rest = restDao.getRestaurantById(restid);
		
		return rest;
	}

}
