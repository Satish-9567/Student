package com.example.temp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    private StudentService studentService;
    @PostMapping("add-name")
    public void addName(String name){
        studentService.addName(name);
    }
    @PostMapping("add-age")
    public void addAge(int age){
        studentService.addAge(age);
    }
    @PostMapping("add-rno")
    public void addRno(int rno){
        studentService.addRno(rno);
    }
    @PostMapping("add-email")
    public void addEmail(String email){
        studentService.addEmail(email);
    }
}
