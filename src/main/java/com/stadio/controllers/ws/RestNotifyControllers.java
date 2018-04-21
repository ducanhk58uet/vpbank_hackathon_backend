package com.stadio.controllers.ws;

import com.stadio.controllers.BaseController;
import com.stadio.documents.Device;
import com.stadio.documents.Notification;
import com.stadio.model.ResponseObject;
import com.stadio.services.PushNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "api/notify")
public class RestNotifyControllers extends BaseController {

    @Autowired
    PushNotificationService pushNotificationService;

    @RequestMapping(value = "/register", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseObject register(
            @RequestParam(value = "deviceId") String deviceId,
            @RequestParam(value = "deviceToken") String deviceToken) {

        Device device = Device.newInstance(deviceId, deviceToken);
        deviceRepository.save(device);

        return ResponseObject.success(device);
    }

    @GetMapping(value = "/push")
    public ResponseObject push() {
        List<String> deviceList = deviceRepository.findAll()
                .stream()
                .map(x -> x.getDeviceToken())
                .collect(Collectors.toList());
        pushNotificationService.sendPushNotification(deviceList, new Notification("Create new transaction", "User 00001 has new transaction"));
        return ResponseObject.success(null);
    }

}
