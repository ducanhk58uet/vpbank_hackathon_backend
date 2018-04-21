package com.stadio.repository;

import com.stadio.documents.Friends;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FriendsRepository extends MongoRepository<Friends, String> {
}
