package com.domain;

import java.math.BigDecimal;
import java.util.Date;

public class RestaurantOrder {

    private BigDecimal Ono;
    private String CustEmail;
    private String OrderDineInFlag;
    private String OrderDeliveryFlag;
    private String OrderPickUpFlag;

    public RestaurantOrder(){

    }

    public BigDecimal getOno() {
        return Ono;
    }

    public void setOno(BigDecimal ono) {
        Ono = ono;
    }

    public String getCustEmail() {
        return CustEmail;
    }

    public void setCustEmail(String custEmail) {
        CustEmail = custEmail;
    }

    public String getOrderDineInFlag() {
        return OrderDineInFlag;
    }

    public void setOrderDineInFlag(String orderDineInFlag) {
        OrderDineInFlag = orderDineInFlag;
    }

    public String getOrderDeliveryFlag() {
        return OrderDeliveryFlag;
    }

    public void setOrderDeliveryFlag(String orderDeliveryFlag) {
        OrderDeliveryFlag = orderDeliveryFlag;
    }

    public String getOrderPickUpFlag() {
        return OrderPickUpFlag;
    }

    public void setOrderPickUpFlag(String orderPickUpFlag) {
        OrderPickUpFlag = orderPickUpFlag;
    }
}
