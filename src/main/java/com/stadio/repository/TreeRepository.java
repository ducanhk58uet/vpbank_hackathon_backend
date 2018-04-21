package com.stadio.repository;

import com.stadio.documents.Tree;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TreeRepository extends MongoRepository<Tree, String> {
}
