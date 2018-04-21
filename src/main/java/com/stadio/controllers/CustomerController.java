package com.stadio.controllers;

import com.stadio.documents.Customer;
import com.stadio.model.ResponseObject;
import com.stadio.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/customer")
public class CustomerController extends BaseController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping()
    public ResponseObject simple() {
        return ResponseObject.success(null);
    }

    @GetMapping(value = "/profile/")
    public ResponseObject getUserProfile(@RequestParam(value = "id") long id) {
        Customer customer = customerRepository.findByCustomerId(id);
        return ResponseObject.success(customer);
    }
}
