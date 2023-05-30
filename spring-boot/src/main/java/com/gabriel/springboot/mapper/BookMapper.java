package com.gabriel.springboot.mapper;

import com.gabriel.springboot.data.vo.v1.BookVO;
import com.gabriel.springboot.model.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {
    BookVO entity2BookVO(Book book);
}
