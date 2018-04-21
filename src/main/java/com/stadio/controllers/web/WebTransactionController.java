package com.stadio.controllers.web;

import com.stadio.controllers.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "transaction")
public class WebTransactionController extends BaseController {

    @GetMapping()
    public String form() {

        return "transaction-form";
    }
}
