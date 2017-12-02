package com.notyelp.app;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.domain.Restaurant;
import com.service.RestaurantService;

import javax.servlet.http.HttpSession;


@Controller
public class RestaurantController {

    private static final Logger logger = LoggerFactory.getLogger(RestaurantController.class);


    @RequestMapping(value= "/restaurants")
    public String restaurants(Model model, HttpSession session) {
        logger.info("Arrived at restaurants page");
        logger.info(session.getId());

        List<Restaurant> restList = new ArrayList<Restaurant>();
        RestaurantService restService = new RestaurantService();
        restList = restService.getRestList();
        model.addAttribute("restaurants", restList);

        return "restaurants";

    }

    @RequestMapping("/restaurant/{id}")
    public String restaurant(@PathVariable BigDecimal id, Model model){
        logger.info("Arrived at restaurant view. The ID is " + id);

        RestaurantService restService = new RestaurantService();
        Restaurant currentRest = restService.getRestById(id);

        if(currentRest != null) {
            model.addAttribute("restaurant", currentRest);
        }
        else {
            model.addAttribute("restaurant.restname","Restaurant not found");
        }

        return "restaurant";
    }

}
