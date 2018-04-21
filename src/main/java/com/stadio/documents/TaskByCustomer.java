package com.stadio.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "task_by_customer")
@Data
public class TaskByCustomer {

    @Id
    private String id;

    @Field(value = "task_id")
    private String taskId;

    @Field(value = "condition")
    private String condition;


}
