package com.stadio.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "rank")
@Data
public class Rank {

    @Id
    private String id;

    //TODO
}
