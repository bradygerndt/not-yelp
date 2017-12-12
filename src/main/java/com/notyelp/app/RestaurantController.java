package com.notyelp.app;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.domain.Customer;
import com.domain.Review;
import com.service.ReviewService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.domain.Restaurant;
import com.service.RestaurantService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
@SessionAttributes("customer")
public class RestaurantController {

    private static final Logger logger = LoggerFactory.getLogger(RestaurantController.class);


    @RequestMapping(value= "/restaurants")
    public String restaurants(Model model, @ModelAttribute("customer")Customer customer, HttpSession session) {
        logger.info("Arrived at restaurants page");

        model.addAttribute("customer", customer);


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
//
//    @ExceptionHandler(Exception.class)
//    public ModelAndView handleError(HttpServletRequest req, Exception ex) {
//        logger.error("Request: " + req.getRequestURL() + " raised " + ex);
//
//        ModelAndView mav = new ModelAndView();
//        //mav.addObject("exception", ex);
//        //mav.addObject("url", req.getRequestURL());
//        mav.addObject("notification", "Looks like you've been logged out.");
//        mav.addObject("customer", new Customer());
//
//        mav.setViewName("/login");
//        return mav;
//    }

}
