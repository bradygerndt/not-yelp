package com.domain;

import java.math.BigDecimal;
import java.util.Date;

public class RestaurantOrder {

    private BigDecimal Ono;
    private String CustEmail;
    private String OrderDineInFlag;
    private String OrderDeliveryFlag;
    private String OrderPickUpFlag;


    public RestaurantOrder(BigDecimal Ono, String CustEmail, String OrderDineInFlag, String OrderDeliveryFlag, String OrderPickUpFlag) {
        this.Ono = Ono;
        this.CustEmail = CustEmail;
        this.OrderDineInFlag = OrderDineInFlag;
        this.OrderDeliveryFlag = OrderDeliveryFlag;
        this.OrderPickUpFlag = OrderPickUpFlag;
    }


    public BigDecimal getOno() {
        return Ono;
    }

    public void setOno(BigDecimal ono) {
        this.Ono = ono;
    }

    public String getCustEmail() {
        return CustEmail;
    }

    public void setCustEmail(String custEmail) {
        this.CustEmail = custEmail;
    }

    public String getOrderDineInFlag() {
        return OrderDineInFlag;
    }

    public void setOrderDineInFlag(String orderDineInFlag) {
        this.OrderDineInFlag = orderDineInFlag;
    }

    public String getOrderDeliveryFlag() {
        return OrderDeliveryFlag;
    }

    public void setOrderDeliveryFlag(String orderDeliveryFlag) {
        this.OrderDeliveryFlag = orderDeliveryFlag;
    }

    public String getOrderPickUpFlag() {
        return OrderPickUpFlag;
    }

    public void setOrderPickUpFlag(String orderPickUpFlag) {
        this.OrderPickUpFlag = orderPickUpFlag;
    }
}
