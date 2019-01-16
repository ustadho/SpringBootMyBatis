package com.ustadho.mybatis.SpringBootMyBatisXML.mapper;

import com.ustadho.mybatis.SpringBootMyBatisXML.domain.Program;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProgramMapper {
    @Select("select * from program")
    public List<Program> findAll();
}
