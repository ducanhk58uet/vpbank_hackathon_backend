package com.stadio.repository;

import com.stadio.documents.Rank;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RankRepository extends MongoRepository<Rank, String> {
}
