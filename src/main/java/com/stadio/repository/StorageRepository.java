package com.stadio.repository;

import com.stadio.documents.Storage;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StorageRepository extends MongoRepository<Storage, String> {

}
