package com.stadio.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "storage")
@Data
public class Storage {
    @Id
    private String id;
    private String customerId;
    private String giftId;
    private String quantity;
    private Date createdDate;
    private Date updatedDate;
}
