package com.gabriel.springboot.data.vo.v1;

import lombok.*;

import java.util.Date;
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookVO {

    private Long id;
    private String author;
    private Date launchDate;
    private Double price;
    private String title;
}
