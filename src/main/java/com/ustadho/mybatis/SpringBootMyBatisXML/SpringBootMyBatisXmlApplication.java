package com.ustadho.mybatis.SpringBootMyBatisXML;

import com.ustadho.mybatis.SpringBootMyBatisXML.domain.Event;
import com.ustadho.mybatis.SpringBootMyBatisXML.domain.Student;
import com.ustadho.mybatis.SpringBootMyBatisXML.mapper.EventMapper;
import com.ustadho.mybatis.SpringBootMyBatisXML.mapper.StudentMapper;
import org.apache.ibatis.mapping.ResultMap;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@MapperScan("com.ustadho.mybatis.SpringBootMyBatisXML.mapper")
@RestController
public class SpringBootMyBatisXmlApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMyBatisXmlApplication.class, args);
	}
}

