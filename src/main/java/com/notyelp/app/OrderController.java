package com.notyelp.app;

import com.domain.Customer;
import com.domain.Order;
import com.domain.RestaurantOrder;
import com.domain.RestaurantOrderDetails;
import com.service.OrderService;
import com.service.RestaurantOrderDetailsService;
import com.service.RestaurantOrderService;
import com.util.FoodForm;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.math.BigDecimal;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.net.httpserver.HttpsServerImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
@SessionAttributes("customer")
public class OrderController {

    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    @RequestMapping("/menu/{id}")
    public String restaurant(@PathVariable BigDecimal id, Model model){
        logger.info("Arrived at Menu Page " + id);

        OrderService orderService = new OrderService();
        List<Order> orders = new ArrayList<Order>();
        orders = orderService.getMenuById(id);

        FoodForm foodForm = new FoodForm();
        foodForm.setOrders(orders);

        //model.addAttribute("menu",orders);
        model.addAttribute("foodform", foodForm);

        return "menu";
    }

        @RequestMapping(value = "/doOrder", method = RequestMethod.POST)
        public String doReview(@ModelAttribute("foodform") FoodForm foodform, @ModelAttribute("customer") Customer customer, Model model, HttpSession session, HttpServletRequest request)
        {
            logger.info("Submitted order");
            RestaurantOrderService restOservice = new RestaurantOrderService();
            RestaurantOrder restOrder = new RestaurantOrder();
            logger.info(request.getParameter("pickup"));

            if(request.getParameter("pickup").equals("on")){
                restOrder.setOrderPickUpFlag("Y");
                restOrder.setOrderDeliveryFlag("N");
            }
            else {
                restOrder.setOrderDeliveryFlag("Y");
                restOrder.setOrderPickUpFlag("N");
            }

            restOrder.setCustEmail(customer.getEmail());

            BigDecimal ono = restOservice.submitOrder(restOrder);

            logger.info("Ono is " + String.valueOf(ono));


        return "/";
    }


}
