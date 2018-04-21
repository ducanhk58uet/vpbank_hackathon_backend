package com.stadio.controllers.ws;


import com.stadio.controllers.BaseController;
import com.stadio.model.ResponseObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/import")
public class RestImportController extends BaseController {

    @GetMapping(value = "/customer")
    public ResponseObject importCustomer() {
            //TODO - something here
        return ResponseObject.success(null);
    }

}
