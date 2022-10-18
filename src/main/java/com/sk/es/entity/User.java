package com.sk.es.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author sk
 * @time 2022/10/18
 * @desc say
 **/
@Data
@Document(indexName = "users")
public class User {

    @Id
    private Long id;
    private String username;
    private String password;
    private Integer age;

}
