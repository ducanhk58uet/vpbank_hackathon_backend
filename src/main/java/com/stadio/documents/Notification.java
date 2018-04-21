package com.stadio.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@Document(collection = "tab_notification")
public class Notification {
    @Id
    private String id;

    @Field(value = "title")
    private String title;

    @Field(value = "message")
    private String message;

    @Field(value = "created_date")
    private Date createdDate;

    @Field(value = "updated_date")
    private Date updatedDate;

    public Notification(String title, String message){
        this.createdDate = new Date();
        this.updatedDate = new Date();
    }
}
