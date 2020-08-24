package com.yancy.testWebsocket.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Data
public class User {
    @Id
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
}
