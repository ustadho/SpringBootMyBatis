package com.ustadho.mybatis.SpringBootMyBatisXML.mapper;

import com.ustadho.mybatis.SpringBootMyBatisXML.domain.Program;
import com.ustadho.mybatis.SpringBootMyBatisXML.domain.Student;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.ResultMap;

import java.util.List;

public interface StudentMapper {
    public List<ResultMap> findAllObject();

    @Select("select * from student where id=#{id}")
    @Results(value = {
        @Result(column = "program_id", property = "program", javaType = Program.class, one = @One(select = "getProgram"))
    })
    public Student findOne(int id);

    @Select("SELECT * FROM program WHERE id= #{id}")
    Program getProgram(@Param("id") int id);
}
