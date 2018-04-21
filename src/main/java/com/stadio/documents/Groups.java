package com.stadio.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "group")
@Data
public class Groups {
    @Id
    private String id;

    @Field(value = "group_name")
    private String group_name;

    @Field(value = "owner")
    private String owner; //ref: customerId

    @Field(value = "created_date")
    private Date createdDate;

    @Field(value = "updated_date")
    private Date updatedDate;
}
