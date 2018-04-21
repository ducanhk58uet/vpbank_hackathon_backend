package com.stadio.controllers.web;

import com.stadio.controllers.BaseController;
import com.stadio.documents.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping(value = "/{customerId}")
    public String profile(@PathVariable String customerId,
                          Map<String, Object> model) {
        Customer customer = customerRepository.findByCustomerId(customerId);
        if (customer == null) {
            return "redirect:/customer";
        }
        initCommonProfile(model, customer);
        model.put("tab", "home");
        return "customer-details";
    }

    @GetMapping(value = "/{customerId}/task")
    public String task(@PathVariable String customerId,
                       Map<String, Object> model) {
        Customer customer = customerRepository.findByCustomerId(customerId);
        if (customer == null) {
            return "redirect:/customer";
        }
        initCommonProfile(model, customer);
        model.put("tab", "task");
        return "customer-details";
    }

    @GetMapping(value = "/{customerId}/friends")
    public String friends(@PathVariable String customerId,
                       Map<String, Object> model) {
        Customer customer = customerRepository.findByCustomerId(customerId);
        if (customer == null) {
            return "redirect:/customer";
        }
        initCommonProfile(model, customer);
        model.put("tab", "friends");

        return "customer-details";
    }

    @GetMapping(value = "/{customerId}/invite")
    public String invite(@PathVariable String customerId,
                          Map<String, Object> model) {
        Customer customer = customerRepository.findByCustomerId(customerId);
        if (customer == null) {
            return "redirect:/customer";
        }
        initCommonProfile(model, customer);
        model.put("tab", "invite");

        return "customer-details";
    }

    @GetMapping(value = "/{customerId}/help")
    public String help(@PathVariable String customerId,
                          Map<String, Object> model) {
        Customer customer = customerRepository.findByCustomerId(customerId);
        if (customer == null) {
            return "redirect:/customer";
        }
        initCommonProfile(model, customer);
        model.put("tab", "help");

        return "customer-details";
    }

    @GetMapping(value = "/{customerId}/settings")
    public String settings(@PathVariable String customerId,
                       Map<String, Object> model) {
        Customer customer = customerRepository.findByCustomerId(customerId);
        if (customer == null) {
            return "redirect:/customer";
        }
        initCommonProfile(model, customer);
        model.put("tab", "settings");

        return "customer-details";
    }

    @GetMapping(value = "/{customerId}/storage")
    public String storage(@PathVariable String customerId,
                           Map<String, Object> model) {
        Customer customer = customerRepository.findByCustomerId(customerId);
        if (customer == null) {
            return "redirect:/customer";
        }
        initCommonProfile(model, customer);
        model.put("tab", "storage");

        return "customer-details";
    }

    private void initCommonProfile(Map<String, Object> model, Customer customer) {
        int point = customer.getCreditCardTransactionsCount()
                + customer.getDebitCardTransactionsCount()
                + customer.getDepositsCount()
                + customer.getTelcoTopupsCount()
                + customer.getUtilityPaymentsCount()
                + customer.getWithdrawalCounts();

        customer.setPoint(point);

        model.put("customer", customer);
    }
}
