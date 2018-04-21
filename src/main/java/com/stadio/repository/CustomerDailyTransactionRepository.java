package com.stadio.repository;

import com.stadio.documents.CustomerDailyTransaction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerDailyTransactionRepository extends MongoRepository<CustomerDailyTransaction, String> {
}
