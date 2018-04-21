package com.stadio.repository;

import com.stadio.documents.Device;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeviceRepository extends MongoRepository<Device, String> {

}
