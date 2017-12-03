package com.service;

import com.dao.CustomerDAO;
import com.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerService {
    public CustomerService() {

    }


    public Boolean checkCustomer(String email) {
        Customer cust;
        CustomerDAO custDao = new CustomerDAO();
        cust = custDao.checkCustomer(email);
        System.out.println(String.valueOf(cust));
        if(cust == null){
            return false;
        }
        else{
            return true;
        }
    }
}
