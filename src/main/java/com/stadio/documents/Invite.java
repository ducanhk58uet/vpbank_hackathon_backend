package com.stadio.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "invite")
@Data
public class Invite {

    @Id
    private String id;

    @Field(value = "customer_id")
    private String customerId;

    @Field(value = "customer_invite_id")
    private String customerInviteId;

    @Field(value = "invite_time")
    private Date inviteTime;
}
