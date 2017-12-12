package com.dao;

import com.domain.Order;
import com.util.ConnectionFactory;
import org.apache.ibatis.session.SqlSession;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderDAO {
    public OrderDAO() {

    }

    public List<Order> getMenuById(BigDecimal RestId) {
        SqlSession session = new ConnectionFactory().getSqlSessionFactory().openSession();
        List<Order> orderList = new ArrayList<Order>();

        try{
            orderList = session.selectList("com.mapper.RestaurantMapper.selectMenuById",RestId);
        }
        finally {
            session.close();
        }
        return orderList;


    }
}
