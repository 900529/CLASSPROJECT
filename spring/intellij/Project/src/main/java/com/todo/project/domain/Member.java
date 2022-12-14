package com.todo.project.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Member {

    private int idx;
    private String uid;
    private String pw;
    private String uuid;
    private String uname;
    private String uphoto;

    public LoginInfo toLoginInfo() {
        return LoginInfo.builder()
                .idx(this.idx)
                .uid(this.uid)
                .uname(this.uname)
                .uphoto(this.uphoto)
                .build();

    }

}
