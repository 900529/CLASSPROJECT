package com.todo.project.controller.login;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpSession;

@Controller
public class LogoutController {

    @GetMapping ("/logout")
    public String logout(
            HttpSession httpSession
    ) {
        httpSession.invalidate();
        return "redirect:/index.jsp";
    }

}