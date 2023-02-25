package com.example.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("pc")
    public String project_Career(){
        return "pc";
    }

    @GetMapping("tc")
    public String technology_Stack(){
        return "tc";
    }

    @GetMapping("review")
    public String review(){
        return "review";
    }
}
