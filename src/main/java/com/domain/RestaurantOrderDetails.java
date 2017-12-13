package com.domain;

import java.math.BigDecimal;
import java.util.Date;

public class RestaurantOrderDetails {

    private BigDecimal Ono;
    private String FoodName;
    private BigDecimal RestId;
    private BigDecimal Qty;


    public RestaurantOrderDetails(BigDecimal Ono, String FoodName, BigDecimal RestId, BigDecimal Qty) {
        this.Ono = Ono;
        this.FoodName = FoodName;
        this.RestId = RestId;
        this.Qty = Qty;

    }

    public BigDecimal getOno() {
        return Ono;
    }

    public void setOno(BigDecimal ono) {
        this.Ono = ono;
    }

    public String getFoodName() {
        return FoodName;
    }

    public void setFoodName(String foodName) {
        this.FoodName = foodName;
    }

    public BigDecimal getRestId() {
        return RestId;
    }

    public void setRestId(BigDecimal restId) {
        this.RestId = restId;
    }

    public BigDecimal getQty() {
        return Qty;
    }

    public void setQty(BigDecimal Qty) {
        this.Qty = Qty;
    }
}
