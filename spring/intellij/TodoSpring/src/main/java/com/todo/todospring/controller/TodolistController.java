package com.todo.todospring.controller;

import com.todo.todospring.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodolistController {

    @Autowired
    private final TodoService todoService;

    public TodolistController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("/todo/list")
    public String getTodoLIst() {

        todoService.test();
        return "todo/list";

    }

}
