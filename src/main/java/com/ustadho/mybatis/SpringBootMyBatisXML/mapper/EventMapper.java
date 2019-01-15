package com.ustadho.mybatis.SpringBootMyBatisXML.mapper;

import com.ustadho.mybatis.SpringBootMyBatisXML.domain.Event;

import javax.validation.constraints.Max;
import java.util.List;

public interface EventMapper {
    public List<Event> findAll();
    public void insert(Event event);
}
