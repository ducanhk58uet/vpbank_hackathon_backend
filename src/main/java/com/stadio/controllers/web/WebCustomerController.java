package com.stadio.controllers.web;

import com.stadio.controllers.BaseController;
import com.stadio.documents.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "customer")
public class WebCustomerController extends BaseController {

    @GetMapping()
    public String list(Map<String, Object> model) {
        List<Customer> customerList = customerRepository.findAll();

        for (Customer customer: customerList) {
            int point = customer.getCreditCardTransactionsCount()
                + customer.getDebitCardTransactionsCount()
                + customer.getDepositsCount()
                + customer.getTelcoTopupsCount()
                + customer.getUtilityPaymentsCount()
                + customer.getWithdrawalCounts();

            customer.setPoint(point);
        }

        model.put("customerList", customerList);
        return "customer-list";
    }
}
