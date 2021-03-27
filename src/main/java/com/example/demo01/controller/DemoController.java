package com.example.demo01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demo")
    public String demo()

    {
        return " this is jenkins+docker+github Test  version=1";
    }

}
