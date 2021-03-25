package com.jooq.r2dbc_jooq.model.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ProductPojo {

    private long id;
    private String name;
    private LocalDateTime timestamp;

}
