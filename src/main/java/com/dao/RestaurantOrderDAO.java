package com.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.domain.RestaurantOrder;
import com.util.ConnectionFactory;

public class RestaurantOrderDAO {
    public RestaurantOrderDAO() {

    }


    public BigDecimal submitOrder(RestaurantOrder restOrder) {
        SqlSession session = new ConnectionFactory().getSqlSessionFactory().openSession();
        List<RestaurantOrder> restOrderList = new ArrayList<RestaurantOrder>();
        int success;
        BigDecimal id;


        try{
            session.insert("com.mapper.RestaurantOrderMapper.submitOrder", restOrder);
            session.commit();

            //id = session.selectOne("com.mapper.RestaurantOrderMapper.getLastId");

        }
        finally {
            session.close();
        }

        return BigDecimal.valueOf(1);
    }
}