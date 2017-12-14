package com.service;

import com.dao.RestaurantOrderDetailsDAO;
import com.domain.RestaurantOrderDetails;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RestaurantOrderDetailsService {

    public RestaurantOrderDetailsService() {

    }

    public Boolean insertOrderDetails(List<RestaurantOrderDetails> orderDetails) {
        RestaurantOrderDetailsDAO detailsDAO = new RestaurantOrderDetailsDAO();
        Boolean success;
        for (RestaurantOrderDetails detail : orderDetails) {
            success = detailsDAO.submitOrderDetails(detail);
            if(success == false){
                return false;
            }
        }
        return true;
    }
}

