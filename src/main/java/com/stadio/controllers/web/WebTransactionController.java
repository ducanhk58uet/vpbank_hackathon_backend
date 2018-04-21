package com.stadio.controllers.web;

import com.stadio.controllers.BaseController;
import com.stadio.documents.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "transaction")
public class WebTransactionController extends BaseController {

    @GetMapping("/form")
    public String form(Map<String, Object> model) {
        List<Customer> customerList = customerRepository.findAll();
        model.put("customerList", customerList);
        return "transaction-form";
    }


    @PostMapping("/form")
    public String create(@RequestParam(value = "customer") String customerId,
                         @RequestParam(value = "point") int point) {
        System.out.println("customer_id: " + customerId + ", point: " + point);
        return "redirect:/transaction/form";
    }

}
