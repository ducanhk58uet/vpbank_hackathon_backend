package com.stadio.controllers.ws;

import com.stadio.controllers.BaseController;
import com.stadio.documents.Device;
import com.stadio.model.ResponseObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/")
public class RestNotifyControllers extends BaseController {

    @PostMapping(value = "/register")
    public ResponseObject register(
            @RequestParam(value = "deviceId") String deviceId,
            @RequestParam(value = "deviceToken") String deviceToken) {

        Device device = Device.newInstance(deviceId, deviceToken);
        deviceRepository.save(device);

        return ResponseObject.success(device);
    }



}
