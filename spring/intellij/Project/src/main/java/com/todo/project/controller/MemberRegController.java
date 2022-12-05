package com.todo.project.controller;

import com.todo.project.domain.MemberRegRequest;
import com.todo.project.service.MemberRegService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Log4j2
@Controller
@RequestMapping("/member/register")
public class MemberRegController {

    @Autowired
    private MemberRegService regService;

    @GetMapping
    public String getRegForm(){

        return "member/regForm";
    }

    @PostMapping
    public String reg(
            @Valid MemberRegRequest regRequest,
            BindingResult bindingResult,
            HttpServletRequest request
    ) throws Exception {

        if (bindingResult.hasErrors()) {
            log.info(bindingResult.getAllErrors());
            return "redirect:/member/register";
        }

        log.info(regRequest);
        regService.memberReg(regRequest, request);

        return "redirect:/index.jsp";
    }
}
