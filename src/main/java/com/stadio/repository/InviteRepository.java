package com.stadio.repository;

import com.stadio.documents.Invite;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InviteRepository extends MongoRepository<Invite, String> {
}
