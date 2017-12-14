package com.dao;

import com.domain.Restaurant;
import com.domain.RestaurantOrderDetails;
import com.util.ConnectionFactory;
import org.apache.ibatis.session.SqlSession;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RestaurantOrderDetailsDAO {

    public Boolean submitOrderDetails(RestaurantOrderDetails orderDetails) {
        SqlSession session = new ConnectionFactory().getSqlSessionFactory().openSession();

        int success;

        try {
            success = session.insert("com.mapper.RestaurantOrderDetailsMapper.insertOrder", orderDetails);
        } finally {
            session.close();
        }

        if (success > 0) {
            return true;
        }
        else{
            return false;
        }
    }
}

