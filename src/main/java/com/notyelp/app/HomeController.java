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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.domain.Restaurant;
import com.service.RestaurantService;

import javax.servlet.http.HttpSession;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpSession session, Model model) {

		String entryPage;

		if(session.getAttribute("customer") == null)
		{
			entryPage = "login";
		}
		else
		{
			entryPage = "home";
		}
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return entryPage;
	}

    @RequestMapping(value = "doLogin", method = RequestMethod.POST)
    public String checkLogin(@ModelAttribute("customer")Customer customer, Model model) {
        logger.info("Login Information : " + customer.getEmail() + ", " + customer.getPassword());
        String address;
        CustomerService cs = new CustomerService();
        if (cs.checkCustomer(customer.getEmail(), customer.getPassword())) {
            address = "mainpage";
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect Username or Password!", "Error", JOptionPane.ERROR_MESSAGE);
            address = "home";
        }
        return address;
    }
}
