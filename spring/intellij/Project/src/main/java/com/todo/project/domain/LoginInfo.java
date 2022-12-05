package com.todo.project.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class LoginInfo {

    private int idx;
    private String uid;
    private String uname;
    private String uphoto;


}
