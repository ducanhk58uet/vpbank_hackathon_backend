package com.stadio.repository;

import com.stadio.documents.Groups;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GroupRepository extends MongoRepository<Groups, String> {
}
