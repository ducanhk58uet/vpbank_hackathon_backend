package com.stadio.controllers.ws;

import com.stadio.controllers.BaseController;
import com.stadio.documents.Customer;
import com.stadio.model.ResponseObject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/customer")
public class RestCustomerController extends BaseController {

    @GetMapping()
    public ResponseObject simple() {
        return ResponseObject.success(null);
    }

    @GetMapping(value = "/profile")
    public ResponseObject profile(@RequestParam(value = "id") String id) {
        Customer customer = customerRepository.findByCustomerId(id);
        return ResponseObject.success(customer);
    }

    @PostMapping(value = "/login")
    public ResponseObject login(@RequestParam(value = "username") String username,
                                @RequestParam(value = "password") String password) {
        return ResponseObject.success(null);
    }

    @GetMapping(value = "/logout")
    public ResponseObject logout() {
        return ResponseObject.success(null);
    }

    @PostMapping(value = "/update")
    public ResponseObject update(@RequestParam(value = "phone") String phone,
                                 @RequestParam(value = "fullname") String fullname,
                                 @RequestParam(value = "email") String email,
                                 @RequestParam(value = "birthday") String birthday) {
        return ResponseObject.success(null);
    }

    @PostMapping(value = "/changePassword")
    public ResponseObject changePassword(@RequestParam(value = "oldPassword") String oldPassword,
                                 @RequestParam(value = "newPassword") String newPassword) {
        return ResponseObject.success(null);
    }

    @PostMapping(value = "/resetPassword")
    public ResponseObject resetPassword(@RequestParam(value = "email") String email) {
        return ResponseObject.success(null);
    }

}
