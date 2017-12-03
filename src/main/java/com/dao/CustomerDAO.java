package com.dao;

import com.domain.Customer;
import com.util.ConnectionFactory;
import org.apache.ibatis.session.SqlSession;


public class CustomerDAO {
    public CustomerDAO() {
    }

    public Customer checkCustomer(String email) {
        SqlSession session = new ConnectionFactory().getSqlSessionFactory().openSession();
        Customer cust;

        try{
            cust = session.selectOne("com.mapper.CustomerMapper.checkCustomer", email);
        }
        finally {
            session.close();
        }
        return cust;
    }
}
