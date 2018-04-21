package com.stadio.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "task")
@Data
public class Task {

    @Id
    private String id;

    @Field(value = "name")
    private String name;

    @Field(value = "description")
    private String description;

    @Field(value = "expire")
    private Date expire;

    @Field(value = "created_date")
    private Date createdDate;

    @Field(value = "updated_date")
    private Date updatedDate;

    @Field(value = "exp")
    private int exp;

    @Field(value = "bonus")
    private int bonus;
}
