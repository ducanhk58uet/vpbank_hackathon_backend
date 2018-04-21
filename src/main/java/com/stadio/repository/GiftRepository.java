package com.stadio.repository;

import com.stadio.documents.Gift;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GiftRepository extends MongoRepository<Gift, String> {

}
