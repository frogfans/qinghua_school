package com.bigrabbit.qinghua_school.entity;

import lombok.Data;

import java.util.Date;
@Data
public class News {
    private Integer nid;

    private String title;

    private Date time;

    private String url;


}