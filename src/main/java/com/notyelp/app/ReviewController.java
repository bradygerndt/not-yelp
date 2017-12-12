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
public class ReviewController {

    private static final Logger logger = LoggerFactory.getLogger(RestaurantController.class);

    @RequestMapping("/reviews/{id}")
    public String reviews(@PathVariable BigDecimal id, Model model) {
        logger.info("Arrived at restaurant review page. The ID is " + id);

        RestaurantService restService = new RestaurantService();
        Restaurant currentRest = restService.getRestById(id);
        ReviewService revService = new ReviewService();

        List<Review> revList = new ArrayList<Review>();
        revList = revService.getReviewsByRestID(id);


        if(currentRest != null) {
            model.addAttribute("restaurant", currentRest);
            model.addAttribute("reviews", revList);
        }
        else {
            model.addAttribute("restaurant.restname","Restaurant not found");
        }

        return "reviews";
    }

    // review controllers

    @RequestMapping(value = "/review/{id}", method = RequestMethod.GET)
    public String review(@PathVariable BigDecimal id, Model model, HttpServletRequest request){
        logger.info("Arrived at restaurant review page. The ID is " + id);

        Review review = new Review();

        RestaurantService restService = new RestaurantService();
        Restaurant currentRest = restService.getRestById(id);
        model.addAttribute("restaurant", currentRest);
        model.addAttribute("review", review);

        review.setRestid(id);

        return "review";
    }

    @RequestMapping(value = "/doReview", method = RequestMethod.POST)
    public String doReview(@ModelAttribute("review") Review review, @ModelAttribute("customer") Customer customer, Model model, HttpSession session)
    {
        logger.info("Submitted review");

        //fix hidden field - pass restid in session

        review.setCustemail(customer.getEmail());
        logger.info(customer.getEmail() + review.getRestid() + review.getReviewtitle() + review.getReviewdesc() + review.getRating());


        String address;

        ReviewService revService = new ReviewService();
        Boolean success = revService.submitReview(review);

        if (success) {
            //address = "reviews/" + review.getRestid();
            address = "redirect:/reviews/" + review.getRestid();
            model.addAttribute("notification", "success");
        } else {

            address = "review/" + review.getRestid();
            model.addAttribute("notification", "There was an issue submitting your review.");
        }

        return address;
    }

    @ExceptionHandler(Exception.class)
    public ModelAndView handleError(HttpServletRequest req, Exception ex) {
        logger.error("Request: " + req.getRequestURL() + " raised " + ex);

        ModelAndView mav = new ModelAndView();
        //mav.addObject("exception", ex);
        //mav.addObject("url", req.getRequestURL());
        mav.addObject("notification", "Looks like you've been logged out.");
        mav.addObject("customer", new Customer());

        mav.setViewName("/login");
        return mav;
    }

}

