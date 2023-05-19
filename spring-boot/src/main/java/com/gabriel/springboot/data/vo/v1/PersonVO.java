package com.gabriel.springboot.data.vo.v1;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class PersonVO {

    private Long id;
    private String firstName;
    private String lastName;
    private String addressName;
    private String gender;
}
