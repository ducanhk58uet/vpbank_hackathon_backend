package com.stadio.controllers.ws;

import com.stadio.controllers.BaseController;
import com.stadio.documents.Customer;
import com.stadio.model.ResponseObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/customer")
public class RestCustomerController extends BaseController {

    @GetMapping()
    public ResponseObject simple() {
        return ResponseObject.success(null);
    }

    @GetMapping(value = "/profile/")
    public ResponseObject getUserProfile(@RequestParam(value = "id") String id) {
        Customer customer = customerRepository.findByCustomerId(id);
        return ResponseObject.success(customer);
    }
}
