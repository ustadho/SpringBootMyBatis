package com.ustadho.mybatis.SpringBootMyBatisXML.domain;

import lombok.Data;

@Data
public class Student {
    private int id;
    private String studentNo;
    private String name;
    private Program program;
}
