package com.stadio.controllers.ws;


import com.stadio.controllers.BaseController;
import com.stadio.documents.Customer;
import com.stadio.model.ResponseObject;
import org.apache.commons.io.FileUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/import")
public class RestImportController extends BaseController {

    private SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");

    @GetMapping(value = "/customer")
    public ResponseObject importCustomer() {
        List<Customer> customerList = initCustomer();
        return ResponseObject.success(customerList);
    }

    public List<Customer> initCustomer() {

        List<Customer> results = new ArrayList<>();

        try {
            File f = new ClassPathResource("imports/customers.csv").getFile();
            List<String> lines = FileUtils.readLines(f, "UTF-8");

            for (int i = 1; i < lines.size(); i++) {
                String[] l = lines.get(i).split(",");
                if (l.length >= 12) {
                    Customer customer = new Customer(l[0], l[1],
                            fm.parse(l[2]),
                            Integer.parseInt(l[3]),
                            Integer.parseInt(l[4]),
                            Integer.parseInt(l[5]),
                            Integer.parseInt(l[6]),
                            Integer.parseInt(l[7]),
                            Integer.parseInt(l[8]),
                            Integer.parseInt(l[9]),
                            Integer.parseInt(l[10]),
                            Integer.parseInt(l[11]),
                            Integer.parseInt(l[12]));

                    customerRepository.save(customer);

                    results.add(customer);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return results;
    }

}
