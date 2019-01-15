package com.ustadho.mybatis.SpringBootMyBatisXML.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Event {
    private long id;
    private String title;
    private String detail;
    private Date startDate;
    private Date endDate;
    private boolean isActive;

}
