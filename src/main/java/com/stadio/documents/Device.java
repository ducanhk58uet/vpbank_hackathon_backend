package com.stadio.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "device")
@Data
public class Device {

    @Id
    private String id;

    @Field(value = "device_id")
    private String deviceId;

    @Field(value = "device_token")
    private String deviceToken;

    public static Device newInstance(String deviceId, String deviceToken) {
        Device device = new Device();
        device.setDeviceId(deviceId);
        device.setDeviceToken(deviceToken);
        return device;
    }
}

