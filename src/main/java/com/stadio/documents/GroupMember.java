package com.stadio.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@Document(collection = "group_member")
public class GroupMember {

    @Id
    private String id;

    @Field(value = "group_id")
    private String groupId;

    @Field(value = "customer_id")
    private String customerId;

    @Field(value = "join_time")
    private Date joinTime;
}
