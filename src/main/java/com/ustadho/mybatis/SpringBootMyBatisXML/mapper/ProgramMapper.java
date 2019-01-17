package com.ustadho.mybatis.SpringBootMyBatisXML.mapper;

import com.ustadho.mybatis.SpringBootMyBatisXML.domain.Program;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ProgramMapper {
    @Select("select * from program")
    public List<Program> findAll();

    @Select("select * from program where id=#{id}")
    Program findOne(Integer id);

    @Update("update program set name=#{program.name} where id=#{id}")
    public int update(Integer id, Program program);

    @Insert("insert into program(id, name) values(#{id}, #{name})")
    int insert(Program p);
}
