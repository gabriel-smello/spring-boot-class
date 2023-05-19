package com.gabriel.springboot.mapper;

import com.gabriel.springboot.data.vo.v1.PersonVO;
import com.gabriel.springboot.model.Person;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PersonMapper {
    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    PersonVO entity2PersonVO(Person person);
}
