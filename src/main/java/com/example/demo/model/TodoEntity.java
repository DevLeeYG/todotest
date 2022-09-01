package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TodoEntity {

    private String id;
    private String userId;
    private String title;


}
