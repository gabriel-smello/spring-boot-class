package com.gabriel.springboot.mapper;

import com.gabriel.springboot.data.vo.v1.PersonVO;
import com.gabriel.springboot.model.Person;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    PersonVO entity2PersonVO(Person person);
}
