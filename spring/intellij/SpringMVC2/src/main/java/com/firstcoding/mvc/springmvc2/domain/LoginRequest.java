package com.firstcoding.mvc.springmvc2.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class LoginRequest {

    private String uid;
    private String pw;


}
