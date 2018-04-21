package com.stadio.repository;

import com.stadio.documents.GroupMember;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GroupMemberRepository extends MongoRepository<GroupMember, String> {
}
