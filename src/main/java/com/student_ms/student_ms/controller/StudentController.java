package com.student_ms.student_ms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/student")
public class StudentController {


    @GetMapping("/greetings")
    public String greet() {
        return "Hello there from Student controller";
    }

    @GetMapping("/bye")
    public String goodBye() {
        return "Good bye from Student controller";

    }

    @GetMapping("/Hello")
    public String hello() {
        return "Hey";

    }

    @GetMapping("/place")
    public String place(){
        return "USA";
    }

}