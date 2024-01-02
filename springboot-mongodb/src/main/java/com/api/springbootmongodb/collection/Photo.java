package com.api.springbootmongodb.collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Data;

@Data
@Document(collation = "photo")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Photo {

    @Id
    private String id;
    private String title;
    // private Binary photo;
}
