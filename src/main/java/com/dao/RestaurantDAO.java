package com.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.domain.Restaurant;
import com.util.ConnectionFactory;

public class RestaurantDAO {
	public RestaurantDAO() {
		
	}


	public List<Restaurant> getRestaurants() {
	    SqlSession session = new ConnectionFactory().getSqlSessionFactory().openSession();
	    List<Restaurant> restList = new ArrayList<Restaurant>();
	
	    try{
	        restList = session.selectList("com.mapper.RestaurantMapper.selectAllRestaurants");
	    }
	    finally {
	        session.close();
	    }
	    return restList;
	}
	
	public Restaurant getRestaurantById(BigDecimal restid) {
		SqlSession session = new ConnectionFactory().getSqlSessionFactory().openSession();
		
		Restaurant rest = new Restaurant();
		
		try {
			 rest = session.selectOne("com.mapper.RestaurantMapper.selectRestaurantById", restid);
		}
		finally {
			session.close();
		}
		
		return rest;
		
	}
}