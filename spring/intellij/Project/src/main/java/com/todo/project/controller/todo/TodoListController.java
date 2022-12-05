package com.todo.project.controller.todo;

import com.todo.project.domain.LoginInfo;
import com.todo.project.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class TodoListController {

    private final TodoService todoService;

    public TodoListController(TodoService todoService) {
        this.todoService = todoService;
    }


    @RequestMapping("/todo/list")
    public String getTodoList(Model model, HttpSession session){

        if(session.isNew() || session.getAttribute("loginInfo") == null){
            return "redirect:/login";
        }

        int memberIdx = ((LoginInfo) session.getAttribute("loginInfo")).getIdx();

        model.addAttribute("todoList", todoService.getTodoList(memberIdx));
        return "todo/list";
    }
}