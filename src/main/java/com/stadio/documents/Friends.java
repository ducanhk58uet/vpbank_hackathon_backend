package com.stadio.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "friends")
@Data
public class Friends {

    @Id
    private String id;

    @Field(value = "customer_id")
    private String customerId;

    @Field(value = "customer_friend_id")
    private String customerFriendId;

    @Field(value = "point")
    private int point;

    @Field(value = "created_date")
    private Date createdDate;

    @Field(value = "updated_date")
    private Date updatedDate;
}
