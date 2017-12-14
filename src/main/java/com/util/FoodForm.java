package com.util;

import com.domain.Order;

import java.util.List;

public class FoodForm {
    private List<Order> orders;

    public List<Order> getOrders(){
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
