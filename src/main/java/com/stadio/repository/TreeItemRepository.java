package com.stadio.repository;

import com.stadio.documents.TreeItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TreeItemRepository extends MongoRepository<TreeItem, String> {

}
