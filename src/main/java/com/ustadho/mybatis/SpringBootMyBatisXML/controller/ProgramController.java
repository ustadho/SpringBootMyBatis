package com.ustadho.mybatis.SpringBootMyBatisXML.controller;

import com.ustadho.mybatis.SpringBootMyBatisXML.domain.Program;
import com.ustadho.mybatis.SpringBootMyBatisXML.mapper.ProgramMapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/programs")

public class ProgramController {
    private final ProgramMapper programMapper;

    public ProgramController(ProgramMapper programMapper) {
        this.programMapper = programMapper;
    }

    @GetMapping("")
    public List<Program> findAll(){
        return programMapper.findAll();
    }

}
