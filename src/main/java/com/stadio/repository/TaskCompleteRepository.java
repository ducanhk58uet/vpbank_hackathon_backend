package com.stadio.repository;

import com.stadio.documents.TaskComplete;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskCompleteRepository extends MongoRepository<TaskComplete, String> {
}
