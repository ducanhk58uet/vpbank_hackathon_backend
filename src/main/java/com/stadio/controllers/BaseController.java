package com.stadio.controllers;


import com.stadio.repository.CustomerRepository;
import com.stadio.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseController {

    @Autowired
    protected DeviceRepository deviceRepository;

    @Autowired
    protected CustomerRepository customerRepository;
}
