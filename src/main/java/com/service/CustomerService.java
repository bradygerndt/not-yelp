package com.service;

import com.dao.CustomerDAO;
import com.domain.Customer;


public class CustomerService {

    public CustomerService() {

    }

    public Boolean checkCustomer(String email) {

        Customer cust;
        CustomerDAO custDAO = new CustomerDAO();

        cust = custDAO.checkCustomer(email);

        if(cust == null){
            return false;
        }
        else{
            return true;
        }
    }

    public Boolean registerNewUser(Customer customer) {
        CustomerDAO custDAO = new CustomerDAO();

        Boolean result = custDAO.register(customer);
        return result;
    }
}
