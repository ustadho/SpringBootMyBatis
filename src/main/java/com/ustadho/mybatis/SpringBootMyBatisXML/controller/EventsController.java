package com.ustadho.mybatis.SpringBootMyBatisXML.controller;

import com.ustadho.mybatis.SpringBootMyBatisXML.domain.Event;
import com.ustadho.mybatis.SpringBootMyBatisXML.mapper.EventMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventsController {
    private final EventMapper eventMapper;

    public EventsController(EventMapper em){
        this.eventMapper = em;
    }

    @GetMapping("")
    public List<Event> findAll(){
        return eventMapper.findAll();
    }

}
