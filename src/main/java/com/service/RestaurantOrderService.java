package com.service;

import com.dao.RestaurantOrderDAO;
import com.domain.RestaurantOrder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RestaurantOrderService {


    public BigDecimal submitOrder(RestaurantOrder restaurantOrder) {
        RestaurantOrderDAO restaurantOrderDAO = new RestaurantOrderDAO();

        BigDecimal result = restaurantOrderDAO.submitOrder(restaurantOrder);

        return result;
    }
}
