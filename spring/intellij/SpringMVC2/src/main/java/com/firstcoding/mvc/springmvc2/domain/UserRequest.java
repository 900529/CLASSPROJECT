package com.firstcoding.mvc.springmvc2.domain;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class UserRequest {
    private LocalDate date;

}
