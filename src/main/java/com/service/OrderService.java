package com.service;

import com.dao.OrderDAO;
import com.domain.Order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderService {

    public OrderService() {

    }
    public List<Order> getMenuById(BigDecimal RestId) {
        List<Order> orderList = new ArrayList<Order>();
        OrderDAO orderDao = new OrderDAO();
        orderList = orderDao.getMenuById(RestId);
        return orderList;
    }
}
