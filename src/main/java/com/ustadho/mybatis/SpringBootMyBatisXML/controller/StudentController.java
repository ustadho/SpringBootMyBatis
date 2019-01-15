package com.ustadho.mybatis.SpringBootMyBatisXML.controller;

import com.ustadho.mybatis.SpringBootMyBatisXML.domain.Student;
import com.ustadho.mybatis.SpringBootMyBatisXML.mapper.StudentMapper;
import org.apache.ibatis.mapping.ResultMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/students")
public class StudentController {
    private final StudentMapper studentMapper;

    public StudentController(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @GetMapping("")
    public List<ResultMap> findAllStudents(){
        return studentMapper.findAllObject();
    }

    @GetMapping("{id}")
    public Student findAllStudents(@PathVariable int id){
        return studentMapper.findOne(id);
    }

}
