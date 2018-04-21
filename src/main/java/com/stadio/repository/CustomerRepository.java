package com.stadio.repository;

import com.stadio.documents.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    Customer findByCustomerId(long customerId);

}
