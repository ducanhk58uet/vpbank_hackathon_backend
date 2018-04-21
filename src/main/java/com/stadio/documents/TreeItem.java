package com.stadio.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "tree_item")
@Data
public class TreeItem {
    @Id
    private String id;

    @Field(value = "tree_id")
    private String treeId;

    @Field(value = "level")
    private int level;

    @Field(value = "exp_up")
    private int exUp;

    @Field(value = "image_url")
    private String imageUrl;

}
