package com.stadio.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "task_complete")
@Data
public class TaskComplete {

    @Id
    private String id;

    @Field(value = "customer_id")
    private String customerId;

    @Field(value = "task_id")
    private String taskId;

    @Field(value = "completed_time")
    private Date completedTime;

    @Field(value = "status")
    private int status;

    @Field(value = "created_date")
    private Date createdDate;

    @Field(value = "updated_date")
    private Date updatedDate;
}
