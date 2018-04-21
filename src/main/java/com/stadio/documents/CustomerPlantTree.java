package com.stadio.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "customer_plant_tree")
@Data
public class CustomerPlantTree {

    @Id
    private String id;

    @Field(value = "customer_id")
    private String customerId;

    @Field(value = "tree_id")
    private String treeId;

    @Field(value = "created_dated")
    private Date createdDate;

    @Field(value = "updated_date")
    private Date updatedDate;


}
