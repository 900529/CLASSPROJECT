package com.firstcoding.mvc.springmvc.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/login")
@Log4j2
public class LoginController {

    @RequestMapping(method =  RequestMethod.GET)
    public String getLoginForm() {
        return "login/form"; // /WEB-INF/views/login/form.jsp
    }

    //@RequestMapping(method = RequestMethod.POST)
    @PostMapping
    public String login(
            String uid,
            String pw,
            String p,
            @RequestParam(value = "p", defaultValue = "1") String page,
            HttpServletRequest request
            ) {

        String uId2 = request.getParameter("uid");
        String pw2 = request.getParameter("pw");

        log.info("uid=> " +uid);
        log.info("pw=>" +pw);
        log.info("p=>" +p);
        log.info("p=>" +page);
        log.info("uid=>" +uId2);
        log.info("pw=>" +pw2);

            return "login/login";
        }

    @GetMapping("/info")   // http://localhost:8080/login/info
    public String info() {
        return "login/info";

    }

    }


