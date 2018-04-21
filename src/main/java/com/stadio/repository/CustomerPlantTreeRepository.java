package com.stadio.repository;

import com.stadio.documents.CustomerPlantTree;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerPlantTreeRepository extends MongoRepository<CustomerPlantTree, String> {
}
