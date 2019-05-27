package io.github.bael.unit8.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExamController {

    @RequestMapping("/exams")
    public String getExamList() {
        return "hello world";
    }
}
