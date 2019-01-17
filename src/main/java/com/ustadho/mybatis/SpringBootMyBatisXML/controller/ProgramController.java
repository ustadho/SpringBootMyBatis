package com.ustadho.mybatis.SpringBootMyBatisXML.controller;

import com.ustadho.mybatis.SpringBootMyBatisXML.domain.Program;
import com.ustadho.mybatis.SpringBootMyBatisXML.mapper.ProgramMapper;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("{id}")
    public  Program findOne(@PathVariable Integer id){
        return programMapper.findOne(id);
    }

    @PutMapping("{id}")
    public int update(@RequestBody Program program, @PathVariable Integer id){
        return programMapper.update(id, program);
    }

    @PostMapping
    public int insert(@RequestBody Program p ){
        return programMapper.insert(p);
    }
}
