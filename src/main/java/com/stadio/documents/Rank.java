package com.stadio.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "rank")
@Data
public class Rank {

    @Id
    private String id;

    @Field(value = "name")
    private String name;

    @Field(value = "image_url")
    private String imageUrl;

    @Field(value = "type")
    private String type;

    @Field(value = "description")
    private String description;

    @Field(value = "condition")
    private String condition;


}
