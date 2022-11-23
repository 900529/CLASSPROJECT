package com.firstcoding.mvc.springmvc2.controller;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Log4j2
public class SampleController {

    @RequestMapping("/sample")
    public ModelAndView getSamplePage() {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("sample"); // => /WEB-INF/views/sample.jsp

        return mav;
    }

    @RequestMapping("/sample2")
    public String getStringPage() {

        log.info("kkk");
        return "sample2";  // /WEB-INF/views/sample2.jsp
    }

    @RequestMapping("/sample3")
    public void getVoidPage() {
    }

}
