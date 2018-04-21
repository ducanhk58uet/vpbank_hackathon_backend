package com.stadio.controllers.web;

import com.stadio.controllers.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping(value = "customer")
public class WebCustomerController extends BaseController {

    @GetMapping()
    public String welcome(Map<String, Object> model) {
        model.put("message", "Hello");
        return "welcome";
    }
}
