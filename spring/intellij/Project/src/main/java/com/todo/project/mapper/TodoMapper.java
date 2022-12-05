package com.todo.project.mapper;
import com.todo.project.domain.TodoDTO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.sql.Connection;
import java.util.List;

@Mapper
public interface TodoMapper {

    @Select("select*from tbl_todo where writer = #{idx}")
    List<TodoDTO> selectAll(int idx);

    @Select("select * from tbl_todo where tno=#{tno}")
    public TodoDTO selectByTno(long tno);

    int insertToDo(TodoDTO dto);

    int updateTodo(TodoDTO dto);

    @Delete("delete from tbl_todo where tno=#{tno}")
    int deleteTodo(long dto);
}
