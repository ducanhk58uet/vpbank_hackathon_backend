package com.stadio.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "task_by_rank")
@Data
public class TaskByRank {

    @Id
    private String id;

    @Field(value = "rank_id")
    private String rankId;

    @Field(value = "task_id")
    private String taskId;
}
