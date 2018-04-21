package com.stadio.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "tree")
@Data
public class Tree {

    @Id
    private String id;

    @Field(value = "name")
    private String name;

    @Field(value = "description")
    private String description;

    @Field(value = "rank_id")
    private String rankId;

    @Field(value = "thumbnail_url")
    private String thumbnailUrl;

    @Field(value = "created_date")
    private Date createdDate;

    @Field(value = "updated_date")
    private Date updatedDate;

    @Field(value = "max_level")
    private int maxLevel;

    @Field(value = "max_exp")
    private int maxExp;
}
