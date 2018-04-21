package com.stadio.repository;

import com.stadio.documents.TaskByRank;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskByRankRepository extends MongoRepository<TaskByRank, String> {

}
