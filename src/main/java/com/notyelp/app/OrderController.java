package com.notyelp.app;

import com.domain.Order;
import com.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.math.BigDecimal;
import java.util.ArrayList;

@Controller
public class OrderController {

    @RequestMapping("/menu/{id}")
    public String restaurant(@PathVariable BigDecimal id, Model model){
        logger.info("Arrived at Menu Page " + id);

        OrderService orderService = new OrderService();
        List<Order> orders = new ArrayList<Order>();
        orders = orderService.getMenuById(id);

        model.addAttribute("menu",orders);

        return "menu";
    }


}