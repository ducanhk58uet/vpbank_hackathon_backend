package com.stadio.repository;

import com.stadio.documents.TaskByCustomer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskByCustomerRepository extends MongoRepository<TaskByCustomer, String> {
}
