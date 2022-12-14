package com.todo.project.dao;

import com.todo.project.domain.Member;

import java.sql.Connection;
import java.sql.SQLException;

public interface MemberDao {

    int insertMember(Connection conn, Member member) throws SQLException;

    Member selectByIdPw(Connection conn, String uid, String pw) throws SQLException;
}

