package com.notyelp.app;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.domain.Customer;
import com.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.domain.Restaurant;
import com.service.RestaurantService;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import javax.swing.*;

/**
 * Handles requests for the application home page.
 */
@Controller
@SessionAttributes("customer")
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpSession session, Model model) {

        model.addAttribute("customer", new Customer());
        ;
		String entryPage;


		if(session.getAttribute("customer") == null)
		{
			entryPage = "login";
		}
		else
		{
		    ;
			entryPage = "home";
		}

		return entryPage;
	}

    @RequestMapping(value = "doLogin", method = RequestMethod.POST)
	public String doLogin(@ModelAttribute("customer")Customer customer, Model model, RedirectAttributes redirectAttributes, HttpSession session) {
		logger.info("Login Information : " + customer.getEmail() + ", " + customer.getPassword());
		String address;

		CustomerService cs = new CustomerService();
		Customer user = cs.getCustomer(customer.getEmail());
		if (user != null) {
			session.setAttribute("customer", user);
            redirectAttributes.addFlashAttribute("customer", user);
			address = "redirect:restaurants";
		} else {

			address = "login";
			model.addAttribute("notification", "Incorrect email or password.");
		}
		return address;
	}

	@RequestMapping(value = "register", method = RequestMethod.GET)
	public String register(@ModelAttribute("customer")Customer customer, Model model) {
		logger.info("On registration page");

		return "register";
	}

	@RequestMapping(value = "doRegister", method = RequestMethod.POST)
	public String doRegister(@ModelAttribute("customer")Customer customer, BindingResult bindingResult, Model model) {
        logger.info("in create user");
		String address;

        if (bindingResult.hasErrors()) {
            System.out.println("Error on registration page");
            model.addAttribute("notification", "There was an error registering your account.");
            return "register";
        }

		CustomerService cs = new CustomerService();

        if(cs.getCustomer(customer.getEmail()) != null) {
            address = "register";
            model.addAttribute("notification", "This email is already registered in our system.");
        }
        else {

            Boolean result = cs.registerNewUser(customer);
            if (result) {
                address = "login";
                model.addAttribute("notification", "You've successfully registered. Please log in with your username and password");
            } else {

                address = "register";
                model.addAttribute("notification", "There was an issue registering your account.");
            }
            model.addAttribute("customer", new Customer());
        }

        return address;
	}
}
